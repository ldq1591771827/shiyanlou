#include <stdio.h>

void main()
{
	int cj[9],sum=0,i;
	double ave;
	printf("������9��ͬѧ�ĳɼ���");
	for (i = 0; i <= 8; i++) {
		scanf("%d", &cj);
		sum = sum + cj[i];
	}
	ave = sum *1.0/ 8;
	printf("��9��ͬѧ�ĳɼ��ܺ�Ϊ%d��ƽ����Ϊ%.2f", sum, ave);


}