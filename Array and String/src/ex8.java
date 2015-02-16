
public class ex8 {
	//Mine & Solution
	public static boolean rotate(String str1, String str2){
		if(str1.length()==str2.length()&&str1.length()>0){
			String str3=str1+str1;
			return isSubstring(str1,str2);
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
