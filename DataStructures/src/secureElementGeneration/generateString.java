package secureElementGeneration;

import java.security.SecureRandom;

public class generateString {
	
	public static void main(String[] args) {
		
		String mppId = "9";
		mppId = mppId + getAlphaNumericString("0123456789", 2);
		while(true) {
			String part2 =  getAlphaNumericString("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", 2);
			String part3 = getAlphaNumericString("ABCDEFGHIJKLMNOPQRSTUVWXYZ0456789", 1);
			if (!"00".equals(part2) || !part3.matches("-?\\d+(\\.\\d+)?")) {
				mppId = mppId + part2 + part3;
				break;
			}
		}
		
		System.out.println(mppId);
	}

	private static String getAlphaNumericString(String alphaNumericString, int size) {
		// TODO Auto-generated method stub
		  StringBuilder sb = new StringBuilder(size);
	        SecureRandom scr = new SecureRandom();
	        for (int i = 0; i < size; i++) {
	            int index = (int)(alphaNumericString.length() * scr.nextDouble()); /*Math.random()*/
	            sb.append(alphaNumericString.charAt(index));
	        }
	        return sb.toString();
	}

}
