#include <stdio.h>
#include <math.h>
void main()
{
	int money, year;
	double rate, sum=0;
	printf("请输入本金与年份：");
	scanf("%d%d", &money, &year);
	printf("请输入年利率：");
	scanf("%lf",&rate);
	sum = money*1.0*pow((1 + rate), year);
	printf("%d年后一共可以取得本息和为%.2f", year, sum);


}