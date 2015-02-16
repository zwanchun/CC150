
import java.util.Arrays;

//Mine
public class ex3 {
	public static boolean isPermutation(String str1, String str2){//anagram
	
		if(str1.length()!=str2.length()) return false;
		char[] sort_char1=str1.toCharArray();//transform the string to char array
		char[] sort_char2=str2.toCharArray();
		Arrays.sort(sort_char1);//sort char
		String sort_str1=new String(sort_char1);
		
		Arrays.sort(sort_char2);
		String sort_str2=new String(sort_char2);//transform char array to string
		
		if(sort_str1.equals(sort_str2)) return true;
		else return false;
		
	}
	
	public static void main(String args[]){
		String str1="abcd";
		String str2="bcda";
		boolean flag=isPermutation(str1,str2);
		if(flag) System.out.println("Hello World");
	}
	
	//Solution1
	public static String sort(String str){
		char[] content=str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String str1, String str2){
		if(str1.length()!=str2.length()) return false;
		return sort(str1).equals(sort(str2));
	}
	
	//Solution2
	public boolean permutation2(String str1, String str2){
		if(str1.length()!=str2.length()) return false;
		int[] letters=new int[256];
		char[] s_array=str1.toCharArray();
		for(char c : s_array){
			letters[c]++;
		}
		for(int i=0;i<str2.length();i++){
			int c=(int)str2.charAt(i);
			if(--letters[c]<0) return false;
		}
		return true;
	}

}
