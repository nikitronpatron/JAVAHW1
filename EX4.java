// 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы.

public class EX4
{
    public static void main(String[] args)
    {
        int max = 0;
        int min = 2147483647;
        int[] arr = {444, 34, 6, 563, 2356, 14, 976, 1, 6457, 55, 9941};
        for(int i = 0; i < arr.length; i++)
        {
            if(max >= arr[i])
            {
                continue;
            }
            else if(max < arr[i])
            {
                max = arr[i];
            }
            
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(min <= arr[i])
            {
                continue;
            }
            else if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.printf("Max = %d, min = %d", max, min);
    }   
}
