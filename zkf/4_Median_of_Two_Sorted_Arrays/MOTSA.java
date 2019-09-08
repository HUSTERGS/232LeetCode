public class MOTSA {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A, B;
        if (nums1.length <= nums2.length) {
            A = nums1;
            B = nums2;
        } else {
            B = nums1;
            A = nums2;
        }

        int m = A.length, n = B.length, halfLen = (m + n + 1) / 2;
        int iMin = 0, iMax = m;
        // i == 0 means left_A is empty
        // i == m means right_A is empty

        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j - 1] > A[i]) {
                iMin = i + 1; // i is too small
            } else if (i > iMin && A[i - 1] > B[j]) {
                iMax = i - 1; // i is too big
            } else { // i is perfect
                int maxLeft;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(A[i], B[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0.0;
    }
}