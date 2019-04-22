#include <stdio.h>
char* reverseString(char* s) {
    int length = strlen(s);
    char temp;
    int n;
    for (n = 0; n < (length/2); n++)
    {
        temp = *(s+n);
        *(s+n) = *(s+length-n-1);
        *(s+length-n-1) = temp;
    }
    return s;
}