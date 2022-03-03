import java.util.Scanner;
import java.util.Random;
public class work4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int r =rd.nextInt(100);

        int num = sc.nextInt();
        int[] arr = new int[num];

        int count = 0;
        int sum = 0;
        for(int i = 0; i<num; i++) {
            arr[i] = r;
            System.out.println("随机数"+r);
            if (arr[i] <60);
                count++;
        }
        for (int j = 0; j<num;j++) {
            sum = arr[j];
            sum += sum;

        }
        System.out.println("和为"+sum);
        System.out.println("不及格人数为"+count);
        System.out.println("和为"+sum);
    }

}
