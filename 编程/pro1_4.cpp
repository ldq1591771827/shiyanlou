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
	printf("1��100��ż���ĸ���Ϊ%d,��Ϊ%d", geshu, sum);

}



