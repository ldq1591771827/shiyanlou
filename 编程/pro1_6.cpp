#include <stdio.h>
void main()
{
	int i,m,n, sum = 0, geshu1 = 0, geshu2 = 0,sum1=0,sum2=0;
	double ave1 = 0, ave2 = 0;
	printf("����������������m��n��m<=n��:");
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
	printf("������%d��������%d֮���ż��������%d,ż������%d,ƽ������%.2f;\n����������%d,��������%d,ƽ������%.2f", m, n, geshu1, sum1, ave1, geshu2, sum2, ave2);
}