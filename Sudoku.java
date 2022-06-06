package BackTracking;

public class Sudoku {

	public static void main(String[] args) {
		int[][] b={ {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		if(isSudoku(b,b.length)) {
			System.out.println("Sudoko completed");
		}
		else {
			System.out.println("Sudoko Failed");
		}
		print(b,b.length);
	}
	
	private static boolean isSudoku(int[][] b, int len) {
		int row=-1;
		int col=-1;
		boolean isEmpty=false;
		// find Empty location
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(b[i][j]==0) {
					row=i;
					col=j;
					isEmpty=true;
					break;
				}
			}
			if(isEmpty)
				break;
		}
		if(!isEmpty)
			return true;
		// place value between 1-9 at empty 
		for(int i=1;i<=len;i++) {
			if(isSafe(b,row,col,i)) {
				b[row][col]=i;
				if(isSudoku(b, len)) {
					return true;
				}
				b[row][col]=0;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] b, int row, int col, int n) {
		//row check
		for(int i=0;i<b.length;i++) {
			if(b[i][col]==n) {
				return false;
			}
		}
		//col check
				for(int i=0;i<b.length;i++) {
					if(b[row][i]==n) {
						return false;
					}
				}
		//grid check
				int sqrt=(int) Math.sqrt(b.length);
				int rowStart=row-(row%sqrt);
				int colStart=col-(col%sqrt);
		for(int i=rowStart;i<rowStart+sqrt;i++) {
			for(int j=colStart;j<colStart+sqrt;j++) {
				if(b[i][j]==n)
					return false;
			}
		}
		return true;
	}

	private static void print(int[][] b,int len) {
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
