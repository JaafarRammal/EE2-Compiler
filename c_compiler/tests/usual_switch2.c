int main(){
	
	int x = 8;
	int y = 9;
	int z = 88;
	switch(x){

		
		case 1:
			switch(y){
				case 9:
					return 42;
				case 88:
					return 23;
			}
			x=21;
			return -1;
		case 2:
			x=55;
			return -2;
		case 4:
			x=66;
			return -3;
		case 8:
			x=87;
			return -4;
	}

return x;
}

