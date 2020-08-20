#include <stdio.h>
#include <math.h>
void main()
{
	int m, y;
	double r;
	double qiubxh(int m, int y, double r);
	printf("请输入存款金额：");
	scanf("%d", &m);
	printf("请输入存期：");
	scanf("%d", &y);
	printf("请输入年利率：");
	scanf("%lf", &r);
	printf("本息和为：%.2f", qiubxh(m, y, r));




}
double qiubxh(int m, int y, double r)
{
	double sum;
	sum = m*pow(1 + r, y);
	return sum;
}