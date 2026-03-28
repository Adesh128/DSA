class Solution {
    public boolean halvesAreAlike(String s) {
        int ch = s.length();
        int  mid = ch/2;
        int a=0;
        int b=0;
        for (int i=0;i<mid;i++){
            if (isVowel(s.charAt(i)))
            a += 1;
        }
        for(int i=mid;i<ch;i++){
            if(isVowel(s.charAt(i)))
                b= b+1;
        }
        return a==b;



    }

    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c =='e' || c=='i' || c=='o'|| c=='u';

    }
}