#include <stdio.h>
void main()
{
	int i,m,n, sum = 0, geshu1 = 0, geshu2 = 0,sum1=0,sum2=0;
	double ave1 = 0, ave2 = 0;
	printf("请输入两个正整数m和n（m<=n）:");
	scanf("%d%d", &m, &n);
	for (i = m; i <= n; i++) {
		if (i % 2 == 0) {
			geshu1++;
			sum1 = sum1 + i;
		}
		else {
			geshu2++;
			sum2 = sum2 + i;
		}
	}
	ave1 = sum1 / geshu1;
	ave2 = sum2 / geshu2;
	printf("正整数%d和正整数%d之间的偶数个数是%d,偶数和是%d,平均数是%.2f;\n奇数个数是%d,奇数和是%d,平均数是%.2f", m, n, geshu1, sum1, ave1, geshu2, sum2, ave2);
}