import java.util.Scanner;

/**
 * This program prompts the user for a line of
 * input and then prints the input mirrored.
 * For example, if the input is
 * 
 * ABCD
 * 
 * the output would be
 * 
 * ABCDDCBA
 * 
 * For credit, this program must use a stack to accomplish
 * its task.
 *
 * @author Kade Garrison and Cameron Polikowski
 * @version Fall 2021
 */
public class Mirror
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input something to be mirrored");
        String input = scan.nextLine();
        Stack stack = new Stack(input.length());
        
        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        
        String temp = "";
        for (int i = 0; i < input.length(); i++){
            temp = temp + stack.pop();
        }
        
        char ch;
        for (int i = 0; i < temp.length(); i++) {
            ch = temp.charAt(i);
            
        }
        
        System.out.print("Mirrored result: " + input + " " + temp);
    }
}
