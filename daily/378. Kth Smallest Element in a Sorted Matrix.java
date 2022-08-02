class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int p=0;
        int n=matrix.length;
        int temp[] = new int[n*n];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               temp[p++]=matrix[i][j];
           }
       } 
        Arrays.sort(temp);
        int index=k-1;
        return  temp[index];
    }
}
