#include <stdio.h>
#include <math.h>
void main()
{
	double x,sum = 0;
	printf("请输入x的值：");
	scanf("%lf", &x);
	if (x > 0) {
		sum = pow(x, 1 / 2) + log(x);
	}
	else
	{
		sum = 1.2*x + exp(x);
	}
	printf("所求得值为:%0.2f!", sum);

}