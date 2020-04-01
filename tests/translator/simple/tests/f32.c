int count = 0;
int loop = 10;

void increment(){
    count = count + 1;
}

int main(){
    int x = 0;

    while(count < loop){
        increment();
        x = x + 1;
    }
    return x;
}