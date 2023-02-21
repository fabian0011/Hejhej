import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Logic logic = new Logic();

        boolean running = true;
        while (running) {
            System.out.print("Do you want to write in English or Morse?");

            String answer = scan.nextLine();
            String answerUpper = answer.toUpperCase();

            if (answerUpper.equals("ENGLISH")) {
                System.out.println("Write something in English");
                System.out.println(logic.translateEnglish(scan.nextLine()).toUpperCase());
                running = false;

            } else if (answerUpper.equals("MORSE")) {
                System.out.println("Write something in Morse");
                System.out.println(logic.translateMorse(scan.nextLine()));
                running = false;
            } else {
                System.out.println("Wrong choice");
            }

        }

    }
}
