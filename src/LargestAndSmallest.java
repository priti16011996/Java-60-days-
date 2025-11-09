import java.util.*;
public class LargestAndSmallest {

    public static void LargestElemrnt(int a[])
    {
        int Max = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            if(a[i]> Max)
            {
                Max = a[i];
            }
        }
        System.out.println("Largest Element Of Array: "+Max);
    }
    public static void SmallestElement(int a[])
    {
        int Min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]< Min)
            {
                Min = a[i];
            }
        }
        System.out.println("Smallest Element: "+Min);
    }
    public static void main(String args[])
    {
        int a[] = {5,35,55,66,3,56,78,89,15};
        LargestElemrnt(a);
        SmallestElement(a);

    }
}
