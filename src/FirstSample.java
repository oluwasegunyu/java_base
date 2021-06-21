import sun.awt.X11.XSystemTrayPeer;

/**
 * 变量与运算符
 * @author yxy
 */
public class FirstSample{
    public static final double CM_PER_INCH = 2.54; //常量
    public static void main(String[] args){
       double paperWidth = 8.5;
       System.out.println("paper size in centimeters: " + paperWidth * CM_PER_INCH);

       //boolean运算符
        //&&与 ||或 !非
        boolean aBoolean = true;
        boolean bBoolean = false;
        if(aBoolean && bBoolean){
            System.out.println("aBoolean && bBoolean is true");
        }else{
            System.out.println("aBoolean && bBoolean is false");
        }

        if(!bBoolean){
           System.out.println("!bBoolean is true");
        }

        //位运算
        //&与 |或 ^异或 ～非
        int n = 8;
        int fourthBitFromRight = (n & 0b1000) / 0b1000;
        System.out.println("fourthBitFromRight is: " + fourthBitFromRight);

        //>>> 右移高位填充0 >> 右移高位填充符号位
        fourthBitFromRight = (n & (1 << 3)) >> 3;
        System.out.println("fourthBitFromRight is: " + fourthBitFromRight);
    }
}
