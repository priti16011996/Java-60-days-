public class ArrayCrud {

    public static void main(String args[])
    {
        int marks[] = new int[10];
        marks[0]=85;
        marks[1]=99;
        marks[2]=86;

        System.out.println("Physics Marks: "+marks[0]);
        System.out.println("Maths Marks: "+marks[1]);
        System.out.println("Chemistry Marks: "+marks[2]);

        marks[2]=89;
        System.out.println("Updated Chemistry Marks: "+marks[2]);
    }
}
