
public class ex1 {
	

//Solutions	
	public static boolean isUniqueChars1(String str){
		if(str.length()>256) return false;//ASCII Code only has 256 unique characters
		
		boolean[] char_set=new boolean[256];
		
		for(int i=0;i<str.length();i++){
			int var=str.charAt(i);//transform char to integer
			if(char_set[var]) return false;//this char already found in the string
			char_set[var]=true;
		}
		return true;
	}
	
	//Solutions
	// int checker is used here as a storage for bits. Every bit in integer
	// value can be treated as a flag, so eventually int is an array of bits
	// (flag). Each bit in your code states whether the character with bit's
	// index was found in string or not. You could use bit vector for the same
	// reason instead of int. There are two differences between them:
	public static boolean isUniqueChars2(String str) {
		if (str.length() > 128) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	
	//Mine
		public static boolean isUniqueChars3(String str){
			int flag=0;
			for(int i=0;i<str.length();i++){
				for(int j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						return false;
					}
				}
			}
			return true;
		}

}
