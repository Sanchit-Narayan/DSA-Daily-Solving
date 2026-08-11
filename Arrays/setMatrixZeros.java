package Arrays;

//Brute Force Approach
// public class setMatrixZeros{
//     private static void markRows(int i, int[][] matrix){
//         int m = matrix[0].length;
//         for(int j = 0; j < m; j++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;
//             }
//         }
//     }
    
//     private static void markColumns(int j, int[][] matrix){
//         int n = matrix.length;
//         for(int i = 0; i < n; i++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;
//             }
//         }
//     }
    
//     public static void main(String[] args){
//         int[][] matrix = {
//             {1, 1, 1, 1},
//             {1, 0, 0, 1},
//             {1, 1, 0, 1},
//             {1, 1, 1, 1}
//         };
        
//         int n = 4;
//         int m = 4;
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(matrix[i][j] == 0){
//                     markRows(i, matrix);
//                     markColumns(j, matrix);
//                 }
//             }
//         }
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 if(matrix[i][j] == -1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//         }
//     }
// }

//Better Solution
public class setMatrixZeros{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1}
        };
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] rows = new int[n];
        int[] columns = new int[m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(matrix[i][j] == 0){
                   rows[i] = 1;
                   columns[j] = 1;
               } 
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(rows[i] == 1 || columns[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        
    }
}