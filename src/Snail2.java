
public class Snail2
{
    static int width = 7;
    static int height = 8;
    static int arr[][] = new int[height][];
    static int num = 1;
    static int a = 0;
    static int b = 0;




    public static void main(String[] args)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new int[width];
        }

        moveRight();


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
        for (int i = a; i <= height; i++)
        {

            arr[i][width-1] = num;
            num ++;
            if (i == height)
            {
                width--;
                moveLeft();
            }
        }
    }

    public static void moveLeft()
    {
        for (int i = width-1; i >= b; i--)
        {
            arr[height][i] = num;
            num++;
            if (i == b)
            {
                moveUp();
            }

        }
    }

    public static void moveUp()
    {
        for (int i = height-1; i >= a; i--)
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
