#include <stdio.h>
#include <math.h>
void main()
{
	int money, year;
	double rate, sum=0;
	printf("�����뱾������ݣ�");
	scanf("%d%d", &money, &year);
	printf("�����������ʣ�");
	scanf("%lf",&rate);
	sum = money*1.0*pow((1 + rate), year);
	printf("%d���һ������ȡ�ñ�Ϣ��Ϊ%.2f", year, sum);


}