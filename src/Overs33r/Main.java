package Overs33r;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] testArr = SortUtil.randIntArray(10);
        System.out.print("Insertion Sort Before: ");
        for (int num:testArr)
        {
            System.out.print(num + " ");
        }


        System.out.println();
        //Sorting method
        Sorts.insertionSort(testArr);
        //Print of the array after the sort
        System.out.print("Insertion Sort After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println();
        String[] testArr2 = SortUtil.randStringArray(10,5);
        System.out.print("Bubble Sort Before: ");
        for (String num:testArr2)
        {
            System.out.print(num + " ");
        }


        System.out.println();
        //Sorting method
        Sorts.bubbleSort(testArr2);
        //Print of the array after the sort
        System.out.print("Bubble Sort After: ");
        for (String num:testArr2)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println();
        double[] testArr3 = SortUtil.randDoubleArray(10);
        System.out.print("Selection Sort Before: ");
        for (double num:testArr3)
        {
            System.out.print(num + " ");
        }


        System.out.println();
        //Sorting method
        Sorts.selectionSort(testArr3);
        //Print of the array after the sort
        System.out.print("Selection Sort After: ");
        for (double num:testArr3)
        {
            System.out.print(num+" ");
        }
    }
}
