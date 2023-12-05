package JavaConcept;

public class Conditional_statement {

	public static void main(String[] args) {
		
		
		//======================================Conditional statement===============================================================================================
		
/*		Conditional statement
		If
		if...else
		Nested if..else
		Switch case

		
		
		
		
		1) IF conditation
		
		if (Conditation){
		Code
			}	
		
		*/	
		//Case 1 "IF": Age>18 is eligible for vote
		
		int age = 15;
		
		if(age >= 18) {
			System.out.println("Eligible for vote");
		}
		{
			System.out.println("Code run properly");
		}
		
		
		
/*		2) IF Condidation
 
		if (Conditation){
		Code
			}
		else{
		code
		}	
*/		
		
		if(age >= 16) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
		{
			System.out.println("Code run properly");
		}
		
		
		
	}

}
