int x = 0;
int y=10;

void f(int a, int b){
    while(b<a){
        a = a - 1;
        x = x + 1;
    }
}

int main(){
    int a = 20;
    int b = 5;
    if(b<a)
        f(a,b);
    else
        if(b>a)
            return 1;
        else
            return 2;

    if(x < 10){
        if(a<y)
            return 3;
        else
            return 4;
    }
    else{
        while(x<y){
            y = y - 1;
        }
    }
    return x;
}