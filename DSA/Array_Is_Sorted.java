import java.util.Scanner;

public class Array_Is_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else{
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
