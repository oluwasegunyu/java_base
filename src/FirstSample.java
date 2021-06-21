import java.math.*;
import java.util.*;
/**
 * 大数值
 * BigInteger和BigDecimal
 * @author yxy
 */
public class FirstSample{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("你想掷骰子多少次： ");
        int k = in.nextInt();

        System.out.print("你想掷多少点： ");
        int n = in.nextInt();

        /*
        计算阶乘
         */
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i=1;i<=k;i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("你中奖的概率是"+lotteryOdds+"分之一");
    }
}
