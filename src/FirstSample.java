import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.*; //Scanner类在util包中
/**
 * 输入输出
 * @author yxy
 */
public class FirstSample{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
/*
        //读取一行
        System.out.print("你的名字： ");
        String name = in.nextLine();
        System.out.println("你的名字是： "+name);

        //读取数字
        System.out.print("你的年龄： ");
        int age = in.nextInt();
        System.out.println(name + "你好，明年你就"+ (age+1) + "岁了");

        //格式化输出
        double x = 1000/3.0;
        System.out.printf("%08.2f", x);
*/
        //文件输入输出
        PrintWriter out = new PrintWriter("/home/yxy/Documents/study/Java/java_base/myfile.txt", "UTF-8");
        out.println("hello myfile");//写入文本
        out.flush(); //写入之后需要清空缓存才能读取
        //从文件中读取
        Scanner inFormFile = new Scanner(Paths.get("/home/yxy/Documents/study/Java/java_base/myfile.txt"), "UTF-8");
        String wordsFromFile = inFormFile.nextLine();//读取一行文本
        System.out.println(wordsFromFile);
    }
}
