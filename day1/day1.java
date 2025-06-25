ques-1
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

     
        double sum = num1 + num2;

       
        System.out.println("The sum is: " + sum);

        
        scanner.close();
    }
}


ques-2 
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        
        double fahrenheit = (celsius * 9 / 5) + 32;

        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        
        scanner.close();
    }
}


ques-3
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double area = Math.PI * radius * radius;

       
        System.out.println("The area of the circle is: " + area);

        
        scanner.close();
    }
}

ques-4
public class WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz!");
    }
}

ques-5
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);

        scanner.close();
    }
}
ques-6

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println("Result: " + result);

        scanner.close();
    }
}

ques--7
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}

ques-8
import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }
}

ques-9

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

ques-10
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
