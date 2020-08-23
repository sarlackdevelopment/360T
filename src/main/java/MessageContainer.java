public class MessageContainer {

    private String message;
    private int counter;

    public MessageContainer(String message, int counter) {
        this.message = message;
        this.counter = counter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
