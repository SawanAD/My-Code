import java.util.Scanner;

public class toDarray {

    public static void main(String arg[]) {

        int m=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row and column of matrix in form of m*n");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter "+ (m*n) + " elements in matrix");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat [i][j] = sc.nextInt();
            }
            System.out.println();

        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(mat[i][j]+" ");
            }

            System.out.println();

        }

    }

}
