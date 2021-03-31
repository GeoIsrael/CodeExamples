package interview.blacklist;

import java.io.IOException;

public class BlackListController {
    public static void main(String[] args) throws IOException {

        UserBlacklistService userBlacklistService = new UserBlacklistService("https://www.mit.edu/~ecprice/wordlist.10000");

        userBlacklistService.refreshCache();

        System.out.println(userBlacklistService.isUserBlacklisted("ability"));

    }
}
