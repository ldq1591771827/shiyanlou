#include <stdio.h>
#include <math.h>
void main()
{
	int m, y;
	double r;
	double qiubxh(int m, int y, double r);
	printf("���������");
	scanf("%d", &m);
	printf("��������ڣ�");
	scanf("%d", &y);
	printf("�����������ʣ�");
	scanf("%lf", &r);
	printf("��Ϣ��Ϊ��%.2f", qiubxh(m, y, r));




}
double qiubxh(int m, int y, double r)
{
	double sum;
	sum = m*pow(1 + r, y);
	return sum;
}