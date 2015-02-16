
import java.util.HashMap;
import java.util.Map.Entry;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaaaaaaaaaaaaaadddddddddddddeeeeeeeefffffffxafghsf";
		System.out.println(compression_String(str));

	}

	//Mine
	public static String compression_String(String str){
		char[] s_array=str.toCharArray();
		int count=1;
		StringBuffer compressed_str=new StringBuffer();
		for(int i=1;i<str.length();i++){
	
			if(s_array[i]==s_array[i-1]) {
				count++;
				if(i==str.length()-1){
					compressed_str.append(s_array[i]);
					compressed_str.append(count);
				}
			}
			else{
				compressed_str.append(s_array[i-1]);
				compressed_str.append(count);
				count=1;
				if(i==str.length()-1){
					compressed_str.append(s_array[i]);
					compressed_str.append(1);
				}
			}
			
		}
		
		String new_str=compressed_str.toString();
		if(new_str.length()>=str.length()) return str;
		else return new_str;
	}
}
