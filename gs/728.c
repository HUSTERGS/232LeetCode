/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include<math.h>
int* selfDividingNumbers(int left, int right, int *returnSize)
{
    int sum, num, i;
    for (sum = 0, num = left; num <= right; num++)
        if(judge(num))
            sum++;
    *returnSize = sum;
    int *p = malloc(sizeof(int) * sum);
    for (i = 0, num = left; i < sum, num <= right; num++)
        if(judge(num))
        {
            *(p+i) = num;
            i++;
        }
    return p;
}
int judge(int num)
{
    int temp = num;
    int figure = log10(num)+1;
    for (; figure > 0; figure--)
    {
        if ((temp%10==0) || (num % (temp%10)))
            return 0;
        temp /= 10;
    }
    return 1;
}