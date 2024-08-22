import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();
  
        scan.nextLine();
        System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
        String city = scan.nextLine();
                        
        scan.nextLine();
        System.out.println("I hear it's beautiful at " + city + "!");
        System.out.println("How old are you?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("So you're " + age + ", cool!");
        System.out.println("Enough about me. What's your favourite language?");
        String codeLanguage = scan.nextLine();

        scan.nextLine();
        System.out.println(codeLanguage + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        scan.close();
    }
}