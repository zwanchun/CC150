
public class ex7 {
	
	//Mine & Solution
	public static void zero(int[][] matrix){
		boolean[] row=new boolean[matrix.length];
		boolean[] column=new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}

			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]==true||column[j]==true) matrix[i][j]=0;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
