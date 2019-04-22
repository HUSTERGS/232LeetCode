int singleNumber(int* nums, int numsSize) {
    sort(nums, 0, numsSize-1);
    int i;
    for (i = 1; i < numsSize; i += 2)
    {
        if (nums[i] == nums[i-1])
            continue;
        else
            break;
    }
    return nums[i-1];
}
void sort(int *a, int left, int right)
{
    if(left >= right)
        return ;
    int i = left;
    int j = right;
    int key = a[left];
    while(i < j)
    {
        while(i < j && key <= a[j])
            j--;
        a[i] = a[j];
        while(i < j && key >= a[i])
            i++;
        a[j] = a[i];
    }
    a[i] = key;
    sort(a, left, i - 1);
    sort(a, i + 1, right);
}