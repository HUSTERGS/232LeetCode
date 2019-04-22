int numJewelsInStones(char* J, char* S) {
    char * s;
    int count = 0;
    for (;*J != '\0'; J++)
        for (s = S; *s != '\0'; s++)
            if(*J == *s)
                count++;
    return count;
}