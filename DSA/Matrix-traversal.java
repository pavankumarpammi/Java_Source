class Matrixtraversal {
    public static void MatrxiPath(int curr_row,int curr_col,int dest_row,int dest_col,String ans){
        if((curr_col==dest_col)&&(curr_row==dest_row)){
            System.out.println(ans);
            return ;
        }
        if((curr_col>dest_col)||(curr_row>dest_row) ){
            return ;
        }
        MatrxiPath(curr_row+1, curr_col, dest_row, dest_col, ans+"V");
        MatrxiPath(curr_row, curr_col+1, dest_row, dest_col, ans+"H");
    }
    public static void main(String[] args) {
        MatrxiPath(0, 0, 2, 2, "");
    }
}
