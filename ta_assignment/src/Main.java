import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        while(x == 0) {
            System.out.print("Pick a method to start (Stack / Queue) : ");
            String input = scan.nextLine();
            if(input.equals("Stack") || input.equals("s") || input.equals("S")) {
                System.out.println("Palindrome Checker (With Stacks)");
                System.out.print("Enter a Palindrome to test : ");
                String palindrome = scan.nextLine();
                Stack<String> stack = new Stack<>();
                int length = palindrome.length();
                String endResult = "";
                for(int i = 0; i < length; i++) {
                    stack.push(String.valueOf(palindrome.charAt(i)));
                }
                System.out.println(stack);
                for(int i = 0; i < length; i++) {
                    String hold = stack.pop();
                    endResult = endResult + hold;
                }
                System.out.println(endResult);
                if(palindrome.equals(endResult)) {
                    System.out.println(palindrome + " = " + endResult);
                    System.out.println(palindrome + " is a Palindrome");
                } else {
                    System.out.println(palindrome + " =/ " + endResult);
                    System.out.println(palindrome + " is not a Palindrome");
                }
            } else if(input.equals("Queue") || input.equals("q") || input.equals("Q")) {
                System.out.println("Palindrome Checker (With Queue)");
                System.out.print("Enter a Palindrome to test : ");
                String palindrome = scan.nextLine();
                int length = palindrome.length();
                int Ascii = 0;
                QueueCircular queue = new QueueCircular(length);
                String endResult = "";
                for(int i = 0;i < length;i++) {
                    Ascii = palindrome.charAt(i);
                    queue.enQueue(Ascii);
                }
                queue.displayQueue();
                for(int i = 0;i < length; i++) {
                    char hold = (char)queue.deQueue();
                    endResult = hold + endResult;
                }
                System.out.println(endResult);
                if(palindrome.equals(endResult)) {
                    System.out.println(palindrome + " = " + endResult);
                    System.out.println(palindrome + " is a Palindrome");
                } else {
                    System.out.println(palindrome + " =/ " + endResult);
                    System.out.println(palindrome + " is not a Palindrome");
                }
            } else if(input.equals("Quit") || input.equals("Stop") || input.equals("quit") || input.equals("stop")) {
                System.out.println("Quiting.......");
                System.out.println("Thank you :)");
                x++;
            } else {
                System.out.println("Command not recognized");
                System.out.println("Try using Queue / Stack / Quit");
            }
        }
    }
}