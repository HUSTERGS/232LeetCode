class CB {
    public int[] countBits(int num) {
        if (num == 0) {
            return new int[] {0};
        }
        if (num == 1) {
            return new int[] {0, 1};
        }
        int[] retArr = new int[num + 1];
        retArr[0] = 0;
        retArr[1] = 1;
        int toCut = 2;
        int currIndex = 2;
        while (currIndex <= num) {
            while (currIndex <= num && currIndex < toCut * 2) {
                retArr[currIndex] = retArr[currIndex - toCut] + 1;
                currIndex++;
            }
            toCut *= 2;
        }
        return retArr;
    }
}