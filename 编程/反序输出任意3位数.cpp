#include <stdio.h>
void main()
{
	int x;
	void fanxu(int x);
	printf("����������һ����λ����");
	scanf("%d", &x);
	printf("�����ĸ�λ�����ǣ�");
	fanxu(x);
	


}
void fanxu(int x) 
{
	int r;
	while (x != 0) {
		r = x % 10;
		x=x / 10;
		printf("  %d", r);
	}





}