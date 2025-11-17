public class SelectionSort {
    public static void SelectionSorting(int a[])
    {
        for(int i=0; i<a.length-1; i++)
        {
            int minPos = i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[minPos]>a[j])
                {
                    minPos = j;
                }
            }
            int temp = a[i];
            a[i] = a[minPos];
            a[minPos] = temp;
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
    public static void main(String args[])
    {
        int a[] ={4,9,5,7,55,28,6,57};
        SelectionSorting(a);
        printArray(a);
    }
}
