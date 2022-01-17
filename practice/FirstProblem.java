/* Problem Statement
Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
1, 2, 4, 8, 16, 32, 64, ......, 1024
Sample Input and Output
Sample Input        Expected Output
 5                  1,2,4,8,16
 8                  1,2,4,8,16,32,64,128
*/
//My First Tryout----
import java.util.Scanner;
class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input");
		int a = sc.nextInt();
		int b=2, sum=1;
       System.out.println("Sample Output");
         System.out.print(sum);
		for (int i=1 ;i<=a ;i++){
            sum=sum*b; 
            System.out.print(","+sum);
		} 
       } 
}
