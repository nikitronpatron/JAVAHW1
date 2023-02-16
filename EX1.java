// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// С помощью цикла и условия заменить 0 на 1, 1 на 0.

public class EX1
{
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1};
        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == 1)
            {
                arr[i] = 0;
                System.out.print(arr[i]);
            }
            else if(arr[i] == 0)
            {
                arr[i] = 1;
                System.out.print(arr[i]);
            }
        }
    }
}