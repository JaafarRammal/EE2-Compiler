int x = 5;

int _function(int a, int b, int c, int d, int e, int f){
    return a*b+c*d-e*f;
}

int main(){
    int y;
    if(x == 3){
        return x*9;
    }
    else{
        x = x + 5;
    }
    if(x > 5)
        y = _function(x,1,2,3,4,2);
    else
        return 0;
    
    while((x || 0) != 0 ){
        x = x -1;
    } 
    return x + y;
}