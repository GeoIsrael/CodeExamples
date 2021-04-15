package interview.blacklist;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.URL;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import lombok.extern.slf4j.Slf4j;

//import org.springframework.stereotype.Component;


/**

 * Simple service to allow blacklisting specific users (or general strings).

 *

 * Reads the list of users from a txt file served via http(s) allowing the list to be changed at runtime.

 */

@Slf4j

//@Component

public class UserBlacklistService {


    /**

     * Blacklist file (reachable via http/s). Each username on a new line.

     *

     * Configure as required. Including a default constructor fetching a random list from internet as example.

     */

    private final String usersBlacklistUrl;

    //for concurrent access
    private final List<String> blacklistedUsers = new CopyOnWriteArrayList<>();


    public UserBlacklistService(String usersBlacklistUrl) {
        this.usersBlacklistUrl = usersBlacklistUrl;
    }


    public UserBlacklistService() {
        this("https://raw.githubusercontent.com/danielmiessler/SecLists/master/Passwords/10_million_password_list_top_100.txt");

    }


    /**
     * Get list of users currently in the blacklist.
     */

    public List<String> getBlacklistedUsers() {
        return blacklistedUsers;
    }


    /**

     * Check if particular user is blacklisted.  //+

     */



    public boolean isUserBlacklisted(String username) {
        return blacklistedUsers.contains(username);
    }


    /**
     * Call this method to refresh blacklist contents.
     *
     * @throws IOException - thrown if refresh fails
     */

    public void refreshCache() throws IOException {
        URL url = new URL(usersBlacklistUrl);


        //need to clear before refresh
        blacklistedUsers.clear();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String entry;
            while ((entry = br.readLine()) != null) {
                blacklistedUsers.add(entry);
            }

            log.warn("Users blacklist refreshed");
        } catch (IOException exception) {
            log.warn("Failed to refresh users blacklist", exception);

        }

    }

}







