public class App {

    Client client;
    EventLogger logger;

    private void logEvent(String msg){
        String mess = msg.replaceAll(client.getId(), client.getFullName());
        logger.logEvent(mess);
    }
    public App(Client client, EventLogger logger){
        this.client = client;
        this.logger = logger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ApplicationContext("spring.xml");



        app.logEvent("Some event for user 1");

    }
}
