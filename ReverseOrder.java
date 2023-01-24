package hw12;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your characters");
        String str=inp.next();
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
