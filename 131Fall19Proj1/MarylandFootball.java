import java.util.Scanner;
public class MarylandFootball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int JACKSON = 17;
		final int BROOKS = 25;
		final int MCFARLAND = 5;
		final int ELLIS = 7;
		final int PLAYER_JERSEY_NUMBER;
		final String PLAYER_LAST_NAME;

		System.out.print("Type 1 to enter a number or 2 to enter a name: ");
		int option = scan.nextInt();

		//Option 1:
		if (option == 1) {
			System.out.print("Enter player number: ");
			PLAYER_JERSEY_NUMBER = scan.nextInt();
			
			if (PLAYER_JERSEY_NUMBER == JACKSON || 
			    PLAYER_JERSEY_NUMBER == BROOKS || 
			    PLAYER_JERSEY_NUMBER == MCFARLAND ||
			    PLAYER_JERSEY_NUMBER == ELLIS) {
			    System.out.print("Which player wears number " + 
					     PLAYER_JERSEY_NUMBER + " on his jersey? ");
				
				PLAYER_LAST_NAME = scan.next();

				if ((PLAYER_LAST_NAME.equals("Jackson") &&
				     PLAYER_JERSEY_NUMBER == JACKSON) ||
				     (PLAYER_LAST_NAME.equals("Brooks") &&
				     PLAYER_JERSEY_NUMBER == BROOKS) || 
				     (PLAYER_LAST_NAME.equals("McFarland") &&
				     PLAYER_JERSEY_NUMBER == MCFARLAND) ||
				     (PLAYER_LAST_NAME.equals("Ellis") && 
				     PLAYER_JERSEY_NUMBER == ELLIS)) {
				     System.out.print("Correct!");

				} else {
					System.out.print("Incorrect!");
				}

			} else {
				System.out.print("Invalid choice.");
			}

		//Option 2:
		} else {
			System.out.print("Choose a name: ");
			PLAYER_LAST_NAME = scan.next();

			if (PLAYER_LAST_NAME.equals("Jackson") ||
			    PLAYER_LAST_NAME.equals("Brooks") ||
			    PLAYER_LAST_NAME.equals("McFarland") || 
			    PLAYER_LAST_NAME.equals("Ellis")) {
			    System.out.print("What number does " +
					     PLAYER_LAST_NAME + " wear? ");
				
				PLAYER_JERSEY_NUMBER = scan.nextInt();

				if ((PLAYER_JERSEY_NUMBER == JACKSON &&
				     PLAYER_LAST_NAME.equals("Jackson")) ||
				     (PLAYER_JERSEY_NUMBER == BROOKS &&
				     PLAYER_LAST_NAME.equals("Brooks")) || 
				     (PLAYER_JERSEY_NUMBER == MCFARLAND && 
				     PLAYER_LAST_NAME.equals("McFarland")) ||
				     (PLAYER_JERSEY_NUMBER == ELLIS &&
				     PLAYER_LAST_NAME.equals("Ellis"))) {
				     System.out.print("Correct!");

				} else {
					System.out.print("Incorrect!");
				}

			} else {
				System.out.print("Invalid choice.");
			}
		}
		scan.close();	
	}
}
