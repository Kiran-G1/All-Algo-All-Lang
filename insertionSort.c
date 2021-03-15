#include<stdio.h>

printMyArray(int *a, int size)
{

for(int i = 0; i<size; i++)
  {
  printf("%d\t",a[i]);
  }

}


insertionSort(int *a)
{
 printf("\napplying insertion sort\n");

for(int i=1;i<11;i++)
  {
  int key = a[i];
  printf("working on element %d \n",key);
  while(key < a[i-1] && i>0)
      {
      a[i]=a[i-1];
      i = i-1;
      }
   a[i]=key;
  printf("after %d iteration\n",i);
  printMyArray(a,11);
  }
}


main()
{

int a[11]={9,1,3,11,7,4,2,8,10,5,6};

printf("numbers before sorting:\n");

printMyArray(a,11);

insertionSort(a);

printf("\n after sorting\n");

printMyArray(a,11);


}
