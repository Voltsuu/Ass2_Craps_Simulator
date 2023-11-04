import java.util.Scanner;
import java.lang.Math;

public class CrapsSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keepPlaying = "";

        do {

            int d1 = (int)(Math.random() * 6) + 1;
            int d2 = (int)(Math.random() * 6) + 1;
            int total = d1 + d2;
            int total2;


            System.out.println("Dice 1: "+ d1);
            System.out.println("Dice 2: " + d2);
            System.out.println("Total: "+ total);

            if (total == 7 || total == 11) {
                System.out.println("Natural, you win!");

                System.out.println("Play again? [Y/N]");
                keepPlaying = scan.nextLine();

                if (keepPlaying.equalsIgnoreCase("n")) {
                    break;
                }

            } else if (total == 2 || total == 3 || total == 12) {
                System.out.println("Crap. You lose.");

                System.out.println("Play again? [Y/N]");
                keepPlaying = scan.nextLine();

                if (keepPlaying.equalsIgnoreCase("n")) {
                    break;
                }

            } else {

                while (true){
                    System.out.println("");
                    System.out.println("Tie. Rolling again.");
                    System.out.println("");

                    d1 = (int) (Math.random() * 6) + 1;
                    d2 = (int) (Math.random() * 6) + 1;

                    total2 = d1 + d2;

                    System.out.println("Dice 1: "+ d1);
                    System.out.println("Dice 2: "+ d2);
                    System.out.println("Total: "+ total2);
                    System.out.println(" ");

                    if (total2 == total) {
                        System.out.println("You win!");

                        System.out.println("Play again? [Y/N]");
                        keepPlaying = scan.nextLine();

                        if (keepPlaying.equalsIgnoreCase("n")) {
                            break;
                        }
                    }

                    if (total2 == 7) {
                        System.out.println("Crap. You lose.");

                        System.out.println("Play again? [Y/N]");
                        keepPlaying = scan.nextLine();

                        if (keepPlaying.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                }
            }
        } while (!keepPlaying.equalsIgnoreCase("n"));
    }
}