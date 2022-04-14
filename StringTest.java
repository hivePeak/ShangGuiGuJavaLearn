/**
 * Sting类型的使用
 * 1\String 属于引用数据类型， 翻译为字符串
 * 2、声明Sting变量时，应该引用一对""
 * 3、string可以和8种基本数据类型做运算，且运算只能是连接运算
 */
public class StringTest {
    public static void main(String[] args){
        String s1 = "test";
        System.out.println(s1);

        String s2 = "";
        System.out.println(s2);

        //char c1 = '';//编译不通过

        int i1 = 1001;
        System.out.println(s1+i1);
        String numStr = "学号";
        String stuNumStr = numStr + i1;//连接运算
        System.out.println(stuNumStr);

        //string的强制类型转换
        String str1 = "123";
        int num1 = Integer.parseInt(str1);//数据量大会导致精度缺失
        System.out.println(num1);//123


        //转换练习
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + c + num);//helloa10

        System.out.println("*   *");//*   *
        System.out.println('*' + '\t' + '*');//93
        System.out.println('*' + "\t" + '*');//*   *
        System.out.println('*' + '\t' + "*");//51*
        System.out.println('*' + ('\t' + '*'));//93
        System.out.println('*' + ('\t' + "*"));//*	*


        System.out.println(0b1101);//13
    }
}
