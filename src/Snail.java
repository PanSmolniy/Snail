/**
 * Created by PC on 07.12.2015.
 */

/*
1 2 3 4 5 6 7
26 27 28 29 30 31 8
25 44 45 46 47 32 9
24 43 54 55 48 33 10
23 42 53 56 49 34 11
22 41 52 51 50 35 12
21 40 39 38 37 36 13
20 19 18 17 16 15 14
 */
public class Snail
{

    static int width = 7;
    static int height = 8;
    static int arr[][] = new int[height][];
    static int num = 1;
    static int a = 0;
    static int b = 0;




    public static void main(String[] args)
    {

        // инициализация
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new int[width];
        }
        moveRight();

        //Вывод на экран
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void moveRight()
    {
        for (int i = a; i < width; i++)
        {

            arr[a][i] = num;
            num++;
            if (i == width-1)
            {
                a++;
                height--;
                moveDown();
            }
        }
    }

    public static void moveDown()
    {
        for (int i = a; i < height; i++)
        {

            arr[i][width-1] = num;
            num ++;
            if (i == height-1)
            {
                width--;
                moveLeft();
            }
        }
    }

    public static void moveLeft()
    {
        for (int i = width; i > b; i--)
        {
            arr[height][i] = num;
            num++;
            if (i == b+1)
            {
                moveUp();
            }

        }
    }

    public static void moveUp()
    {
        for (int i = height; i >= a; i--)
        {
            arr[i][b] = num;
            num++;
            if (i == a)
            {
                b++;
                moveRight();
            }
        }
    }

}
