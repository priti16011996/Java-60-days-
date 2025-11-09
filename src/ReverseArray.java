public class ReverseArray {

    public static void ReverseArrayElements(int a[])
    {
        int n = a.length-1;
        int Start = 0;
        int End = n;

        while(Start<End)
        {
            int temp = a[End];
            a[End] = a[Start];
            a[Start]= temp;
            Start++;
            End--;
        }
    }
    public static void main(String args[])
    {
        int a[] = {2,4,6,8,10,12,14,16,18,20};
        ReverseArrayElements(a);
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
