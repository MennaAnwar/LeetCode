int isVowel(char c)
{
    switch(c)
    {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            return 1;
    }
    return 0;
}
int maxVowels(char * s, int k){
    int vowel = 0,
        max_vowel = 0;
    for (int i = 0; i < k; i++)
    {
        if (isVowel(s[i]))
            vowel++;
    }
    if (s[k] == '\0')
        return vowel;
    max_vowel = vowel;
    for (int i = 1; s[i + k - 1] != '\0'; i++)
    {
        if (isVowel(s[i - 1]))
            vowel--;
        if (isVowel(s[i + k - 1]))
            vowel++;
        if (vowel > max_vowel)
            max_vowel = vowel;
    }
    return max_vowel;
}