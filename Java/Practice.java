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
        // Scanner sc = new Scanner(System.in);
        // String cuname = "admin";
        // String copas = "java123";
        // String uname = sc.nextLine();
        // String pas = sc.nextLine();
        // if(uname.equals(cuname) && pas.equals(copas))
        // {
        //     System.out.println("Login successful");
        // }
        // else{
        //     System.out.println("Login failed. Please try again");
        // }

        //Multiplication table
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println("2 x "+i+" = "+2*i);
        // }

        //Factorial
        // int n=5;
        // int fact = n;
        // for(int i=n-1;i>=1;i--)
        // {
        //     fact *= i;
        // }
        // System.out.println(fact);

        //Fibonacci series
        // int a = 0;
        // int b = 1;
        // int n = 5;
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(a+" ");
        //     int c = a+b;
        //     a = b;
        //     b = c;
        // }

        //Prime number
        // int n = 100;
        // boolean flag = true;
        // for(int i=2;i*i<=n;i++)
        // {
        //     if(n%i==0)
        //     {
        //         flag = false;
        //     }
        // }
        // if(flag)
        //     System.out.println("Prime");
        // else
        //     System.out.println("Not prime");

        //reverese a no
        // int n = 1234;
        // int rev = 0;
        // while(n>0)
        // {
        //     rev = rev*10+(n%10);
        //     n /= 10;
        // }
        // System.out.println(rev);

        //sum of digits
        // int n = 1234;
        // int sum = 0;
        // while(n>0)
        // {
        //     int digit = n%10;
        //     sum += digit;
        //     n /= 10;
        // }
        // System.out.println(sum);

        //palindrome no
        // int n = 132;
        // int o = n;
        // int rev = 0;
        // while(n>0)
        // {
        //     rev = rev*10+(n%10);
        //     n /= 10;
        // }
        // if(rev==o)
        // {
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not a palindrome");
        // }

        //count digits
        // int n = 123;
        // int count = 0;
        // while(n>0)
        // {
        //     count++;
        //     n/=10;
        // }
        // System.out.println(count);

        //pattern 
        // *
        // **
        // ***
        // ****
        // *****
        // int n = 5;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}