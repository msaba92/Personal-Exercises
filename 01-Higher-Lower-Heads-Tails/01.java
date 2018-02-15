import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class CoinRollHigherLower {
    static BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

    private static void headtail() {
        Random randomNum = new Random();
        int coinresult = randomNum.nextInt(2);
        if (coinresult == 0) {
            System.out.println("Heads!");
        } else {
            System.out.println("Tails!");
        }
    }

    private static void higherlower() throws IOException {
        int target = 100;
        int major = target;
        int minor = 1;
        while (true) {
            System.out.print("Is it " + target + "? Y/H/L ");
            String answer = br.readLine();
            if (answer.toLowerCase().equals("y")) {
                System.out.println("I did it!");
                break;
            } else {
                if (answer.toLowerCase().equals("h")) {
                    minor = target;
                } else if (answer.toLowerCase().equals("l")) {
                    major = target;
                }
                int[] targetarray = new int[major - minor + 1];
                for (int i = 0; i < major - minor + 1; i++) {
                    targetarray[i] = minor + i;
                }
                if (targetarray.length < 3) {
                    target = targetarray[0];
                } else {
                    target = targetarray[(targetarray.length / 2)];
                }
                if (major == minor) {
                    System.out.println("Make up your mind!");
                    System.exit(0);
                }
                if (major - minor == 1 && minor != 1) {
                    System.out.println("Make up your mind!");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("Please select 1 for coin flip, 2 for higher/lower. ");
            String choice = br.readLine();
            if (choice.equals("1")) {
                headtail();
            } else if (choice.equals("2")) {
                higherlower();
            }
        }
    }
}
