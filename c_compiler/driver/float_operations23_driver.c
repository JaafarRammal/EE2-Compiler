float f();
extern float* pointer;
extern float y;

int main(){
  
   float x = 15.88;
	float k = 1.455;
	float z = 4;
	for(z<18;z++;){
		if(z>=x){
			break;
		}
		else{
			z=k+z;
		}
	}
	
    return k == *pointer;
}
