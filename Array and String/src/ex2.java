
//Mine
public class ex2 {
	
	public static void main(String args[]){
		String str="abcdefg";
		str=reverse(str);
		System.out.println(str);
	}
	
	public static String reverse(String str){
		StringBuffer reverse_str=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			reverse_str.append(str.charAt(i));
			
		}
		return reverse_str.toString();
		
	}

}
