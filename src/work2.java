import java.util.Scanner;
public class work2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("新建");
            case 2 -> System.out.println("打开文件");
            case 3 -> System.out.println("保存");
            case 4 -> System.out.println("刷新");
            case 5 -> {
                System.out.println("退出");
                System.exit(0);
            }
        }
    }
}
