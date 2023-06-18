package App;

import java.util.Scanner;
import java.lang.Math;

public class App {
    static void mMethod() {
        Scanner myObj = new Scanner(System.in);
                            //Enter Metric measurements
        System.out.println("Enter weight and height :");    

        int weight = myObj.nextInt();
        double height = myObj.nextDouble();
        myObj.close();
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);

        double calc = weight / Math.pow(height, 2);
        System.out.println(calc);

        if (calc <= 18.5) {
            System.out.println("Get a doctor, u malnourished fuck!!!");
        } else if (calc >= 25) {
            System.out.println("Get a doctor, u fat fuck!!!");
        } else {
            System.out.println("U aight, homie!!!");
        }
    }

    public static void main(String[] args) throws Exception {
        mMethod();
    }
}

/*
 * HEIGHT TABLE
 * 5' 0" 1.52
 * 5' 1" 1.55
 * 5' 2" 1.57
 * 5' 3" 1.60
 * 5' 4" 1.63
 * 5' 5" 1.65
 * 5' 7" 1.70
 * 5' 8" 1.73
 * 5' 9" 1.75
 * 5' 10" 1.78
 */

/*
 * BMI INDEX
 * <18.5 = Underweight
 * 18.5 - 24.9 = Normal
 * 25 - 29.9 = Overweight
 */