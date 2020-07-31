import java.util.Scanner;
//Christina Bui Alien Attorney
/*
A site allows a user to customize their profile, in which they can set the shape of a 
logo to be between a circle, triangle, square, pentagon, and hexagon, along with the logo 
being either red, green, blue, or any combination of them. In addition to this, it allows 
the user to have four rotational options for the logo (upright, turned left, turned right, 
or upside down). Create a data structure along with accompanying get/set functions that will 
store this information in the most space-efficient way.
*/

public class LogoRunner{
		static String shape;
		static String position;
		static String color;
		static int userInput;

	public static void main(String[] args){

				try{
					runner();

					}catch(Exception InputMismatchException){
					//Just incase User does not type number inputs
					System.out.println("Only use Numbers for inputs, try again");

					}

	}//main

//Main runner for program
static void runner(){
			System.out.println("What shape would you like your Logo?");
			System.out.println("1) Circle \n2) Triangle\n3) Square\n4) Pentagon\n5) Hexagon");
			shape();

			System.out.println("What color would you like your Logo?");
			System.out.println("1) Red \n2) Green\n3) Blue\n4) Combination");
			color();
			
			System.out.println("What rotation would you like your Logo?");
			System.out.println("1) Upright \n2) Turned Left\n3) Turned Right\n4) Upside Down");
			position();

			printLogo();

}
//sets Shape based on User input
static String shape(){
	Scanner input = new Scanner(System.in);
	userInput = input.nextInt();

		if(userInput == 1){
			shape = "Circle";
		}
		else if(userInput == 2){
			shape = "Triangle";
		}
		else if(userInput == 3){
			shape = "Square";
		}
		else if(userInput == 4){
			shape = "Pentagon";
		}
		else if(userInput == 5){
			shape = "Hexagon";
		}
		else{
			System.out.println("Not an Option, Try again");
			shape();
		}
		return shape;

	
}

//sets Color based on User Input
static String color(){

	Scanner input = new Scanner(System.in);
	userInput = input.nextInt();


	if(userInput == 1){
		color = "Red";
	}
	else if(userInput == 2){
		color = "Green";
	}
	else if(userInput == 3){
		color = "Blue";
	}
	else if(userInput == 4){
		combinationColor();
	}
	else{
		System.out.println("Not an Option, Try again");
		color();

	}
	return color;
}

//color combinations
static String combinationColor(){
	Scanner input = new Scanner(System.in);
	System.out.println("How many colors would you like in the combinations choosing from 2 or 3 colors?");
	userInput = input.nextInt();

	if(userInput ==  3){
		color = "Red, Green, Blue";
	}
	else if(userInput == 2){
		System.out.println("Pick your First Color Choice");
		System.out.println("1) Red \n2) Green\n3) Blue");
		twoCombo();
	}
	else{
			System.out.println("Not an option, Try Again");
			combinationColor();	
	}
	
	return color;
}
//two color combo
static String twoCombo(){

		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();

		if(userInput == 1){
			color = "Red";
		}
		else if(userInput == 2){
			color = "Green";
		}
		else if(userInput == 3){
			color = "Blue";
		}
		else{
			System.out.println("Not an option, Try Again");
			twoCombo();
		}

		//Ask for second color
		System.out.println("Pick your Second Color Choice");
		System.out.println("1) Red \n2) Green\n3) Blue");
		userInput = input.nextInt();


		if(userInput == 1){
			color = color.concat(" & Red");
		}
		else if(userInput == 2){
			color = color.concat(" & Green");
		}
		else if(userInput == 3){
			color = color.concat(" & Blue");
		}
		else{
			System.out.println("Not an option, Try Again");
			twoCombo();

		}


		return color;

}
//sets roational position of shape/Logo
static String position(){
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();


	if(userInput == 1){
		position = "Upright";
	}
	else if(userInput == 2){
		position = "Turned Left";
	}
	else if(userInput == 3){
		position = "Turned Right";
	}
	else if(userInput == 4){
		position = "Upside Down";
	}
	else{
		System.out.println("Not an Option, Try again");
		position();

	}
	return position;

}

//prints and makes out properties of logo
static void printLogo(){

		Logo logo = new Logo(position, shape, color);
		logo.print();

}

}//class