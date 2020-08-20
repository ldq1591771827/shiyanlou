#include <stdio.h>

void main()
{
	int cj[9],sum=0,i;
	double ave;
	printf("请输入9个同学的成绩：");
	for (i = 0; i <= 8; i++) {
		scanf("%d", &cj);
		sum = sum + cj[i];
	}
	ave = sum *1.0/ 8;
	printf("这9个同学的成绩总和为%d，平均数为%.2f", sum, ave);


}