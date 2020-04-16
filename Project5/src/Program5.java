
import util.IO;
import java.util.Scanner;


import java.util.*;
import javax.swing.*;

public class Program5 {
    public static String drawChars(String ch, int n){
        String result=" ";
        for(int i=0; i <n; i++)
           result += ch;
        return result;
    }
//line
    public static String drawLine(int n){
    String result=" ";
        for(int i=0; i <n; i++)
           result += "* ";
        return result;
    
    
    }
//Diamond
    
    public static String drawDiamond(int  n){
        String result="";
            int cols =1;
            int spaces= n/2;
        
        while(cols<=n){
            result += drawChars(" ", spaces) +drawChars("*", cols)+ "\n";
             
            cols+=2;
            spaces--;
    }
        while(cols>=2/n){
            result += drawChars(" ", spaces) +drawChars("*", cols) + "\n";
            
            cols -=2;
            spaces++; 
        }     
        return result;
    }
//square

   public static String drawSquare(int n){
	String result = "";
	for (int i = 0; i <n ; i++){
            for(int j=0; j<n; j++)
		if(i==0|| j == 0|| i== n-1|| j==n-1 ) 
                result += " *";
               else result += "  ";
                result += "\n";
        }    
	return result;
    }
public static void main(String[] args) {
        int choice = IO.getInput("Enter a Number Less Than 20").nextInt();
	switch(choice){
            case 3:
            case 9:
            case 17:  
		  IO.showMessage(drawSquare(choice));
                break;
            case 5:
            case 11:
            case 15:
                   IO.showMessage(drawDiamond(choice));
                
                break;
              default:
                IO.showMessage(drawLine(choice));
                break;
        }
        System.exit(0);
    }
}
