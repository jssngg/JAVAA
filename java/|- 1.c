#include <stdio.h>
int main(){
	int a[3][3] = {1,2,3,4,5,6,7,8,9};
	int b[3][3] = {4,2,3,6,5,1,2,3,4};
	int s[3][3] = {0,0,0,0,0,0,0,0,0};
	int p[3][3] = {0,0,0,0,0,0,0,0,0};
	int *x , int *y, int *s,int *p,int i,int j;
sum();
product();
}



void sum(int *x, int *y, int *s){
	x = &a[i][j];
	y = &b[i][j];
	s = &s[i][j];
	
for (i = 0; i < 3; i++)
for (j = 0; j < 3; j++)
	*s = *x + *y ;


	printf("%d %d %d/n",s[0][0] , s[0][1], s[0][2]) ;

	printf("%d %d %d/n",s[1][0] , s[1][1], s[1][2]) ;

	printf("%d %d %d/n",s[2][0] , s[2][1], s[2][2]) ;
}


void product(int *x, int *y, int *p){

	x = &a[i][j];
	y= &b[j][i];
	p = &p[i][j];

for (i = 0; i < 3; i++){

for (j = 0; j < 3; j++){
*p = *x * *y ;

}}
	printf("%d %d %d/n",s[0][0] , s[0][1], s[0][2]) ;

	printf("%d %d %d/n",s[1][0] , s[1][1], s[1][2]) ;

	printf("%d %d %d/n",s[2][0] , s[2][1], s[2][2]) ;

}