import java.sql.SQLOutput;

public class SpiralMatrix {
    public static void printSpiralMatrix(int a[][])
    {
        int StartRow =0;
        int StartCol =0;
        int EndRow = a.length -1;
        int EndCol = a[0].length-1;

        while(StartRow <= EndRow && StartCol <= EndCol)
        {
            //Top
            for(int j=StartCol; j<=EndCol; j++)
            {
                System.out.print(a[StartRow][j]);
            }
            //Right
            for(int i=StartRow+1; i<=EndRow; i++)
            {
                System.out.print(a[i][EndCol]);
            }
            //Bottom
            for(int j=EndCol-1; j>=StartCol; j--)
            {
                if(StartRow == EndRow)
                {
                    break;
                }
                System.out.print(a[EndRow][j]);
            }

            //left
            for(int i= EndRow-1; i>=StartRow+1; i--)
            {
                if(StartCol == EndCol)
                {
                    break;
                }
                System.out.print(a[i][StartCol]);
            }
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;

        }
    }

    public static void main(String[] args) {
        int matrix[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printSpiralMatrix(matrix);
    }
}
