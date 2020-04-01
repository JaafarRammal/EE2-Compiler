
int power(int base, int powerRaised)
{
    if (powerRaised != 0){
        return (base*power(base, powerRaised-1));}
    else
       { return 1;}
}
int main()
{
    int base;
    int powerRaised;
    int result;

    base = 2;

    powerRaised = 10;

    return power(base, powerRaised);

   

}

