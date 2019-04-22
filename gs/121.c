int maxProfit(int* prices, int pricesSize) {
    int max, min, i;
    for (i = 1, max = min = 0; i < pricesSize; i++)
    {
        if(*(prices+i) > *(prices+max))
            max = i;
        if(*(prices+i) < *(prices+min))
            min = i;
    }
    if (max >= min)
        return *(prices+max) - *(prices+min);
    int result1, result2, result3;
    if (max > 0)
        result1 = maxProfit(prices, max+1);
    else
        result1 = 0;
    if (min < pricesSize - 1)
        result2 = maxProfit(prices+min, pricesSize-min);
    else
        result2 = 0;
    if (max == min-1)
        result3 = 0;
    else
        result3 = maxProfit(prices+max+1, min-max-1);
    result1 = result1 > result2 ? result1 : result2;
    result1 = result1 > result3 ? result1 : result3;
    return result1;
}