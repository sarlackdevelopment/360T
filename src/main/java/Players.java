class Player {

    private MessageContainer messageContainer;

    public MessageContainer getMessageContainer() {
        return this.messageContainer;
    }

    public void setMessageContainer(MessageContainer messageContainer) {
        this.messageContainer = messageContainer;
    }

    public void sendMessage(Player receiver, String message) {
        if (receiver.messageContainer == null) {
            receiver.setMessageContainer(new MessageContainer(message, 0));
        } else {
            receiver.messageContainer.setMessage(message);
            receiver.messageContainer.setCounter(receiver.messageContainer.getCounter() + 1);
        }
    }

    public void receiveMessage() {
        this.messageContainer.setMessage(this.messageContainer.getMessage() + " " + this.messageContainer.getCounter());
    }
}
