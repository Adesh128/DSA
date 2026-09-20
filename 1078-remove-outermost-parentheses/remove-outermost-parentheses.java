class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int count = 0;
        for(char ch :s.toCharArray()){
            if(ch == '(' ){
                count++;
            if(count>1){
                ans = ans+ch;
            }
            }else {
                count--;{
                    if(count>0){
                        ans = ans+ch;
                    }
                }
            }
            
            }
            return ans;
    }

}