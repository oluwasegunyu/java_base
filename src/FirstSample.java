/**
 * 字符串
 * @author yxy
 */
public class FirstSample{ //标准的类名规范：类名是以大写字母开始的单词采用驼峰命名法，源代码的文件名必须与类名相同。
    public static void main(String[] args){
        //字串
        String greeting = "hello";
        String s = greeting.substring(0,3);
        System.out.println(s);

        //拼接
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        //字符串是否相等
        if("hello".equals(greeting)){
            System.out.println("greeting is " + greeting);
        }

        //构建字符串
        StringBuilder builder = new StringBuilder();
        builder.append(greeting);
        builder.append(" yu"); //添加字符串
        String completeString = builder.toString();
        System.out.println(completeString);
    }
}
