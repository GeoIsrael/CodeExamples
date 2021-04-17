package di;

public class EmailServiceInjector implements MessageServiceInjector{

//    @Override
//    public Consumer getConsumer() {
//        return new MyDIApplication(new EmailServiceImpl());
//    }

    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new EmailServiceImpl());
        return app;
    }



}
