class Solution {
    public int lengthOfLastWord(String s) {
        int c = s.length()-1;
       int count = 0;
       for(int i = c; i>=0;i--){
           if(count == 0 && s.charAt(i) == ' '){
              continue;
              
           }
           if(s.charAt(i) == ' '){
               break;
           }
           count++;

       }

        return count;
        
    }
}