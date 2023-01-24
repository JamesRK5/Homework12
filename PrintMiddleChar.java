package hw12;

import java.util.Scanner;

public class PrintMiddleChar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your characters");
        String str=inp.next();
        int length=str.length();
        if (!str.isBlank()){
            if (length%2==0){
                System.out.println("There are an even number of Characters in the String");
            }else if(length%2!=0){
                length = ((length-1)/2);
                System.out.println("The middle character is: "+str.charAt(length));
            }
        }else{
            System.out.println("There are no characters in the String");
        }
    }
}
