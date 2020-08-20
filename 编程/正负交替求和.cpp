#include <stdio.h>
void main()
{
	int n;
	double qiuhe(int n);
	printf("请输入一个正整数n：");
	scanf("%d", &n);
	printf("1-1/2+2/3-3/5+...的和为：%.2f", qiuhe(n));
}
double qiuhe(int n)
{
	int i, fz = 1,fm=1,flag=1,temp=0;
	double sum=0,item=0;
	for (i = 1; i <= n; i++) {
		item = flag*fz*1.0 / fm;
		sum = sum + item;
		flag = -flag;
		temp = fz;
		fz = fm;
		fm = temp +fz;

	}
	return sum;


}
/*item = flag* fz*1.0 / fm;
sum = sum + item;
temp = fz;
fz = fm;
fm = temp;
flag = -flag;
fm = fz + fm;*/
