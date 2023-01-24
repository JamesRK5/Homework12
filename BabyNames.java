package hw12;

import java.util.Scanner;

public class BabyNames {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter Dads name");
        String dad=inp.next();
        System.out.println("Please enter Moms name");
        String mom=inp.next();
        System.out.println("Is the baby a boy or a girl?");
        String baby= inp.next();
        if (baby.equalsIgnoreCase("boy")){
        String babyFirst = dad.substring(0,dad.length()/2);
        String babySecond = mom.substring(mom.length()/2);
            System.out.println("Suggested baby name: "+babyFirst.toUpperCase()+babySecond.toUpperCase());
        }else if (baby.equalsIgnoreCase("girl")){
            String babyFirst = mom.substring(0,mom.length()/2);
            String babySecond = dad.substring(dad.length()/2);
            System.out.println("Suggested baby name: "+babyFirst.toUpperCase()+babySecond.toUpperCase());
        }else{
            System.out.println("MUST enter boy or girl.");
        }
    }
}
