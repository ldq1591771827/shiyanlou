#include <stdio.h>
void main()
{
	int n;
	double qiuhe(int n);
	printf("������һ����������");
	scanf("%d", &n);
	printf("1-1/3+1/5-1/7+...��ǰ%d���Ϊ��%.2f",n, qiuhe(n));
}
double qiuhe(int n)
{
	int i,flag=1,fz=1,fm=1;
	double item,sum=0;
	for (i = 1; i <= n; i++) {
		item = flag*1.0 / fm;
		flag = -flag;
		fm = fm + 2;
		sum = sum + item;
	}
	return sum;
}