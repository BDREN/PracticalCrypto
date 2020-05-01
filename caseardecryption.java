public class Caesar{
	// Encrypts text using a shift od s
	public static StringBuffer decrypt(String cipher, int s) {
		StringBuffer result= new StringBuffer();
		char ch;
		for (int i=0; i<cipher.length(); i++) {
			if (Character.isUpperCase(cipher.charAt(i)))
				ch = (char)(((int)cipher.charAt(i) - s - 65) % 26 + 65);
			else
			ch = (char)(((int)cipher.charAt(i) - s - 97) % 26 + 97);

			result.append(ch);
			
		}
		return result;
	}

	// Driver code
	public static void main(String[] args) {
		String cipher = "Mjqqt0PFXZS";
		int s = 5;
		System.out.println("Cipher : " +cipher);
		System.out.println("Shift : " + s);
		System.out.println("text: " + decrypt(cipher, s));
	}
}
