void moveZeroes(int* nums, int numsSize) {
    int i, j;
    for (i = 0; i < numsSize - 1; i++)
    {
        for (j = 0; j < numsSize - i - 1; j++)
        {
            if (!nums[j])
            {
                nums[j] ^= nums[j+1];
                nums[j+1] ^= nums[j];
                nums[j] ^= nums[j+1];
            }
        }
    }
}