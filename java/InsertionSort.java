public class InsertionSort{


    public static void printMyArray(int [] myArray)
    {
        for(int i =0 ; i<myArray.length; i++)
        {
            System.out.print(myArray[i]+"\t");
        }
        System.out.println("\n");
    }

    public int [] sort(int [] arrToSort)
    {
        for(int i=1;i<arrToSort.length;i++)
        {
            int workingElement = arrToSort[i];
            System.out.println("working on key:\t"+arrToSort[i]+"\n");
            while(i>0 && workingElement < arrToSort[i-1])
            {
                arrToSort[i]=arrToSort[i-1];
                i = i-1;
            }
            arrToSort[i]=workingElement;
            printMyArray(arrToSort);
        }
       return arrToSort;

    }

    public static void main(String[] args)
    {

        InsertionSort insertionSort = new InsertionSort();

        int [] ArrayToBeSorted = {9,1,3,11,7,4,2,8,10,5,6};
        printMyArray(ArrayToBeSorted);

        int[] sortedArray = insertionSort.sort(ArrayToBeSorted);

        System.out.println("After Sorting");

        printMyArray(sortedArray);


    }
}