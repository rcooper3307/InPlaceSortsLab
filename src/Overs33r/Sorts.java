package Overs33r;

public class Sorts {
    public static void bubbleSort(String[]arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
            {
                if(arr[j].length() < arr[j+1].length())
                {
                    SortUtil.stringSwap(arr,j+1, j);
                }
            }
    }
    public static void selectionSort(double[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            SortUtil.doubleSwap(arr, i,(SortUtil.minimum(arr, i)));
        }
    }
    public static void insertionSort(int[] arr)
    {
        //loop through the entire array, use an index i
        for(int i = 0; i < arr.length; i++)
        {
            //loop from index i back to the beginning of the array, use index j
            for(int j = i; j > 0; j--)
            {
                //if element at j-1 is greater than element at j, swap them
                if(arr[j-1] > arr[j])
                {
                    SortUtil.swap(arr,j-1,j);
                }
                //else set j  to 0
                else
                {
                    j = 0;
                }
            }

        }
    }

}
