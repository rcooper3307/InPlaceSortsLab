package com.company;

public class Sorts {
    public static void bubbleSort(int[]arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    SortUtil.swap(arr,j+1, j);
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
}
