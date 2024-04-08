package day3;

public class GetNumber {
    public static void main(String[] args)
    {
        getOperationsCount(3);
        System.out.println( "loop for  "  + getOperationsCount(3));
    }
    public static long getOperationsCount(int n) { // t(n) =3(n^2) 3*n + 3
        long counter = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                counter++;
            }

        }

        return counter;
    }

}
