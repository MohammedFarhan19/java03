package java03;

public class MySpiel {
	
	public static void main(String[] args) {
		
//		Ein Spiel zum raten 
		
		System.out.println("Welche zahl denke ich mir zwischen 1 und 5");
		
		int numberToGuess = (int) (Math.random() * 5 + 1);
		
		while(true)
		{
			int guess = new java.util.Scanner(System.in).nextInt();
			
			if(guess == numberToGuess) {
				
				System.out.println("Suuper....");
				break;
			}
			
			else if( guess > numberToGuess)
			{
				System.out.println("nein meine Zahl ist kleiner...");
				System.out.println("versuche Sie es erneut ....");
			}
			else if( guess < numberToGuess)
			{
				System.out.println("nein meine Zahl ist groesser...");
				System.out.println("versuche Sie es erneut ....");
			}
			
			
			
			
			
		}
		
		
	}

}
