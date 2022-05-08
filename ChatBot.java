import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        int age, currentYear = 2022;
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Hello, how are you today?");
        String greeting = scanner.nextLine();
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hey " + name + ", what is your birth year?");
        String birthYear = scanner.nextLine();
        int year = Integer.parseInt(birthYear);
        age = currentYear - year;
        System.out.println(name + ", you are approximately " + age +" years old!");

        System.out.println("Enter any number you want me to count to");

        int count = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i <=count; i++)
         {
            System.out.println(i); 
        }
        System.out.println("Wasn't is nice!!!");

        while (true) {
            System.out.println("Now let's see how much programming you know");
            System.out.println("What is Java?\na)Island in Indonesia\nb)Programming language\nc)Coffee brand\nd)Javascript");
            System.out.println("Choose your answer between: a, b, c or d");
            String Answer = scanner.nextLine();
            if (Answer.equals("b")) {
                System.out.println("Correct! You did a great job");
                break;
            } else
                System.out.println("Wrong answer try again");
        }
        scanner.close();
    }
       
}