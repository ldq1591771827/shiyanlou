#include <stdio.h>
#include <math.h>
void main()
{
	double x,sum = 0;
	printf("������x��ֵ��");
	scanf("%lf", &x);
	if (x > 0) {
		sum = pow(x, 1 / 2) + log(x);
	}
	else
	{
		sum = 1.2*x + exp(x);
	}
	printf("�����ֵΪ:%0.2f!", sum);

}