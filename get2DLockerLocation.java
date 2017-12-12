/**  Created by stasa on 29.7.16.. **/
public class NearestLocker
{
    private static int[][] get2DLockerLocation(int xLength, int yWidth, int[] xCordinates, int[] yCordinates)
    {
        int distance;
        int[][] Dist = new int[yWidth][xLength];

        for (int y = 0; y < yWidth; y++) {
            for (int x = 0; x < xLength; x++) {

                Dist[y][x] = xLength + yWidth;

                for (int i = 0; i < yCordinates.length; i++) {
                    distance = ( Math.abs( yCordinates[i] - (y + 1) ) ) + ( Math.abs(xCordinates[i] - (x + 1) ) );
                    Dist[y][x] = Dist[y][x] > distance ? distance :  Dist[y][x];
                }

            }

        }
        return Dist;
    }

    public static void main(String[] args)
    {
        // Test Case
        int xLength = 3;
        int yWidth = 5;
        int[] xCordinates = new int[1];
        int[] yCordinates = new int[1];

        xCordinates[0] = 1;
        yCordinates[0] = 1;

        int[][] m = new int[yWidth][xLength];

        m = get2DLockerLocation(xLength, yWidth,  xCordinates, yCordinates);

        for (int i = 0; i < yWidth; i++) {
            for (int j = 0; j < xLength; j++) {
                System.out.print(m[i][j]);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // Test Case
        int xLength2 = 5;
        int yWidth2 = 7;

        int[] xCordinates2 = {2, 4};
        int[] yCordinates2 = {3, 7};

        int[][] m2 = new int[yWidth2][xLength2];

        m2 = get2DLockerLocation(xLength2, yWidth2,  xCordinates2, yCordinates2);

        for (int i = 0; i < yWidth2; i++) {
            for (int j = 0; j < xLength2; j++) {
                System.out.print(m2[i][j]);
            }

            System.out.println();
        }

    }

}
