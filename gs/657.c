bool judgeCircle(char* moves) {
    int num[4] = {0, 0, 0, 0};
    while(*moves != '\0')
    {
        switch(*moves)
        {
            case 'U':num[0]++;break;
            case 'D':num[1]++;break;
            case 'L':num[2]++;break;
            case 'R':num[3]++;break;
        }
        moves += 1;
    }
        
    if(num[0] == num[1] && num[2] == num[3])
        return true;
    else
        return false;
}