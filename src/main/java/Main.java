public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.sendMessage(player2, "some");
        player1.sendMessage(player2, "some");
        player1.sendMessage(player2, "some");
        player1.sendMessage(player2, "some");
        player2.receiveMessage();
        System.out.println(player2.getMessageContainer().getMessage());
    }
}
