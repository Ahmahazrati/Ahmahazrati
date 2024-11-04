package javaapplication52;

import java.util.Scanner;

public class JavaApplication52 {

    private static double Wight;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Wight, Hight, BMI;
        System.out.println("please Enter your wight in Kilogram");
        Wight = input.nextDouble();
        System.out.println("please Enter your Hight in Meter");
        Hight = input.nextDouble();
        BMI = Wight / Hight * Hight;
        if (BMI < 18.5) {
            System.out.println("UnderWight");
        } else if (18.5 < BMI && BMI < 25.0) {
             System.out.println("Normal");
        }else if(25<=BMI &&BMI<30){
            System.out.println("OverWight");
        
    }else if(30<=BMI){
            System.out.println("Obese");
}
    }
    

}
