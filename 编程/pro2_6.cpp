#include <stdio.h>
void main()
{
	int n;
	double qiuhe(int n);
	printf("请输入一个正整数：");
	scanf("%d", &n);
	printf("1-1/2+2/3-3/5+...的前%d项和为：%.2f", n, qiuhe(n));
}
double qiuhe(int n)
{
	int i, flag = 1, fz = 1, fm = 1,pd=0;
	double item, sum = 0;
	for (i = 1; i <= n; i++) {
		item = flag*fz *1.0/ fm;
		flag = -flag;
		pd = fz;
		fz = fm;
		fm = fm + pd;
		sum = sum + item;
	}
	return sum;
}