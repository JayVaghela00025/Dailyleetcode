class Solution {
    public int climbStairs(int n) {
        if (n <= 3)
            return n;

        int a = 1, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            b = a;
            a = sum;
        }
        return a;
    }
}
