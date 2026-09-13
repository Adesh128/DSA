class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int rem = 0;
        int orig = n;
        while(n>0){
            rem = n%10;
            rev = rev *10+rem;
            n = n/10;
        }
        return Math.abs(rev-orig);
    }
}