package secureElementGeneration;

import java.text.DecimalFormat;

public class Formatter {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("000");
		int dbSequence = 74000;
		String sequence = df.format(dbSequence);
		System.out.println(sequence);
		int quotient= dbSequence/35999;
		
		int remainder= dbSequence % 35999;
		
		

       
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
	}

}
