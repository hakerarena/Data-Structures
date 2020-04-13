#include<stdio.h>
#include<conio.h>
void main()
{
	int element,i,array[10]={112,21,13,24,35,12,4,21,50,43};
	clrscr();
	printf("Enter an element to be searched: ");
	scanf("%d",&element);
        for(i=0;i<10;i++)
	{
		if(arr[i]==element)
		{
			printf("\n%d found",element);
			break;
		}
	}
	if(i==10)
		printf("%d not found!",element);
        printf("Code provided by hakerarenatutorials.wordpress.com");
	getch();
}
