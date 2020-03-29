int EQUAL(float a, float b, float x);

int main(){
	float a = 40.456;
	float b = 2.345;
	float x = 3;
	int result = a==b-x;
	if(result == EQUAL(a,b,x)){
		return 0;
	}
	return 75;
}
