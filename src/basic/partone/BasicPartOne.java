package basic.partone;
import java.util.Scanner;

public class BasicPartOne {
    public static void main(String[] args) {

        /* 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
        Expected Output :
        Hello
        Alexandra Abramov
         */
        System.out.println("Hello");
        System.out.println("XT");

        // Or
        System.out.println("Hello\nXT");


        /* 2. Write a Java program to print the sum of two numbers.
        Test Data:
        74 + 36
        Expected Output :
        110
        */
        System.out.println(74+36);

        // Or
        int sum = 24 + 26;
        System.out.println(sum);


        /* 3. Write a Java program to divide two numbers and print them on the screen.
        Test Data :
        50/3
        Expected Output :
        16
        */
        System.out.println(50/3);

        // Or
        int result = 50 / 3;
        System.out.println(result);


        /* 4. Write a Java program to print the results of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13
        */
        int a = -5+8*6;
        int b = (55+9)%9;
        int c = 20+-3*5/8;
        int d = 5+15/3*2-8%3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Or
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);


        /* 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println(product);

        // Or
        System.out.println(num1 + " x " + num2 + " = " + product);


    }
}
