class Solution {
    public int uniquePaths(int m, int n) {
        return comb(m + n - 2, Math.min(m - 1, n - 1));
    }

    public int comb(int a, int b) {
        long res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * (a - b + i) / i;
        }
        return (int) res;
    }