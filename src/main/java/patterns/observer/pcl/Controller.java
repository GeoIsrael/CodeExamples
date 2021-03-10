package patterns.observer.pcl;

//https://www.baeldung.com/java-observer-pattern

public class Controller {
    public static void main(String[] args) {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");

        System.out.println(observer.getNews());






    }



}
