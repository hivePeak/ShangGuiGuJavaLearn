/** 变量
 * 作用
 1解释说明，增强可读性
 2方便调试
 特性
 不参与编译，.classs的字节码文件中不包含注释的内容

 文档注释，可以被JDK 的javadoc所解析，生成网页形式体现的说明文档
 使用方法javadoc -d mydoc -author -version HelloWorld.java

 文件文档注释写在class上方
 @author zhangchen
 @version 1.0

 */

public class HelloWorld{
    /**  方法文档注释写在方法上方
     */
    public static void main(String[] args){
        /*多行注释
        不能嵌套使用*/
        System.out.println("HelloChina");//单行注释


    }

}