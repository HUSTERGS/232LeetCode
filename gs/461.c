int hammingDistance(int x, int y) {
    int num = x^y, sum, i;
    for (i = 0, sum = 0; i < 31; i++)
    {
        if(num & (1<<i))
            sum++;
    }
    return sum;
}