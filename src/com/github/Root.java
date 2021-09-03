package com.github;

import com.github.SortHandler;

public class Root {
    public static void main(String[] args) {
        int a[]={3,2,1,4,5};
        int sortedArray[] = SortHandler.selectionSort(a);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+" ");
        }
    }
}
