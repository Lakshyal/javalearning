/*Problem Statement
Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

Find the discriminant value using the formula given below.

discriminant = b^2 - 4ac

If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

Use the formula given below to find the roots of a quadratic equation.

x = (-b ± discriminant)/2a

 

Sample Input and Output
Sample Input         Expected Output
a=1,b=4,c=4        The root is -2.0
a=1,b=4,c=6        The equation has no real roots
*/
import java.util.Scanner;
class Tester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value a:");  
     double a=sc.nextDouble();
        System.out.println("Enter the value b:");
        double b=sc.nextDouble();
        System.out.println("Enter the value c:");
        double c=sc.nextDouble();
     double d = b*b-4*a*c;
    if (d==0){
    	double r1=(-b )/(2.0*a);
    System.out.println("The root is"+r1);
    }
    else  if (d>0){
    	 double r1=(-b + Math.pow(d,0.5))/(2.0*a);
    	 double r2=(-b - Math.pow(d,0.5))/(2.0*a);
        System.out.println("The root are"+r1+"and" + r2);
    }
    else{
         System.out.println("The equation has no real root"); 
    }
  }
}
