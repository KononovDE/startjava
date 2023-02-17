public class MyFirstGame {

    public static void main(String[] args) {

        int computerNum = 14, playerNum = 50;
        int max = 100, min = 1;

        while (playerNum != computerNum) {
            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер ");
                max = playerNum;
                playerNum = playerNum / 2 + min / 2 + (playerNum % 2 + min % 2) / 2;
            } else if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер ");
                min = playerNum;
                playerNum = playerNum / 2 + max / 2 + (playerNum % 2 + max % 2) / 2;
            }
        }
        System.out.println("Искомое число: " + playerNum + "\nВы победили!");
    }
}