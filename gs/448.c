/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int mark = 0, value;
    while (mark < numsSize)
    {
        value = *(nums+mark);
        if (*(nums+value-1))
        {
            *(nums+mark) = *(nums+value-1);
            *(nums+value-1) = 0;
        }
        else
        {
            while(*(++mark + nums) == 0)
                continue;
        }
    }
    for (mark = 0, value = 0; mark < numsSize; mark++)
        if (*(mark+nums))
            value++;
    *returnSize = value;
    int *p = (int *)malloc(value * sizeof(int));
    for (mark = 0, value = 0; mark < numsSize; mark++)
        if (*(mark+nums))
            *(p + value++) = mark+1;
    return p;
}