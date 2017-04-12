package by.htp.exersise;

/** I got the assignment : 06.04.2017 21.20 
* The assignment is complete : 09.04.2017 21.15
* @author - Kleinikov Stanislav
*/ 

public class NumberPolyndrome {
	public static void main(String[] args) {

		int [] someInt = {1124211,333221,1123213,653809};
		int countPalindrom = 0;
		int numberPalindrom = 0;
		for(int i = 0; i<someInt.length;i++){
			if(palindrom(String.valueOf(someInt[i])) == true){
				countPalindrom++;
				numberPalindrom = someInt[i];
				if(countPalindrom == 2){
					System.out.println("Second palindrom: " + someInt[i]);
					break;
				}
			}
		}
		if(countPalindrom<2){
			System.out.println("Palindrom: " + numberPalindrom);
		}
		
	}
	
    private static boolean palindrom(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
