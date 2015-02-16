
public class StringBuffer_joinWords {
	
	public String joinWords(String[] words){
		StringBuffer sentence=new StringBuffer();
		for(String w: words) sentence.append(w);
		return sentence.toString();
	}

}
