public class ConsoleEventLoger implements EventLogger{

    public void logEvent(String message) {
        System.out.println(message);
    }
}
