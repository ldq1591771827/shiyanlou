#include <stdio.h>
void main()
{
	int i, j;
	for (i = 1; i <= 12; i++) {
		if (i != 1 ) {
			printf("#");
		}
		for (j = 1; j <= 12; j++) {
			if (i ==1) {
				printf("*");
			}
			else if (i == 12) {
			
				printf("#");
			}
			else if (i == j&&i!=1&&i!=12) {
				printf("#");
			}
			else if (i ==13-j&&i!=1&&i!=12) {
				printf("*");
			}
			else {
				printf(" ");
			}
		}
		printf("\n");
	
	
	}


}