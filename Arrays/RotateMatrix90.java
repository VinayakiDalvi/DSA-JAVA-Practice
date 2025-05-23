
import java.util.*;
//Optimal O(n^2) space O(1)
class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
     
        
        int n= matrix.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //row reverse
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
            
        }
        System.out.println("Rotated matrix is:");
        
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(matrix[i][j]+" ");
            }
             System.out.println();
         }
    }
}
