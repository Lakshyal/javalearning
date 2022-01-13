/* Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.

 
Sample Input and Output

Sample Input              Expected Output
1,5,3                      15
3,7,8                      8
7,2,9                      18
2,6,7                     -1
*/
import java.util.Scanner;//please starred this repository & @Lakshyal github..
class Tester {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1:");
		int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
        System.out.println("Enter number 3:");
		int num3 = sc.nextInt();
		int sum =0;
		if (num1!=7& num2 !=7 & num3 !=7) {
		    sum= num1*num2*num3;
		    System.out.println(sum);
		}
		else if (num1==7 & num2==7){
		    sum = num3;
		    System.out.println(sum);
		} 
		else if (num1==7 & num3 ==7) {
		    sum=-1;
		    System.out.println(sum);
		}
		else if (num2==7 & num3==7){
		    sum=-1;
		    System.out.println(sum);
		} 
		else if (num1==7){
		    sum=num2*num3;
		    System.out.println(sum);
		}
		else if (num2==7){
		    sum=num3;
		    System.out.println(sum);
		} 
		else if (num3==7) {
		    sum=-1;
		    System.out.println(sum);
		} 
	}
}
