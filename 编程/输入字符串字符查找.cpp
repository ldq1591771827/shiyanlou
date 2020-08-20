#include <stdio.h>
void main()
{
	char s[80], c,zf,i=0;
	int countchar(char s[80], char c);
	scanf("%c", &c);
	printf("请输入一个字符串：");
	scanf("%s",s);
	puts(s);
	printf("%c", s[1]);
	printf("请输入要查找的字符：");
	countchar( s, c);
	printf("字符%c的个数是%d个", c, countchar(s, c));
}
int countchar(char s[80], char c)
{
	int i=0,n=0, sum = 0;
	char *p;
	p = s;
	while (s[i] != '\n') {
		n++;
		i++;
	}

	for (i = 0; i < n; i++) 
		if (s[i] == c) {
			sum++;
		}
	
return sum;



}