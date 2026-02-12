import java.util.Scanner;
public class bubblesort
{
    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        int i, j, k, l, len, temp = 0;
        System.out.print("Enter the length of the array: ");
        len = scr.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the numbers: ");
        for(i = 0; i < len; i++)
        {
            arr[i] = scr.nextInt();
        }
        for(j = 0; j < len-1; j++)
        {
            for(k = 0; k < len-j-1; k++)
            {
                if(arr[k] > arr[k+1])
                {
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(l = 0; l <= len-1; l++)
        {
            System.out.print(arr[l]+ ", ");
        }
    }
}