#include <stdio.h>
#include <math.h>
void main()
{
	double x, sum = 0;
	printf("请输入x的值：");
	scanf("%lf", &x);
	if (x < 0) {
		sum = pow(x,5) + 2*x + pow(x, -1);
	}
	else{
		sum = pow(x,1/2);
	}
	printf("所求的值为：%0.2f",sum);
}