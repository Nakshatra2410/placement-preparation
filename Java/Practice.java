import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Hello World
        //System.out.println("Hello World!");

        //Calculator
        // int a = 3;
        // int b = 5;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println((double)a/b);
        // System.out.println(a%b);

        //Swap two numbers
        // int a = 3;
        // int b = 5;
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a+", "+b);

        //Area of circle
        // int r = 10;
        // double area = Math.PI*r*r;
        // System.out.println(area);

        //Celsius<->Fahrenheit
        // int c = 100;
        // float f = ((9.0f/5.0f)*c)+32;
        // System.out.println(f);

        //Simple Interest
        // int p = 1000;
        // int t = 10;
        // int r = 5;
        // float interest = (p*t*r)/100;
        // System.out.println(interest);

        //Even Or Odd
        // int n = 5;
        // if(n%2==0)
        // {
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        // +ve, -ve, 0
        // int n = 2;
        // if(n>0)
        // {
        //     System.out.println("Positive");
        // }
        // else if(n==0)
        // {
        //     System.out.println("Zero");
        // }
        // else{
        //     System.out.println("Negative");
        // }

        //Largest of 3 no's
        // int a = 2,b=4,c=1;
        // if(a>b && a>c)
        // {
        //     System.out.println(a);
        // }
        // else if(b>a && b>c)
        // {
        //     System.out.println(b);
        // }
        // else{
        //     System.out.println(c);
        // }

        //Leap Year
        // int year = 2020;
        // if((year%4==0 && year%100!=0) || year%400==0)
        // {
        //     System.out.println("Leap year");
        // }
        // else{
        //     System.out.println("Not a leap year");
        // }

        //Calculator using switch
        // int a = 1;
        // int b = 2;
        // char op = '+';
        // switch (op) {
        //     case '+':
        //         System.out.println(a+b);
        //         break;
        //     case '-':
        //         System.out.println(a-b);
        //         break;
        //     case '*':
        //         System.out.println(a*b);
        //         break;
        //     case '/':
        //         System.out.println(a/b);
        //         break;
        //     case '%':
        //         System.out.println(a%b);
        //         break;
        //     default:
        //         System.out.println("Invalid operation");
        // }

        //Grade calculator
        int m = 50;
        // if(m>=90)
        //     System.out.println("S");
        // else if(m>=80)
        //     System.out.println("A");
        // else if(m>=60)
        //     System.out.println("B");
        // else if(m>=40)
        //     System.out.println("C");
        // else
        //     System.out.println("F");

        //Simple login (uname,password using if)
        Scanner sc = new Scanner(System.in);
        String cuname = "admin";
        String copas = "java123";
        String uname = sc.nextLine();
        String pas = sc.nextLine();
        if(uname.equals(cuname) && pas.equals(copas))
        {
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed. Please try again");
        }
    }
}