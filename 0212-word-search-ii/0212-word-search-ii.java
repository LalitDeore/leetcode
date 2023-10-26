class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String word;
}

class Solution {
    private void buildTrie(TrieNode root, String[] words) {
        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.word = word;
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        int n = board.length;
        int m = board[0].length;
        TrieNode root = new TrieNode();

        buildTrie(root, words);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = board[i][j];
                int index = c - 'a';
                if (root.children[index] != null) {
                    dfs(board, i, j, root, result);
                }
            }
        }

        return result;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
        char c = board[i][j];
        int index = c - 'a';

        if (c == '#' || node.children[index] == null) {
            return;
        }

        node = node.children[index];
        if (node.word != null) {
            result.add(node.word);
            node.word = null; 
        }

        board[i][j] = '#'; 

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int[] dir : directions) {
            int newRow = i + dir[0];
            int newCol = j + dir[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                dfs(board, newRow, newCol, node, result);
            }
        }

        board[i][j] = c; 
    }
}
