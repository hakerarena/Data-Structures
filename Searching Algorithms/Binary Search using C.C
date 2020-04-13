#include<stdio.h>
#include<conio.h>
void main()
{
	int arr[10],i,x,s,e,m,f=0;
	clrscr();
	printf("Enter elements in an array\n");
	for(i=0;i<10;i++)
		scanf("%d",&arr[i]);
	printf("\nEnter element to be searched");
	scanf("%d",&x);
	s=0;
	e=9;
	m=(s+e)/2;
	for(i=0;i<10;i++)
	{
		if(x==arr[m])
		{
			f=1;
			printf("\nElement found at %d location",m);
			break;
		}
  		else if(x>arr[m])
		{
			s=m+1;
			m=(s+e)/2;
		}
		else if(x<arr[m])
		{
			e=m-1;
			m=(s+e)/2;
		}
	}
	if(f==0)
		printf("Element not found");
	printf("Code provided by hakerarenatutorials.wordpress.com");
	getch();
}
