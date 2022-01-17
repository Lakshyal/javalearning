/*Problem Statement
The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.

Implement a program to determine the eligible loan amount and the EMI that the bank can provide to its customers based on their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:

account number of the customer

account balance of the customer

salary of the customer

loan type 

expected loan amount

expected no. of EMIs

The following validations should be performed:

The account number should be of 4 digits and its first digit should be 1

The customer should have a minimum balance of $1000 in the account

Display appropriate error messages if the validations fail.

If the validations pass, determine whether the bank would provide the loan or not. 

The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively.
The bank decides the eligible loan amount and the number of EMIs based on the below table.

Salary      Loan Type       Eligible Loan Amount        No. of EMIs
>25000       Car                500000                       36
>50000       House              6000000                      60
>75000       Business           7500000                      84
  
  
Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.

Display an appropriate message if the bank does not provide the loan.

 Sample Input and Output
 
 
Sample Input                         Expected Output
accountNumber=1001                  eligibleLoanAmount=500000
salary=40000                        eligibleEmis=36
accountBalance=250000
loanType=Car
loanAmountExpected=300000
emisExpected=30 
  */
  
//My First attempt
import java.util.Scanner;
class Tester {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your four number accountNumber that starts with 1:");
        int accountNumber= sc.nextInt();
        System.out.println("Enter your salary:");
		int salary = sc.nextInt();
        System.out.println("Enter your account balance:");
		int accountBalance = sc.nextInt();
      String loanType= "Car";
        System.out.println("Enter loan amount expected:");
		int loanAmountExpected = sc.nextInt();
        System.out.println("Enter emis expected:");
		int emiExpected = sc.nextInt();
		if(accountNumber>999 && accountNumber<2000&& accountBalance>999){
            if (loanType=="Car" ){
		    int eligibleLoanAmount=500000;
		    int eligibleEmis= 36;
		    if (loanAmountExpected<=eligibleLoanAmount && emiExpected<=eligibleEmis) {
		        System.out.println("eligibleLoanAmount="+eligibleLoanAmount);
		        System.out.println("eligibleEmis="+eligibleEmis);
		    }
		    else{
		        System.out.println("Currently you are nor eligible for loan!");
		    } 
		 } 
		else if (loanType=="House"){
		    int eligibleLoanAmount=6000000;
		    int eligibleEmis=60;
		    if (loanAmountExpected<=eligibleLoanAmount && emiExpected<=eligibleEmis){
		      System.out.println("eligibleLoanAmount="+eligibleLoanAmount);
		        System.out.println("eligibleEmis="+eligibleEmis);  
		    }
            else{
		        System.out.println("Currently you are nor eligible for loan!");
		    } 
		  } 
		else if (loanType=="Business") {
		    int eligibleLoanAmount=7500000;
		    int eligibleEmis=84;
		    if (loanAmountExpected<=eligibleLoanAmount && emiExpected<=eligibleEmis){
		      System.out.println("eligibleLoanAmount="+eligibleLoanAmount);
		        System.out.println("eligibleEmis="+eligibleEmis); 
            }
         else{
		        System.out.println("Currently you are nor eligible for loan!");
		    } 
          }
	    }
        else{
            System.out.println("Please enter valid details");
        }
      }
    }
  
