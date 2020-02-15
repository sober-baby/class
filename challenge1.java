import java.util.*;
public class DrX extends ProgrammingPV2 {
	static Scanner ss = new Scanner(System.in);
    static int max = 0;
	static String[]array = new String[]{"Hello", "World", "in", "a", "frame"};
  
	public static void main(String[]args) {
		 for(int i = 0; i<array.length;i++) {
		    	int length=array[i].length();
		    	if(length>max) {
		    		max = length;
		   }
		    	}
		 
		printingstars ();	
		printingwords ();
		printingstars ();
		
	}
	
	
	public static void printingwords () {
		 
		    for(int i = 0; i<array.length; i++) {
		    	double spaces = (max)-array[i].length();
		    	 System.out.print("* ");
		    	for(int j = 0; j<Math.floor(spaces/2);j++) {
		    		System.out.print(" ");
		    		 }
		    	System.out.print(array[i]);
		    	for(int k = 0; k<Math.ceil(spaces/2);k++) {
		    		System.out.print(" ");
		    		 }
		    	System.out.print(" *");
		    	System.out.println();
		    	
		    }
		   
			}
	public static void printingstars() {
		  for( int i = 0; i<max+4; i++) {
		 	   System.out.print("*");
		    }
		    System.out.println();
		
	}
}

	
	
