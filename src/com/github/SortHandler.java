package com.github;

public class SortHandler {

    static int[] insertionSort(int arr[])
    {
        int j = 0;
        for(int i = 0 ;i<arr.length-1;i++)
        {
            int pivot = arr[i+1];
            j = i;
            while(arr[j]>pivot)
            {
                arr[j+1]=arr[j];
                j--;
                if(j==-1){
                    break;
                }
            }
            arr[j+1]= pivot;
        }
        return arr;
    }

}
