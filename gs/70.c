int climbStairs(int n) {
    int pre, now, next, i;
    for (i = pre = now = 1; i < n; i++)
    {
        next = pre + now;
        pre = now;
        now = next;
    }
    return now;
}