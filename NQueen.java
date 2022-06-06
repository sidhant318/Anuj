package BackTracking;

public class NQueen {

	public static void main(String[] args) {
		int b[][]=new int[4][4];
		nQueen(b,0);
		printSolution(b);
	}

	private static boolean nQueen(int[][] b, int row) {
		if(row==b.length)
			return true;
		for(int col=0;col<b.length;col++) {
			if(isSafe(b,row,col)) {
				b[row][col]=1;
				if(nQueen(b, row+1)) {
					return true;
				}
				b[row][col]=0;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] b, int row, int col) {
		int i,j;
		
		//upper row check
		for(i=0;i<row;i++) {
			if(b[i][col]==1)
				return false;
		}
		
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(b[i][j]==1)
				return false;
		}
		
		for(i=row,j=col;i>=0 && j<b.length;j++,i--) {
			if(b[i][j]==1)
				return false;
		}
  
        return true;
	}

	static void printSolution(int b[][])
    {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++)
                System.out.print(" " + b[i][j]
                                 + " ");
            System.out.println();
        }
    }
}
