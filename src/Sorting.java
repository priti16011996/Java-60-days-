import java.util.*;
public class Sorting {
    public static void countingSort(int a[])
    {
        int Max = Integer.MIN_VALUE;
        //Finding Range For frequency Array
        for(int i=0; i<a.length; i++)
        {
            Max = Math.max(Max,a[i]);
        }
        //Counting Array based on given array element
        //Frequency Array
        int Count[] = new int[Max+1];
        for(int i=0; i<a.length; i++)
        {
            Count[a[i]]++;
        }
        //Sorting Array
        int j=0;
        for(int i=0; i<Count.length; i++)
        {
            while(Count[i]>0)
            {
                a[j] = i;
                j++;
                Count[i]--;
            }
        }
    }
    public static void printArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[]= {1,4,1,3,2,4,3,7};
        countingSort(a);
        printArray(a);
    }
}
