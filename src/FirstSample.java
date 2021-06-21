/**
 * 数学函数
 * @author yxy
 */
public class FirstSample{ //标准的类名规范：类名是以大写字母开始的单词采用驼峰命名法，源代码的文件名必须与类名相同。
    public static void main(String[] args){
        //数学函数包括sqrt，pow，sin, cos,exp等还有PI等常数
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);

        System.out.println(Math.PI * Math.pow(x,2)); //半径为x的圆的面积
    }
}
