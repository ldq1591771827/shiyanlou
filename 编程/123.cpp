#include "stdio.h"
#include "math.h"
int prime(int n)
{
	int i, flag = 1;
	for (i = 2; i <= sqrt(n); i++)
	{
		if (n%i == 0)
		{
			flag = 0;
			break;
		}
	}
	return flag;
}
void main()
{
	int m, n, i, count = 0;
	long s = 0;
	printf("请输入整数m:");
	scanf("%d", &m);
	printf("请输入整数n:");
	scanf("%d", &n);
	for (i = m; i <= n; i++)
	{
		if (prime(i))
		{
			count++;
			s += i;
		}
	}
	printf("%d与%d之间素数个数:%d\n", m, n, count);
	printf("%d与%d之间素数之和:%ld\n", m, m, s);
}