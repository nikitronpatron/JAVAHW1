// 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2.

public class EX2
{
    public static void main(String[] args)
    {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] < 6)
            {
                arr[i] *= 6;
                System.out.printf("%d ", arr[i]);
            }
            else if(arr[i] >= 6)
            {
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
