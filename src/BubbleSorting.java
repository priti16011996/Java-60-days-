public class BubbleSorting {
    public static void bubbleSort(int a[])
    {
          for(int i=0; i<a.length-1; i++)
          {
              for(int j=0; j<a.length-1-i; j++)
              {
                  if(a[j]>a[j+1])
                  {
                      int temp = a[j];
                      a[j] = a[j+1];
                      a[j+1]=temp;
                  }
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
    public static void main(String args[])
    {
        int a[] ={4,9,5,7,55,28,6,57};
        bubbleSort(a);
        printArray(a);
    }
}
