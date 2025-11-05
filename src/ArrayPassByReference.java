import java.util.*;

public class ArrayPassByReference {
    public static void updateArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i]+1;
        }
    }
    public static void main(String args[])
    {
        int marks[] ={22,34,56};
        updateArray(marks);
        for(int i=0; i<marks.length; i++)
        {
           System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
