/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int t = Integer.parseInt(args[0]) ;
		int sumOfAllChildrens = 0 ;
		int fam2Childrens = 0 ;
		int fam3Childrens = 0 ;
		int fam4Childrens = 0 ; 
		
		

		for(int i =1 ; i <= t ; i++){
			boolean girl = false ;
			boolean boy = false ;
			int numOfGirls = 0 ;
			int numOfBoys = 0 ;
			int sumOfChildrens = 0 ;
			do{
				double chance = Math.random() ;
				 
				if (chance < 0.5){
					girl = true ;
					numOfGirls++ ;
				}else {
					boy = true  ; 
					numOfBoys++ ;
				}
				/*System.out.println("girls:" + numOfGirls) ; */
				/*System.out.println("boys:" + numOfBoys) ; */
				sumOfChildrens = numOfGirls + numOfBoys ; 
				/*System.out.println("sum:" + sumOfChildrens) ; */
				

			}while ((girl && boy) != true) ; 
			if(sumOfChildrens == 2){
				fam2Childrens = fam2Childrens + 1 ;
			}else if(sumOfChildrens == 3){
				fam3Childrens = fam3Childrens + 1 ;
			}else if(sumOfChildrens >= 4){
				fam4Childrens = fam4Childrens + 1 ;
			}
			sumOfAllChildrens = sumOfAllChildrens + sumOfChildrens ;
			/*System.out.println("sum all:" + sumOfAllChildrens) ; */
			 
		}
		double average = (double)sumOfAllChildrens/t ;
		System.out.println("Average: " + average + " children to get at least one of each gender.") ;
		System.out.println("Number of families with 2 children: " + fam2Childrens ) ;
		System.out.println("Number of families with 3 children: " + fam3Childrens ) ;
		System.out.println("Number of families with 4 or more children: " + fam4Childrens ) ;

		if(fam2Childrens >= fam3Childrens && fam2Childrens >= fam4Childrens){
			System.out.println("The most common number of children is 2.") ;
		}else if(fam3Childrens >= fam2Childrens && fam3Childrens >= fam4Childrens){
			System.out.println("The most common number of children is 3.") ;
		}else if (fam4Childrens >= fam2Childrens && fam4Childrens >= fam3Childrens){
			System.out.println("The most common number of children is 4 or more.") ;
		}
		
	}
}

	

		

