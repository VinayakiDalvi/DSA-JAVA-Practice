import java.util.*;

class PascalTriangle {
    public static void main(String[] args) {
        int numRows=5;
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            ArrayList<Integer>level= new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    level.add(1);
                }
                else{
                    level.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(level);
        }
        
        System.out.println("Pascal's Triangle");
        for(int i=0;i<numRows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
        
    }
}
