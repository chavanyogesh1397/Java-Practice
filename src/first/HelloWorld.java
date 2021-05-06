package first;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        String c= reader.next();
        String z= reader.nextLine();

        // nextInt() reads the next integer from the keyboard
        	//reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println(c + " You entered: "  );
        
        
        
    }
} 