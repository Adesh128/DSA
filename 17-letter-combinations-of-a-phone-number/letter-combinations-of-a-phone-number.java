class Solution {
    public List<String> letterCombinations(String digits) {
         if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        return pad("", digits);
    }

    static String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  //
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