#include <stdio.h>
void main()
{
	int i, geshu = 0, sum = 0;
	double ave = 0;
	for (i = 1; i <= 100; i++) {
		if (i % 2 != 0) {
			geshu++;
			sum=sum+i;
		}
	}
	ave = sum / geshu;
	printf("1��100����������Ϊ%d,��Ϊ%d,ƽ��ֵΪ%.2f��",geshu, sum, ave);



}