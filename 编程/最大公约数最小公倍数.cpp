#include <stdio.h>
void main()
{
	int x, y;
	int maxgyshu(int x, int y);
	printf("请输入两个正整数：");
	scanf("%d%d", &x, &y);
	printf("正整数%d和正整数%d的最大公约数是：%d，最小公倍数是：%d", x, y, maxgyshu(x, y), x*y / maxgyshu(x, y));
}
int maxgyshu(int x, int y)
{
	int i,temp,sz1,sz2;
	if (x > y) {
		temp = x;
		x = y;
		y = temp;
	}
	sz1 = x;
	sz2 = y;
	while (sz2!=0) {
		temp = sz1%sz2;
		sz1 = sz2;
		sz2 = temp;
	
	}
	return sz1;
}