#include <stdio.h>
#include <math.h>
void main()
{
	int a, b;
	printf("请输入两个正整数：");
	scanf("%d%d",&a,&b);
	printf("a+b=%d,|a-b|=%d", a + b, abs(a - b));
}