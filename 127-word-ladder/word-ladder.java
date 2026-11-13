class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return 0;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(beginWord);
        visited.add(beginWord);

        int length = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                String current = q.poll();

                if (current.equals(endWord)) {
                    return length;
                }

                for (int j = 0; j < current.length(); j++) {

                    char[] temp = current.toCharArray();

                    char original = temp[j];

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        if (ch == original) continue;

                        temp[j] = ch;

                        String newWord = new String(temp);

                        if (set.contains(newWord) && !visited.contains(newWord)) {

                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }

            length++;
        }

        return 0;
    }
}