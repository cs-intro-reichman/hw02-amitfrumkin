/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int prevNum = -1 ; 

		do{
			int currentNum = (int)(Math.random()*10) ;
			if (currentNum >= prevNum){
				System.out.print(currentNum + " ") ;
				prevNum = currentNum ;
			}
			else {
				break ;
			}
		}while (true) ;

	}
}
