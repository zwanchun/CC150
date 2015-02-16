
public class ex6 {
	//mine
	public static int[][] rotation_90(int[][] matrix, int n){
		int[][] rotation_matrix=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				rotation_matrix[j][n-i-1]=matrix[i][j];
				
			}
				
		}
		return rotation_matrix;
	}

	//Solutions
	public static void rotate(int[][] matrix, int n){
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[][] matrix=new int[5][5];
		int m=1;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				matrix[i][j]=m;
				m++;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
//		matrix=rotation_90(matrix,5);
//		for(int i=0;i<5;i++){
//			for(int j=0;j<5;j++){
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.print("\n");
//		}
//		
		rotate(matrix,5);

	}
	
//	public static void rotation(int[][] matrix, int n){
//		int layer=0;
//		for(layer=0;layer<n/2;layer++){
//			int first=layer;
//			int last=n-1-layer;
//			for(int i=first;i<last;i++){
//				int offset=
//				int top=matrix[first][]
//			}
//		}
//		
//	}

}
