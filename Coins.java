import java.util.Scanner;
//Christina Bui Alien Attorney
/*
Given some value V that is between 0-100 and predefined, and unique coins denominations
 of values A, B, and C, write a function that will return the minimum value of coins 
 needed to achieve a value of V.
 */
public class Coins{

			static int v=100; //V is predefined
			static int amountOfCoins=0;
			static int sum=0;
			static int quarter=25;
			static int dime=10;
			static int penny=1;

	public static void main(String[] args){

				//Add the amount of coins, and once it gets above V then subtract a quarter
				quarters();
				if(sum > v){
					sum = sum-quarter;
				}
				//Add the amount of coins, and once it gets above V then subtract a dime
				dimes();
				if(sum > v){
					sum = sum-dime;
				}
				
				//Add the amount of coins, and once it gets above V then subtract a penny
				penny();
				if(sum > v){
					sum = sum-dime;
				}


				System.out.println("Minimum Value of Coins: "+amountOfCoins);
				
	
			
	}//end of main

//Seeing the most quarters that can be added into sum
public static int quarters(){

			for(int i=0; sum < v; i++){

				sum = sum+quarter;
				amountOfCoins();
			}
		return sum;
}

//Adding Dimes
public static int dimes(){
	
			for(int i=0; sum < v; i++){

				sum = sum+dime;
				amountOfCoins();
			}
			return sum;
}

//Adding pennies
public static int penny(){
			
			for(int i=0; sum < v; i++){

				sum = sum+penny;
				amountOfCoins();
			}
			return sum;
}

//add amount of Coins
public static int amountOfCoins(){
	amountOfCoins++;

	return amountOfCoins;
}


}//end of class