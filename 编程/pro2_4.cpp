#include <stdio.h>
#include <math.h>
void main()
{
	double x, sum = 0;
	printf("������x��ֵ��");
	scanf("%lf", &x);
	if (x < 0) {
		sum = pow(x,5) + 2*x + pow(x, -1);
	}
	else{
		sum = pow(x,1/2);
	}
	printf("�����ֵΪ��%0.2f",sum);
}