/** Created by stasa on 29.7.16.. **/

import java.util.Random;

public class NearestLocker
{
    public static int[][] get2DLockerLocation(int xLength, int yWidth, int[] xCordinates, int[] yCordinates)
    {
        int distance;
        int[][] Dist = new int[xLength][yWidth];


        for (int x = 0; x < xLength; x++)
        {
            for (int y = 0; y < yWidth; y++)
            {
                Dist[x][y] = xLength + yWidth;

                for (int i = 0; i < xCordinates.length; i++)
                {
                    distance = ( Math.abs( xCordinates[i] - (x + 1) ) ) + ( Math.abs(yCordinates[i] - (y + 1) ) );
                    Dist[x][y] = Dist[x][y] > distance ? distance :  Dist[x][y];
                }

            }

        }
        return Dist;
    }

    public static void main(String[] args)
    {
        Random r = new Random();
      
        int xLength2 = 5;
        int yWidth2 = 5;
        int[] xCordinates2 = new int[2];
        int[] yCordinates2 = new int[2];

        xCordinates2[0] = r.nextInt(5) + 1;
        yCordinates2[0] = r.nextInt(5) + 1;
        xCordinates2[1] = r.nextInt(5) + 1;
        yCordinates2[1] = r.nextInt(5) + 1;

        int[][] m2 = new int[yWidth2][xLength2];

        m2 = get2DLockerLocation(xLength2, yWidth2,  xCordinates2, yCordinates2);

        for (int i = 0; i < xLength2; i++) {
            for (int j = 0; j < yWidth2; j++) {
                System.out.print(m2[i][j]);
            }

            System.out.println();
        }

    }

}
