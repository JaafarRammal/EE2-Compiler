
float operations(float a, float b){
	float result = 0;
	while( (a)>b && (b<a) ){
		result+=(a*b);
		a--;
	};

return result;
}
