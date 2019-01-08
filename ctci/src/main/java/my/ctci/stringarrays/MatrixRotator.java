package my.ctci.stringarrays;


public class MatrixRotator {

	public static void main(String[] args){

		int[][] testarr = {
				{1,2,3,4,9,7},
				{2,3,4,5,8,6},
				{6,7,8,9,1,2},
				{10,11,12,13,15,20},
				{1,1,1,1,1,1},
				{2,2,2,2,2,2},
		};
		
		printArray(testarr,6);
		rotate(testarr,6);
		printArray(testarr,6);
		

					
	}
	

	public static void printArray2(int[][] img, int size){

		//Using the Enhanced for-loop
		for(int[] x : img){
			for( int y : x){
				System.out.print(y);
			}
			System.out.println();
		}
	}


	private static void printArray(int[][] m, int n){
		System.out.println();

		//Using the Simple for-loop
		for (int i=0; i<n; i++){
			System.out.println();
			for (int j=0; j<n; j++){
				System.out.print(m[i][j] + "|");
			}
		}

	}

	public static void rotate(int[][] m , int n){

		for(int layer=0;layer < n/2 ; layer++){

			int first=layer;
			
			int last=n-1-layer;
			System.out.println();
			System.out.println("first:" + first);
			System.out.println("last:" + last);

			for(int i=first; i<last; i++){
				System.out.println("value of i:" + i);

				int offset = i-first;
				System.out.println("value of offset:" + offset);

				//save the top
				int top = m[first][i];

				//move leftLayerElemets->topLayerElemets
				m[first][i]=m[last-offset][first];

				//move bottomLayerElemets->leftLayerElements
				System.out.println("bottom elems:" + last + "|" + (last-offset));
				m[last-offset][first] = m[last][last-offset];

				//move rightLayerElemets->bottomLayerElemets
				m[last][last-offset]=m[i][last];

				//move topLayerElemets->rightLayerElemets
				m[i][last]=top;
			}
		}

	}


}
