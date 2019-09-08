class CWMW {
    public int maxArea(int[] height) {
        if (height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left != right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, (right - left) * height[left]);
                left += 1;
            } else {
                maxArea = Math.max(maxArea, (right - left) * height[right]);
                right -= 1;
            }
        }

        return maxArea;
    }
	
}