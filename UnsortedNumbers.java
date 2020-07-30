
import java.util.Scanner;

//Christina Bui/Alien Attorney

/*Given an unsorted list of N numbers, write a program/function that will return all combinations of 
  these numbers that sum up to a number Y */
public class UnsortedNumbers{

		//declare unsortedList & amountOfInputs
		static int[] unsortedList;
		static int amountOfInputs;


	public static void main (String[] args){
		
		//Scanner input
		Scanner input = new Scanner(System.in);

		//Ask for User input N numbers
		System.out.println("Please put the desired amount of input");

		try{
		//insert User input
		amountOfInputs = input.nextInt();
		//initializes unsortedList array
		unsortedList = new int[amountOfInputs];

		//Adding all the elements in an array
			for(int i=0; i < amountOfInputs; i++){

					//asks for element in list
					System.out.println("Enter Number");

					//puts User number in index Array
					unsortedList[i] = input.nextInt();
			} //end of for Loop


		/*"Return all combinations of these numbers that sum up to a number Y" 
			Assumption: Adding all the numbers in the Array to Number Y 
		*/


		System.out.println("Sum of Numbers: "+sumOfNumbers());


		System.out.println("Your List of Numbers");
			//Prints out array
			for(int i=0; i < amountOfInputs;i++){
				System.out.println(unsortedList[i]);
			}


		}catch(Exception InputMismatchException){
			//Just incase User does not type number inputs
			System.out.println("Only use Numbers for inputs, try again");

		}


	}//end of main

//method to add sum of unsortedList's numbers
static int sumOfNumbers(){
	int sum=0;
		for(int i=0; i < amountOfInputs; i++){
			 sum = sum+unsortedList[i];

		}
		return sum;
}




}//end of class