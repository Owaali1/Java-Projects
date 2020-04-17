import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class kldf {

    static ArrayList<Character> Stack = new ArrayList<Character>();

    public static void main(String arg[]) {

        // ask user for input
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String Input = in.nextLine();

        System.out.println("Your name is " + Input);

        boolean Balanced = true;

        for (int i = 0; i < Input.length(); i++) {
            
            if (Input.charAt(i) == '('||Input.charAt(i) == '['||Input.charAt(i) == '{') {
                Push(Input.charAt(i));
            }
                else if(Input.charAt(i) == ')'||Input.charAt(i) == ']'||Input.charAt(i) == '}'&& Stack.isEmpty())
                Balanced = false;
            }
            
        
        if(Balanced){
            System.out.println("Input is Balanced");
            
            
        }
        if(!Balanced){
            System.out.println("Input is Not Balanced");    
        }
        
        /**
         * Push("Watermelon"); Push("cant"); Push("apple"); Push("orange");
         * 
         * System.out.println(pop()); System.out.println(pop());
         **/

    }

    static void Push(Character s) {
        Stack.add(0, s);

    }

    static Character pop() {
        Character s = Stack.get(0);
        Stack.remove(0);
        return s;

    }
}