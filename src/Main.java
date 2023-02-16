import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Logic logic = new Logic();




        System.out.print("Do you want to write in English or Morse?");
        String answer = scan.nextLine();
        if (answer.equals("English")) {
            System.out.println("Write something in English");
        } else if (answer.equals("Morse")) {
            System.out.println("Write something in Morse");
        }

    }


}
