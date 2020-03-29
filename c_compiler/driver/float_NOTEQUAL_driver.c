int NOTEQUAL(float a, float b, float x);

int main(){
	float a = 40.456;
	float b = 2.345;
	float x = 3;
	float result = a!=b-x;
	if(result == NOTEQUAL(a,b,x)){
		return 0;
	}
	return 75;
}
