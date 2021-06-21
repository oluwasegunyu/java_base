import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组
 * @author yxy
 */
public class FirstSample{
    public static void main(String[] args){
        //一维数组
        int[] intArray = new int[100];
        for(int i=0;i<100;i++){
            intArray[i] = i;
        }
        for(int i=0;i<intArray.length;i++){
           System.out.print(intArray[i] + " ");
        }
        System.out.println();

        //for each循环输出数组内容
        for(int element:intArray){
            System.out.print(element+ " ");
        }
        System.out.println();

        //数组初始化形式
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        smallPrimes = new int[] {17, 19, 23, 29, 31, 37}; //用匿名数组重新初始化一个数组
        for (int element:smallPrimes){
            System.out.print(element + " ");
        }
        System.out.println();

        //数组拷贝
        int[] luckyNumbers = smallPrimes;
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2*luckyNumbers.length);
        System.out.println("copiedLuckyNumber数组的长度是： " + copiedLuckyNumbers.length);
        for (int element:copiedLuckyNumbers){
            System.out.print(element + " ");
        }
        System.out.println();

        //命令行参数
        if(args[0].equals("-h")) //与C++不同第一个参数不是程序名
            System.out.print("Hello, ");
        else if(args[0].equals("-g"))
            System.out.print("Goodbye, ");
        for(int i = 1; i< args.length;i++)
            System.out.print(" " + args[i]);
        System.out.println("!");

        //数组排序
        Scanner in = new Scanner(System.in);

        System.out.print("你想掷几次？ ");
        int k = in.nextInt();

        System.out.print("一共多少个数字？ ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        //向numbers数组填充数字
        for(int i=0;i<numbers.length;i++){
            numbers[i] = i + 1;
        }
        //投掷结果放入数组result
        int[] result = new int[k];
        for(int i=0;i<result.length;i++){
            //获取随机数
            int r = (int)(Math.random()*n);
            //保存数据
            result[i] = numbers[r];
            //将数组最后一个数字填充到取出的数字位置
            numbers[r] = numbers[n-1];
            n--;
        }
        //数组排序
        Arrays.sort(result);
        System.out.println("中奖号码是： ");
        for(int r:result)
            System.out.print(r + " ");
        System.out.println();
    }
}
