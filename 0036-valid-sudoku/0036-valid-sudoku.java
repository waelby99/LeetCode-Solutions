class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<board.length;i++){
            HashSet<Integer> hs=new HashSet<>();
            HashSet<Integer> hs1=new HashSet<>();
            int countR=0;
            int countC=0;
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    hs.add(board[i][j]-'0');
                    countR++;
                }
                if(board[j][i]!='.'){
                    hs1.add(board[j][i]-'0');
                    countC++;
                }
            }
            if(countR!=hs.size() || countC!=hs1.size()){
                return false;
            }
        }

    for(int i=0;i<board.length;i+=3){
        
        for(int j=0;j<board[i].length;j+=3){
            HashSet<Integer> hs=new HashSet<>();
            int countB=0;
           if(board[i][j]!='.'){
            hs.add(board[i][j]-'0');
            countB++;
           }
           if(board[i][j+1]!='.'){
            hs.add(board[i][j+1]-'0');
            countB++;
           }
           if(board[i][j+2]!='.'){
            hs.add(board[i][j+2]-'0');
            countB++;
           }
           if(board[i+1][j]!='.'){
            hs.add(board[i+1][j]-'0');
            countB++;
           }if(board[i+1][j+1]!='.'){
            hs.add(board[i+1][j+1]-'0');
            countB++;
           }if(board[i+1][j+2]!='.'){
            hs.add(board[i+1][j+2]-'0');
            countB++;
           }if(board[i+2][j]!='.'){
            hs.add(board[i+2][j]-'0');
            countB++;
           }if(board[i+2][j+1]!='.'){
            hs.add(board[i+2][j+1]-'0');
            countB++;
           }if(board[i+2][j+2]!='.'){
            hs.add(board[i+2][j+2]-'0');
            countB++;
           } 
           if(countB!=hs.size()){
            return false;
        }
        }   
    }        
    return true;
    }
}


