class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>(); //ek nums2 ko set me daal diya 
        for(int n2:nums2){
            set.add(n2);
        }
        ArrayList<Integer> list = new ArrayList<>(); // nums1 ko list me daal diya
        for(int n1:nums1){
            if(set.contains(n1)){ // check set me jo element hai vo list hai ki nhi if  yes then put in list and remove from set
                list.add(n1);
                set.remove(n1);
            }
        }

        int result[] = new int [list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
        
    }
}