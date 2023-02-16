// 3. Создать квадратный двумерный целочисленный массив
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами

public class EX3
{
    public static void main(String[] args)
    {
        int n = 5;
        int[][] arr = new int [n][n];
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j <= arr.length - 1; i++)
            {
                if(i != j && i + j == n)
                {
                    arr[i][j] = 1;
                    System.out.printf("%d", arr[i][j]);
                }
                else if(i == j)
                {
                    arr[i][j] = 1;
                    System.out.printf("%d", arr[i][j]);
                }
                else if(i != j && i + j != n)
                {
                    arr[i][j] = 0;
                    System.out.printf("%d", arr[i][j]);
                }
            }
        }
    }
}
