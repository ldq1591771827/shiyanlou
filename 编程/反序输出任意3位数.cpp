#include <stdio.h>
void main()
{
	int x;
	void fanxu(int x);
	printf("请任意输入一个三位数：");
	scanf("%d", &x);
	printf("反序后的各位数字是：");
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