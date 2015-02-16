



public class ex4 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asdfadsf   adsafdsfasderwerw asdfadsf";
		str=replace_space(str);
		System.out.println(str);

	}

	//Mine
	public static String replace_space(String str){
		char[] s_array=str.toCharArray();
		StringBuffer replaced_str=new StringBuffer();
		for(int i=0;i<str.length();i++){
			if (s_array[i]==' ') replaced_str.append("%20");
			else replaced_str.append(s_array[i]);
		}
		return replaced_str.toString();
	}
	
	//Solutions
	public static void replace_space(char[] str, int length){
		int spaceCount=0, newlength,i;
		for(i=0;i<length;i++){
			if(str[i]==' ') spaceCount++;
		}
		newlength=length+spaceCount*2;
		str[newlength]='\0';
		for(i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[newlength-1]='0';
				str[newlength-2]='2';
				str[newlength-3]='%';
				newlength-=3;
			}
			else{
				str[newlength-1]=str[i];
				newlength-=1;
			}
			
		}
	
		
	}

}
