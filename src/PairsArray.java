public class PairsArray {
    public static void printPairsArray(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            int Curr = a[i];
            for(int j=i+1; j<a.length; j++)
            {
                System.out.print("("+Curr+","+a[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int a[] = {10,15,26,2,76,12};
        printPairsArray(a);
    }
}
