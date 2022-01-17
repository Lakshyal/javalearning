/*Problem Statement
Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:

Distance          Delivery charge per km
first 3 km          $0
next 3 km           $1
remaining kms       $2


Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.
    

Sample Input and Output

Sample Input                                     Expected Output
Food Type   Quantity Ordered   Distance(kms)
   N              2                 3                 30
   V              1                 7                 17
    
------------------------------------------------------------------
*/

import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Food Type 'V'for Veg and 'N' for non-Veg:");
		char foodType = sc.next().charAt(0);
        System.out.println("Enter quantity of items you want to order:");
        int quantity = sc.nextInt();
        System.out.println("Enter the distance between your house and shop (in Kms):");
        int d = sc.nextInt();
        int totalCost = 0;
        int deliveryCharge = 0;
        int totalBill=0;
          if (foodType == 'V'){
            int costOfVegPlate = 12;
               totalCost+=quantity *costOfVegPlate;
            }
            else if (foodType == 'N'){
                int costOfNonVegPlate = 15;
                totalCost +=quantity *costOfNonVegPlate;
                 }
        
        if (d>0&&d<=3){
           deliveryCharge=0;
        }
        else if (d>3&&d<=6){
            deliveryCharge= (d-3);
        }
        else if (d>6) {
            deliveryCharge = (d-6)*2+3;
        }
        System.out.println("You TotalBill is:");
       totalBill= totalCost+deliveryCharge;
        System.out.println(totalBill);
        
        }
}
 //It's my first attempt 
 
