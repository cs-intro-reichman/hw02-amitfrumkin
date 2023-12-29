/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		
		int n = Integer.parseInt(args[0]) ;
		

		for (int i = 1 ; i<= n ; i++){	
			for(int j = 1 ; j <= n+n ; j++){
				if((j+i)%2 == 0){
					System.out.print("* ") ;
				}
		
				else{
					System.out.print(" ") ;
				}
				
			}
			System.out.println(" ") ;
		}



	}
		
}
