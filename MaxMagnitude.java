import java.util.Scanner;

public class MaxMagnitude {

   /* Define your method here */
   public static int maxMagnitude (int userVal1, int userVal2) {
	   int val1 = userVal1;
	   int val2 = userVal2;
	   int maxMag = 0;
	   if (Math.abs(val1) > Math.abs(val2)) {
		   maxMag = val1;
	   }
	   if (Math.abs(val2) > Math.abs(val1)) {
		   maxMag = val2;
	   }
	   return maxMag;
   }
   

   public static void main(String[] args) {
      /* Type your code here */
	  Scanner scnr = new Scanner(System.in);
	  int userVal1 = scnr.nextInt();
	  int userVal2 = scnr.nextInt();
	  int maxMag = maxMagnitude(userVal1, userVal2);
	  System.out.println(maxMag);
	  scnr.close();
   }
}
