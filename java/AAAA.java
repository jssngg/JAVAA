package dd;

public class AAAA {
	public static void main(String []args){
	int a = 3;
	int b = 5 ;;
	int i = a>b?a-b:b-a;
	System.out.println(i);
	int sum = 0;
	for(int l = 0; l<100; l++){
		if(l % 2 == 1){
			continue;
			
		}
		else{
			System.out.println(sum + " : " + sum);
		sum += l;	
		if (sum== 12){
			break;//올 포문인데 브레이크됨 ㄷ ㄷ 
		}
		}
	}
	}
}
