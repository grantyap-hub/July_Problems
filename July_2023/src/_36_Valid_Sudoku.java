import java.util.*;

public class _36_Valid_Sudoku {


    public boolean isValidSudoku(char[][] board){

        ArrayList<HashSet<Integer>> row = new ArrayList<>();
        ArrayList<HashSet<Integer>> col = new ArrayList<>();
        ArrayList<HashSet<Integer>> three = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            row.add(new HashSet<>());
            col.add(new HashSet<>());
            three.add(new HashSet<>());
        }

        for(int i = 1; i < 10; i++){
            row.get(i-1).add(i);
            col.get(i-1).add(i);
            three.get(i-1).add(i);
        }
        int count = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int xd = board[i][j] - '0';
                if(Character.isDigit(board[i][j])){
                    if(j < 3){
                        if(!three.get(count*3).contains(xd))
                            return false;
                        three.get(count*3).remove(xd);
                    } else if(j < 6){
                        if(!three.get(count*3 + 1).contains(xd))
                            return false;
                        three.get(count*3 + 1).remove(xd);
                    } else if(j < 9){
                        if(!three.get(count*3 + 2).contains(xd))
                            return false;
                        three.get(count*3 + 2).remove(xd);
                    }

                    if(!col.get(j).contains(xd))
                        return false;
                    col.get(j).remove(xd);

                    if(!row.get(i).contains(xd))
                        return false;
                    row.get(i).remove(xd);
                }
            }
            count = (i-1)/3;
        }
        return true;


    }


    public static void main(String[] args) {

    }
}
