package com.company;

public class SortUtil {
    public static void swap(int[]arr, int x, int y)
    {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void doubleSwap(double[]arr, int x, int y)
    {
        double temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int[] randIntArray(int count)
    {
        int arr[] = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*count+1);
        }
        return arr;
    }
    public static int[] randDoubleArray(int count)
    {
        double arr[] = new double[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (Math.random()*count+1);
        }
        return arr;
    }
    public static boolean isSorted(int[]arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkSum(int[] before, int[] after)
    {
        int beforeSum = 0;
        int afterSum = 0;
        for(int i = 0; i < before.length; i++)
        {
            before[i] += beforeSum;
        }
        for(int i = 0; i < after.length; i++)
        {
            after[i] += afterSum;
        }
        if(beforeSum != afterSum)
        {
            return false;
        }
        return true;
    }
    public static int minimum(double[] arr, int ind)
    {
        int minInd = ind;
        for(int i = ind; i < arr.length; i++)
        {
            if(arr[i] < arr[minInd])
            {
                minInd = i;
            }
        }
        return minInd;
    }
}
