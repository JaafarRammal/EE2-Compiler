char *search(char *x, char c);

int main()
{
    char *s="abcdef";

    char *p=search(s,'c');
    return !(p==s+2);
}
