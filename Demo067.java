import java.util.*;

public class Demo067 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int [] num = new int[n];

        System.out.println("Enter " + n + "number :");
        for(int i = 0; i < n; i++ ){
            num [i] = sc.nextInt();
        }
        System.out.println("Even elements in array: ");
        for(int arr : num){
            if(arr % 2 == 0){
                System.out.println(arr + " ");
            }
        }

    }
}
