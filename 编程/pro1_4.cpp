#include <stdio.h>
void main()
{
	int i, sum = 0, geshu = 0;
	for (i = 1; i <= 100; i++) {
		if (i % 2 == 0) {
			geshu++;
			sum = sum + i;
		}
	}
	printf("1到100的偶数的个数为%d,和为%d", geshu, sum);

}



