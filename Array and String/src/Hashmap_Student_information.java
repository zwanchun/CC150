import java.util.HashMap;


public class Hashmap_Student_information {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public HashMap<Integer,Student> buildMap(Student[] students){
		HashMap<Integer,Student> map=new HashMap<Integer,Student>();
		for(Student s : students ) map.put(s.getID,s);
		return map;
		
	}

}
