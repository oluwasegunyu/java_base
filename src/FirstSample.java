/**
 * JAVA一共有8中基本类型
 * 4种整型：byte 1字节 short 2字节 int 4字节 long 8字节
 * 2种浮点型 float 4字节 double 8字节
 * char 字符型
 * @author yxy
 */
public class FirstSample{

    //枚举类型
    enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    Size aSize = Size.SMALL;

    public static void main(String[] args){
        //整型
        byte aByte = 12;
        short aShort = 12345;
        int aInt = 2123456789;
        long aLong = 9000000000000000000L; //长整型后面要加L

        System.out.println(aByte + " " + aShort  + " " + aInt + " " + aLong);

        //浮点型
        float aFloat = 3.400001F;
        double aDouble = 3.4000000001;

        System.out.println(aFloat + " " + aDouble);

        //char类型
        //代码点：与一个编码表中的某个字符对应的代码值。
        //代码单元：每个字符用16位表示，辅助字符用连续的代码单元表示
        String sentence = "四 is a number";
        int cpCount = sentence.codePointCount(0, sentence.length());
        for(int i =0 ; i< cpCount;) {
            int cp = sentence.codePointAt(i);
            System.out.print(sentence.charAt(i));
            if (Character.isSupplementaryCodePoint(cp))
                i += 2; //辅助字符占用2个代码单元
            else
                i++;//普通字符占用一个代码单元
        }
        System.out.println("");

        //boolean类型, java不能像C++那样int类型转换为boolean类型
        boolean aBoolean = true;
        if(aBoolean)
            System.out.println("aBoolean is true");

    }
}
