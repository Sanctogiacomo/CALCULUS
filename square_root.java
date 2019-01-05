/**A PROGRAMME TO CALCULATE THE SQUAREROOT OF NUMBERS**/
import java.util.Scanner;
public class square_root {
private static String name;

public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	int count = 1;
	int x = 0;
	int y = 0;
	System.out.println("WELCOME TO A PROGRAMME TO CALULATE THE SQUARE ROOT OF NUMBERS");
	for (count = 1; count<=3;){
		System.out.println("ENTER YOUR FIRST NAME PLEASE!:");
		setName(input.next());
		System.out.println("PLEASE ENTER THE VALUE OF X:");	
		x = input.nextInt();
		y = (int)(Math.sqrt(x));
		System.out.println("THE VALUE OF YOUR SQUARE ROOT IS " +y);
		count++;
	}
	if (count==3){
		System.out.println("THANKS FOR USING THIS CALCULATOR. TO CALULATE THE SQUAREROOT OF ANY NUMBER AGAIN PLEASE RERUN THE PROGRAMME");
}
	else{
		System.out.println("THANKS FOR USING THIS CALCULATOR. TO CALULATE THE SQUAREROOT OF ANY NUMBER RERUN THE PROGRAMME");
	}
	}

public static void setName(String name) {
	square_root.name = name;
}

public static String getName() {
	return name;
}
}
