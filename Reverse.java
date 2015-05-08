import java.util.*;
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//Read 10 integers and put them in array
		System.out.println("Enter 10 numbers: ");
		int[] array = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
		int input = 0;
		for(int i = 0; i < 10; i++){
			input = reader.nextInt();
			array[i] = input;
		}

		//Print out the array
		for(int i = 9; i >= 0; i--){
				System.out.print(array[i]+ " , ");
			}
	}
}

	



