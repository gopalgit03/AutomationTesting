package JavaConcept;

public class Operators {

	public static void main(String[] args) {

		// Operators is nothing but operate one task ex.

		/*
		 * a=20; b=10;
		 * 
		 * c=a+b
		 * 
		 * a, b, c are called varaibles a & b-------> operands = & + ------> operators
		 * 
		 * 
		 * 1. Arithmetic Operators: Perform basic mathematical operations.
		 * 
		 * Example: + - * / % Addition, Subtraction, Multiplication, Division, Modulus
		 * 
		 * 
		 * 2. Comparison (Relation) Operators: Compare two values and return a boolean
		 * result.
		 * 
		 * Example: < > <= >= != == Equal to, Not equal to, Greater than, Less than,
		 * Greater than or equal to, Less than or equal to
		 * 
		 * 
		 * 3. Logical Operators : Perform logical operations on boolean values.
		 * 
		 * Example: && || ! AND, OR, NOT
		 * 
		 * 4. Assignment Operators: Assign values to variables.
		 * 
		 * Example: = += *= /= Assignment, Addition assignment, Subtraction assignment,
		 * Multiplication assignment, Division assignment, Modulus assignment
		 * 
		 * 
		 * 5. increment Example = ++
		 * 
		 * 
		 * 6.decrement Example = --
		 */
		// Arithmetic Operators----- + - * / %
		int a = 10;
		int b = 20;

		System.out.println(
				"=================================Arithmetic Operators==================================================");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(b % a);

		/*
		 * Comparison (Relation) Operators------ < > <= >= != == Always return boolean
		 * value true/false a b a<b a > b a<=b a >=b a !=b a ==b 10 20 TRUE FALSE TRUE
		 * FALSE TRUE FALSE
		 */
		System.out.println(
				"=================================Comparison (Relation) Operators==================================================");
		boolean x = true;
		System.out.println(a < b); 
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a != b);
		System.out.println(a == b);

		// Logical Operators---------AND, OR, NOT
		// Always return boolean value true/false

		System.out.println(
				"==================================Logical Operators=================================================");
		boolean x1 = true;
		boolean y1 = false;

		System.out.println(x1 && y1); // banne sacha hase to True show karse
		System.out.println(x1 || y1); // banne mathi aek sachu hase to True avse
		System.out.println(!x1);      // opposite ans aavse Ex. x1=true to ans= false
		System.out.println(!y1);      // opposite ans aavse Ex. x1=true to ans= false

		// Simulating user input
		String enteredUsername = "user123";
		String enteredPassword = "pass456";

		// Expected valid username and password
		String validusername = "user123";
		String validpassword = "pass456";

		System.out.println(
				"==================================Logical Operators example=================================================");

		// Check if username and password both are valid (Logican AND)
		boolean isCredencialisvalid = (enteredUsername.equals(validusername))
				&& (enteredPassword.equals(validpassword));
		System.out.println("Both are valid :" + isCredencialisvalid);

		// Check if either username or password match (logical OR)
		boolean isPartialCredentialsValid = (enteredUsername.equals(validusername))
				|| (enteredPassword.equals(validpassword));
		System.out.println("Both are valid :" + isPartialCredentialsValid);

		// Check if the entered username is not valid (logical NOT)
		boolean isusernameisnotvalid = !(enteredUsername.equals(validusername));
		System.out.println("Both are valid :" + isusernameisnotvalid);

		// Check if the entered username is not valid (logical NOT)
		boolean ispasswordisnotvalid = !(enteredPassword.equals(validpassword));
		System.out.println("Both are valid :" + isusernameisnotvalid);

		
		//Assignment Operators:
		// int a = 10;
		// int b = 20;
		
		int c;	
		c=a;
		
		System.out.println(c);
		
		c=b;
		System.out.println(c);
		
		c=100;
		//c++;    //if you want to - 1                 // incremental c=c+1;
		c+=5;                      // incremental c=c+5; if you want to - 5
		System.out.println(c);

		int d;
		d=100;
		//d--;                    //decremental d=d-1
		d-=5;                     //decremental d=d-5
		System.out.println(d);		
		
		
		int g;
		
		g = 100;
		
		g*=5;
		
		System.out.println(g);
		
		g/=5;
		System.out.println();
		
		
		
		
		
		
		
//======================================Conditional statement===============================================================================================
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
