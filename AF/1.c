int* twoSum(int* nums, int numsSize, int target) {
    int i=0;
    int*new;
    new=(int*)malloc(2*sizeof(int));
    for(i<0;i<numsSize;i++){
        int j=0;
        for(j<0;j<i;j++){
            if(nums[i]+nums[j]==target){
                
                new[0]=i;
                new[1]=j;
                return new;
            }
        }
    }
    return 0;
}