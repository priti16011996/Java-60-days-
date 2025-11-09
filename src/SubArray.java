public class SubArray {

    public static void printSubArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            int start = i;
            for(int j=i; j<a.length; j++)
            {
                int end = j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int a[] ={10,15,20,14,56,86};
        printSubArray(a);
    }
}
