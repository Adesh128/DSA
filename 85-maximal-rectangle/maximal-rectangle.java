class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }

        int n = matrix.length; // row
        int m = matrix[0].length;
        int[][] pSum = new int[n][m];
        int maxArea = 0;

        for(int j = 0;j<m;j++){
            int sum=0;
            for(int i = 0;i<n;i++){
            
                if(matrix[i][j]=='1'){
                    sum ++;
                }else{
                    sum = 0;
                }
            
            pSum [i][j] = sum;
        }

        }
    for(int i=0;i<n;i++){
         maxArea = Math.max(maxArea,largestRectangleArea(pSum[i]));
    }
    return maxArea;
}
public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        
        stack.push(0);
        for(int i =1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max = getmax(heights, stack,max,i);

            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            max = getmax(heights, stack,max,i);
        }
        return max;
    }
    private static int getmax(int[] arr,Stack<Integer> stack,int max,int i){
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped]*i;
        }else{
            area = arr[popped]*(i-1-stack.peek());
        }
        return Math.max(max,area);
    }

}