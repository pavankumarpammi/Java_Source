public class N_queen {
    public static void printSolution(int[][] board,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] board,int row,int col)
    {
        //checking for the row on left side
        for(int i=0;i<col;i++)
        {
            if(board[row][i]==1)
            {
                return false;
            }
        }
        //checking upper diagonal on the left side
        
    }
    public static boolean solveQueen(int[][] board,int n)
    {

    }
    public static void main(String[] args) {
        
    }
}
