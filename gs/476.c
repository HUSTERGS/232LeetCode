#include <math.h>
int findComplement(int num) {
    int n = (int)log2(num) + 1;
    int m = ~((~0)<<n);
    return (~num)&m;
}
