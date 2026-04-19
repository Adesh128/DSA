class Solution {
    public List<String> letterCombinations(String digits) {
         if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        return pad("", digits);
    }

    static String[] map = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
    };

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);

            ArrayList<String> ansFromBelow =
                    pad(p + ch, up.substring(1));

            list.addAll(ansFromBelow);
        }

        return list;
        
    }
}