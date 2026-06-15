class Solution {
    int rows;
    int cols;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color) {
            return image;
        }

        rows = image.length;
        cols = image[0].length;

        boolean[][] visited = new boolean[rows][cols];

        dfs(sr, sc, color, image[sr][sc], visited, image);

        return image;
    }

    void dfs(int row, int col, int newcolor, int curcolor,
             boolean[][] visited, int[][] images) {

        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return;
        }

        if (images[row][col] != curcolor) {
            return;
        }

        if (visited[row][col]) {
            return;
        }

        visited[row][col] = true;
        images[row][col] = newcolor;

        int[][] adjlist = {
            {row - 1, col},
            {row, col + 1},
            {row + 1, col},
            {row, col - 1}
        };

        for (int[] neighbour : adjlist) {
            dfs(neighbour[0], neighbour[1],
                newcolor, curcolor, visited, images);
        }
    }
}