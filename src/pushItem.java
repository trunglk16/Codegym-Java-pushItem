import java.util.Arrays;
import java.util.Scanner;

public class pushItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0,0,0,0,0};

        System.out.println("Nhap vi tri can them phan tu ");
        Scanner input2 = new Scanner(System.in);
        int index = input2.nextInt();
        if (index < 0 || index > arr.length-1){
            System.out.println("Ban da nhap sai vi tri");
        }else {
            System.out.println("Nhap gia tri can them vao");
            Scanner input = new Scanner(System.in);

            for (int i = arr.length-1; i > index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = input.nextInt();
            System.out.println(Arrays.toString(arr));
        }




    }
}
