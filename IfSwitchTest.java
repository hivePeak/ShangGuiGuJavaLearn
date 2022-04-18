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
 * if
 * a\if-else是可以互相嵌套的
 * b\else 是可选的
 * c\if-else
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
 *
 *
 *
 * swich-case
 *  *
 *  * 分支结构
 *  * 1、格式
 *  * swich(表达式){
 *  *     case 常量1:
 *  *      执行语句1；
 *  *      //break
 *  *     case 常量2:
 *  *      执行语句2；
 *  *      //break
 *  * ...
 *  * default:
 *  *  执行语句n；
 *  *  //break
 *  * }
 *  *2\说明
 *  * a\根据swicth表达式中的值，一次匹配各个case中的常量，如果匹配成功，则进入相应case结构中，调用其执行语句。当调用完执行语句之后，则任然继续向下执行其他case中的语句。
 *  * 直到遇到break关键字或结构末尾 结束。
 *  *b\break,可以使用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构。
 *  *c\switch结构中的表达式，只能是如下的6种的数据类型之一，byte、short、char、int、枚举类型、String类型   不能放boolean类型
 *  *d\switch 是可选择加入的
 *  *e\case 只能申明常量。不能申明范围。
 *  *f\ defaukt相当于if-else结构中的else  是可选的，位置是灵活的
 *  *
 *  * 1、凡是可以使用switch-case都可以转换成if-else，反之不成立
 *  * 2、当写分值结构式，当发现即可以使用switch-case（case取值不会太多）又可以写if-else，有限选择switch-case。 原因：switch-case执行效率稍高！
 *
 *
 *
 */
import java.util.Scanner;

public class IfSwitchTest {
    public static void main(String[] args){
//        //第一种
//        int heartBeats = 79;
//        if(heartBeats < 60 || heartBeats>100){
//            System.out.println("需要进一步检查");
//        }
//        System.out.println("检查结束");
//
//        //第二种
//        int age = 23;
//        if (age < 18){
//            System.out.println("未成年");
//        }else{
//            System.out.println("成年");
//        }
//
//        //第三种
//        if(age < 0){
//            System.out.println("数入的数据不合规");
//        }else if(age < 18){
//            System.out.println("青少年");
//        }else if(age < 35){
//            System.out.println("青壮年");
//        }else if(age < 60){
//            System.out.println("中年人");
//        }else {
//            System.out.println("老年人");
//        }
//
//        //声明两个double型变量并赋值，判断第一个数大于10.0；第二个数小于20，打印两数只和，否则打印两数只差
//        double max;
//        double d1 = 12.3;
//        double d2 = 32.1;
//        max = (d1 > 10)? ((d2 < 20)? (d1 + d2): (d2 - d1)) : (d2 - d1);
//        System.out.println(max);

        /*如何丛键盘获取不同的变量：需要使用Scanner类
        具体实现步骤：
            1.导包： import java .util.Scanner;
            2.Scan的实例化：Scanner scan = new Scanner(System.in);
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
//        boolean b =true;
////        if (b==false)
//        if (b=false)
//                System.out.println("a");
//        else if(b)
//            System.out.println("b");
//        else if(!b)
//            System.out.println("c");
//        else
//            System.out.println("d");
//
//        //练习3
//        int dogAge = 6;
//        if(dogAge >=0 && dogAge <=2 ){
//            System.out.println("相当于人的年龄" + (dogAge * 5.5));
//        }else if(dogAge > 2){
//            System.out.println("相当于人的年龄" + ((dogAge - 2) * 4));
//            System.out.println("相当于人的年龄" + ((dogAge - 2) * 4) + (2 * 5.5));
//            System.out.println("相当于人的年龄" + (((dogAge - 2) * 4) + (2 * 5.5)));
//        }


        // 练习：假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
        //1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
        //2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
        //3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
        //4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
        //5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
        //double value = (int)(Math.random() * 90+10);//获取10~99的随机数 [0.1,1.0)  * 100 -->[0.0,90)--> (int)[10.0,100)=[10,99]
        int value = (int)(Math.random() * 90+10);
        System.out.println(value);//彩票号码
        //公式：[a,b]: (int)(math.random() * (b - a +1) + a)
        int valueShi = (int)(value % 100 / 10 );// ]
        int valueGe = (int)(value % 10);

        Scanner scan = new Scanner(System.in);//实例化
        System.out.print("请输入两位数彩票号码：");
        int lotteryNum = scan.nextInt();
        int lotteryShi = (int)(lotteryNum % 100 / 10 );// ]
        int lotteryGe = (int)(lotteryNum % 10);
        if(lotteryNum == value){
            System.out.println("奖金10 000美元");//如果用户输入的数匹配彩票的实际顺序
        }else if(valueShi == lotteryGe && lotteryShi == valueGe){
            System.out.println("奖金3 000美元");
        }else if(valueShi ==lotteryShi || lotteryGe== valueGe){
            System.out.println("奖金1 000美元");//如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字
        }else if(valueShi == lotteryGe || lotteryShi == valueGe){
            System.out.println("奖金500美元");
        }else{
            System.out.println("彩票作废");
        }

        // 练习：大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件
        //				高：180cm 以上、富：财富 1 千万以上、帅：是
        //			1.如果三个条件同时满足，则“我一定要嫁给他”
        //			2.如果三个条件有为真的情况，则“嫁吧，比上不足比下有余”
        //			3.如果三个条件都不满足，则“不嫁”
//        Scanner scan = new Scanner(System.in);//实例化
//        System.out.print("身高：（cm）");
//        int height = scan.nextInt();
//        System.out.print("财富：（千万）");
//        double money = scan.nextDouble();
//        System.out.print("是否帅(true/false）");
//        boolean isHandsome = scan.nextBoolean();
//
//        if(height >= 180 && money >= 1 && isHandsome){
//            System.out.println("我一定要嫁给他!!!");//
//        }else if(height >= 180 || money >= 1 || isHandsome){
//            System.out.println("嫁吧，比上不足，比下有余！！！");
//        }else {
//            System.out.println("不会嫁给他！！！");//
//        }




//        int number =2;
//        switch(number){
//            case 1:
//                System.out.println("1");
//            case 2:
//                System.out.println("2");
//                //break;
//            case 3:
//                System.out.println("3");
//        }
        //季节
//        String season = "summer";
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入季节：spring/summer/autumn/winter");
//        String season=scan.next();
//        switch (season) {
//            case "spring":
//                System.out.println("春暖花开");
//                break;
//            case "summer":
//                System.out.println("夏日炎炎");
//                break;
//            case "autumn":
//                System.out.println("秋高气爽");
//                break;
//            case "winter":
//                System.out.println("冬雪皑皑");
//                break;
//            default:
//                System.out.println("季节输入有误");
//                break;
//        }

        //判断 是否及格
//        Scanner sacn = new Scanner(System.in);
//        System.out.print("请输入分数：");
//        int score = sacn.nextInt();
//        switch(score/60){
//            case 0:
//                System.out.println("不及格");
//                //break;
//            case 1:
//                System.out.println("及格");
//  、    }

        //根据月份打印季节

        //输入 日期的year\month和day输出是  年的第几天
        // 判断闰年： 1、可以被400整除、2可以被4整除
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入year");
//        int year = scan.nextInt();
//        System.out.println("请输入month");
//        int month = scan.nextInt();
//        System.out.println("请输入day");
//        int day = scan.nextInt();
//        //定义sumDay保存天数：
//        int sumDay = 0;
//        switch(month){
//            case 12:
//                sumDay += 30;
//            case 11:
//                sumDay += 31;
//            case 10:
//                sumDay += 30;
//            case 9:
//                sumDay += 31;
//            case 8:
//                sumDay += 31;
//            case 7:
//                sumDay += 30;
//            case 6:
//                sumDay += 31;
//            case 5:
//                sumDay += 30;
//            case 4:
//                sumDay += 31;
//            case 3:
//                //sumDay += 30;
//                //判断是否闰年
//                if(year % 400 == 0 || year % 4 ==0){
//                    sumDay += 29;
//                }else{
//                    sumDay += 28;
//                }
//            case 2:
//                sumDay += 31;
//            case 1:
//                sumDay += day;
//        }
//        System.out.println("是今年的第" + sumDay + "天");

    }
}
