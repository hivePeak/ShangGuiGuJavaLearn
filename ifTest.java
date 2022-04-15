/**
 * # 程序流程控制
 *
 * 顺序结构
 * 从上到下逐行执行，中间没有任何判断和跳转。默认流程
 *
 * 分支结构
 * 根据条件选择性的执行某段代码
 * 有if-else和switch-case两种分支语言
 *
 * 循环结构
 * for\while\do-while
 *
 *
 * 分支语句种的if-else（条件判断语句）
 * if第一种 取一
 * if(条件表达式){
 *     执行表达语句
 * }
 *  第二种 二选一
 * if(条件表达式){
 *     执行表达语句1
 * }else{
 *     执行表达语句2
 * }
 *
 *  第三种:多选一
 * if(条件表达式){
 *     执行表达语句1
 * }else if(条件表达式){
 *     执行表达语句2
 * }else if(条件表达式){
 *     执行表达语句3
 * }
 *...else{执行表达式n
 *
 *Scanner
 * }
 */
import java.util.Scanner;

public class ifTest {
    public static void main(String[] args){
        //第一种
        int heartBeats = 79;
        if(heartBeats < 60 || heartBeats>100){
            System.out.println("需要进一步检查");
        }
        System.out.println("检查结束");

        //第二种
        int age = 23;
        if (age < 18){
            System.out.println("未成年");
        }else{
            System.out.println("成年");
        }

        //第三种
        if(age < 0){
            System.out.println("数入的数据不合规");
        }else if(age < 18){
            System.out.println("青少年");
        }else if(age < 35){
            System.out.println("青壮年");
        }else if(age < 60){
            System.out.println("中年人");
        }else {
            System.out.println("老年人");
        }

        //声明两个double型变量并赋值，判断第一个数大于10.0；第二个数小于20，打印两数只和，否则打印两数只差
        double max;
        double d1 = 12.3;
        double d2 = 32.1;
        max = (d1 > 10)? ((d2 < 20)? (d1 + d2): (d2 - d1)) : (d2 - d1);
        System.out.println(max);

        /*如何丛键盘获取不同的变量：需要使用Scanner类
        具体实现步骤：
            1.导包： import java .util.Scanner;
            2.Scan的实例化：Scanner scan = new(System.in);
            3.调用Scanner类的相关方法(next()/nextXxx()),来指定类型的变量。
        注意：根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException,导致程序终止。
        * */
//        Scanner scan = new Scanner(System.in);//实例化scan
//        System.out.println("请输入你的姓名：");
//        String name = scan.next();//字符
//        System.out.println(name);
//
//        System.out.println("请输入 'true' or 'false'");
//        boolean bTest = scan.nextBoolean();
//        System.out.println(bTest);
//
//        //输入两个数 求和
//        System.out.println("输入两个数，求和");
//        System.out.println("请输入第一个数");
//        int num1 = scan.nextInt();
//        System.out.println("请输入第二个数");
//        int num2 = scan.nextInt();
//        System.out.println("相加的结果为：" + num1+ num2);


        //输入 判断 返回值
//        Scanner scan = new Scanner(System.in);//实例化scan
//        System.out.println("请输入小明的成绩：(0~100)");
//        int score = scan.nextInt();
//        if (score > 100){
//            System.out.println("输入的值过大");
//        }else if(score == 100){
//            System.out.println("奖励一辆宝马");
//        }else if(score > 80 && score <= 99){
//            System.out.println("奖励一个iphone");
//        }else if(score > 60 && score <= 80){
//            System.out.println("奖励一个ipad");
//        }else{
//            System.out.println("没有奖励");
//        }

        //输入三个整数，并对他们从小到大排序
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("输入三个整数会他们从小到大排序的结果");
//        System.out.println("请输入第一个整数");
//        int num1 =scan.nextInt();
//        System.out.println("请输入第二个整数");
//        int num2 =scan.nextInt();
//        System.out.println("请输入第三个整数");
//        int num3 =scan.nextInt();
//
//        if(num1 >= num2){
//            if(num3 >= num1){
//                System.out.println(num1 + "," + num2 + "," + num3);
//            }else if(num3 <= num2){
//                System.out.println(num3 + "," + num2 + "," + num1);
//            }else{
//                System.out.println(num2 + "," + num3 + "," + num1);
//            }
//        }else{
//            if(num3 >= num2){
//                System.out.println(num1 + "," + num2 + "," + num3);
//            }else if(num3 <= num1){
//                System.out.println(num3 + "," + num1 + "," + num2);
//            }else{
//                System.out.println(num1 + "," + num3 + "," + num2);
//            }
//        }

        //练习
        boolean b =true;
//        if (b==false)
        if (b=false)
                System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");

    }
}
