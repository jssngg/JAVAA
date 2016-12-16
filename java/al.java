package dd;

public class al {
	void run(){
int a,b,p[][] = new int[3][3];
	a[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
	b[3][3] = {{4,2,3},{6,5,1},{2,3,4}};
	p[3][3] = {{0,0,0},{0,0,0},{0,0,0}};
	int i = 0 ;
	int j =0;
	for (i = 0; i < 3; i++){
		for (j = 0; j < 3; j++){
		p[i][j] = a[i][j] * b[j][i];}}
	for (i = 0; i < 3; i++)
		for (j = 0; j < 3; j++){
			System.out.println(p[i][j]);}

	}
	public static void main(){
		al aa = new al();
		aa.run();
	}
		}

