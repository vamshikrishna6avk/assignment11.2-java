/*here we are showing how exceptions are occuring in the program
 * exception occurs dividing any integer value to zero
 * exceptions are two types checked and unchecked exceptions
 * in checked exceptions we can handle them,but in unchecked exception wecant handle them
 * exceptions occurs during run time
 */
package assignment11;//created package as assignment11

public class Divide {//created class as Divide
	                   //classes are the basics of the opps(object oriented programming)
	public static void main(String []args){
		
		//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		
		int i ,j ,k ;//taking three variables of integer data types naming i.j,k
		 i= 6;      //initializing values to it as i eqaul to 6
		 j = 0 ;    //here we are trying to divide int type with zero that shows an exception that as arthmetic exception
		 k= i/ j;   //k equal to i divides by j
		             //but cannot divide by zero
		 System.out.println(k);
		//systemm is used to return code
			//out is a static member
			//Println is used to print text  and gives output
		   //exception occurs ,cannot divide by zero so wont print k value
	}

}