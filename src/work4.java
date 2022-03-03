import java.util.Scanner;
import java.util.Random;
public class work4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("请输入班级人数");
        int num = sc.nextInt();
        int[] arr = new int[num];

        int count = 0;
        int sum = 0;
        for(int i = 0; i< arr.length; i++) {
            int r =rd.nextInt(101);
            arr[i] = r;
            if (arr[i] <60)
                count++;
        }
        for (int j = 0; j<arr.length;j++) {
            sum += arr[j];
        }
        System.out.println("和为"+sum);
        System.out.println("不及格人数为"+count);
        System.out.println("平均分"+sum/num);
    }

}
