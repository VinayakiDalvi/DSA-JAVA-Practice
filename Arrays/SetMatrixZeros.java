import java.util.*;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SetMatrixZeros {
    private static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>>matrix,int m ,int n){
        int col0=1;
      //traversing through each cell and if its 0, mark its row and col as 0 by marking first element of that row and column 0
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0);
                    if(j!=0){
                        matrix.get(0).set(j,0);
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        //make all elements in row and col 0
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix.get(0).get(j)==0 || matrix.get(i).get(0)==0){
                    matrix.get(i).set(j,0);
                }
            }
        }
        
        //handle first row or column zeros
        if(matrix.get(0).get(0)==0){
            for(int j=0;j<n;j++){
                matrix.get(0).set(j,0);
            }
        }
        
        if(col0==0){
            for(int i=0;i<m;i++){
                matrix.get(i).set(0,0);
            }
        }
        
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,1,2,0)));
        matrix.add(new ArrayList<>(Arrays.asList(3,4,5,2)));
        matrix.add(new ArrayList<>(Arrays.asList(1,3,1,5)));
        
        int m = matrix.size();
        int n =matrix.get(0).size();
        
        ArrayList<ArrayList<Integer>> ans =zeroMatrix(matrix,m,n);
        
        System.out.println("Final Matrix is: ");
        for(ArrayList<Integer> row:ans){
            for(Integer ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
