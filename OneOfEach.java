
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		boolean girl = false ;
		boolean boy = false ;
		String girls = "" ;
		String boys = "" ; 
		int numOfGirls = 0 ;
		int numOfBoys = 0 ; 
		

		do{
			double chance = Math.random() ;
			if (chance < 0.5){
				girl = true ;
				girls = girls + "g + " ;
				numOfGirls++ ;
			}else {
				boy = true  ; 
				boys = boys  + "b + " ;
				numOfBoys++ ;
			}
			

		}while ((girl && boy) != true) ; 

		
		if(numOfGirls > numOfBoys){
			System.out.println(girls + "b") ;
			System.out.println("You made it... and you now have " + (numOfGirls+1) + " children.") ;

		}else{
			System.out.println(boys + "g") ;
			System.out.println("You made it... and you now have " + (numOfBoys+1) + " children.") ; 
	
		}
	}
}
