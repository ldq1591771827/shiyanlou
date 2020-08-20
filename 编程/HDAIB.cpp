#include <stdio.h>

void main()

{
	int I = 1, j = 0;
	int n = 2;
	int m = n + 1;
	int num = (m + 1)*m / 2;
	while (I <= num) {
		j++;
		printf("%d", j);
		I++;

		printf("\n");
	}
}


