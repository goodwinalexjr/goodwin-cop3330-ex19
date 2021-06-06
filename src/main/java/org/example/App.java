package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.print("What is the users weight? ");
        String w = numbers.nextLine();
        //makes sure the input is a number
        if(!w.matches("[0-9]+")){
            while(!w.matches("[0-9]+")){
                System.out.println("Invalid number");
                System.out.print("What is the users weight? ");
                w = numbers.nextLine();
            }
        }
        System.out.print("What is the users height? ");
        String h = numbers.nextLine();
        if(!h.matches("[0-9]+")){
            while(!h.matches("[0-9]+")){
                System.out.println("Invalid number");
                System.out.print("What is the users height in inches? ");
                h = numbers.nextLine();
            }
        }

        //conversions and calculations
        double weight = Double.parseDouble(w);
        double height = Double.parseDouble(h);
        double bmi = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + bmi + ".");
        if(18.5 > bmi){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(bmi > 25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.");
        }

    }
}
