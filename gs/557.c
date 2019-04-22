#include <stdio.h>
#include <string.h>
char* reverseWords(char* s) {
    int n, m;
    int length = strlen(s) + 1;
    char * result = (char *)malloc(length * sizeof(char));
    for (n = 0; n < length; n++)
        if (*(s+n) == ' ')
            *(s+n) = '\0';
    n = 0;
    while (n < length)
    {
        int length2 = strlen(s);
        for (m = 0; m < length2; m++)
        {
            *(result+n) = *(s+length2-m-1);
            n++;
        }
        if (n == length - 1)
            *(result+n) = '\0';
        else
        {
            *(result+n) = ' ';
            s += (length2 + 1);
        }
        n++;
    }
    return result;
}
