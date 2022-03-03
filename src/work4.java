import java.util.Scanner;
import java.util.Random;
public class work4 {
    public static void main(String[] args){
        //构建键盘监听与随机数
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("请输入班级人数");
        int num = sc.nextInt();
        //根据输入数据创建数组
        int[] arr = new int[num];
        //声明分数和与不及格人数
        int count = 0;
        int sum = 0;
        //为数组填充数据，并判断不及格个数
        for(int i = 0; i< arr.length; i++) {
            int r =rd.nextInt(101);
            arr[i] = r;
            if (arr[i] <60)
                count++;
        }
        //累加求和
        for (int i : arr) {
            sum += i;
        }
        //输出需要的内容
        System.out.println("和为"+sum);
        System.out.println("不及格人数为"+count);
        System.out.println("平均分"+sum/num);
    }

}
