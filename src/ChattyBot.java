import java.util.Scanner;

public class ChattyBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        Scanner myScanner = new Scanner(System.in);

        System.out.print("> ");
        String name = myScanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3, remainder5, remainder7, age;
        System.out.print("> ");
        remainder3 = myScanner.nextInt();
        remainder5 = myScanner.nextInt();
        remainder7 = myScanner.nextInt();

        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!\n");
        System.out.println("============================================================");
        programmingKnowledge();
    }

    static void programmingKnowledge(){
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?\n"                         +
                "1. To repeat a statement multiple times.\n"                  +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n"          +
                "4. To interrupt the execution of a program.");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        System.out.print(">" + answer +".");

        if (answer.equals("2")){
            end();
        } else {
        	System.out.println("Please Try Again!");    
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }

}