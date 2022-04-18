/**
 *   *
 *   循环语句的四个组成部分
 * 1初始化部分 init_statement
 * 2循环条件部分 test_exp  —boolean类型
 * 3循环体部分 body_statement
 * 4迭代部分 alter_statement
 *
 * for循环的结构
 * for(1;2;4){
 *     3
 * }
 *
 * 执行过程，1-2-3-4-2-3-4-2-3-4...2
 *
 * * While循环的使用
 *  *
 *  *  * 1初始化部分 init_statement
 *  *  * 2循环条件部分 test_exp  —boolean类型
 *  *  * 3循环体部分 body_statement
 *  *  * 4迭代部分 alter_statement
 *  *
 *  *  While循环的结构
 *  *  1
 *  *  while（2）{
 *  *      3;
 *  *      4;
 *  *  }
 *  *  执行过程，1-2-3-4-2-3-4-2-3-4...2
 *  *
 *  *  !!写while循环千万晓鑫必要丢了迭代条件，一旦丢了，就可能导致死循环
 *  *  写程序要避免死循环！！
 *  *
 *  *  for循环和while循环是可以相互转换的！！
 *  *  区别：for循环和while循环的初始化条件部分的作用范围不同
 *  *
 *  *
 *  * do-while循环结构
 *  * 1
 *  * do{
 *  *     3;
 *  *     4
 *  * }while(2);
 *  * 执行过程：1-3-4-2-3-4-2-3-4...2
 *  *说明，do-while循环至少回执行一次循环体
 *  *  开发中使用for和while更多，使用do-while较少
 *
 * 嵌套循环！
 * 嵌套循环：一个循环体a里面嵌入另一个循环b。
 * 外层循环：a
 * 内层查询：b
 *
 */
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args){

        //输出10个 hello world
//        for(int i = 1 ; i <= 10; i++){
//            System.out.println("Hello word");//
//        }


        //练习
//        int num = 1;
//        for(System.out.println("1");  num <= 3; System.out.println("4"),num++){
//            System.out.println("2");//
//        }

        //练习：遍历10以内的偶数,输出所有偶数的和
//        int even_sum = 0;
//        for(int even_num = 0;    even_num <=20; even_num++){
//            if(even_num % 2 == 0){
//                System.out.println(even_num+"是偶数");
//                even_sum += even_num;
//
//            }
////            (even_num % 2 == 0)? (System.out.println(even_num+"是偶数")):(System.out.println(even_num+"是奇数"));//
//
//        }System.out.println("总和为：" + even_sum);

        //编写一个从1到150的循环，并在每行打印一个值，另外在每个3的倍数行打印"foo"，在5的倍数行打印"biz",在10的倍数行打印"baz";
//        for(int i = 1;i<=150;i++){
//            System.out.print(i);
//            if(i%3==0){
//                System.out.print(" foo");
//            }
//            if(i%5==0){
//                System.out.print(" biz");
//            }
//            if(i%7==0){
//                System.out.print(" baz");
//            }
//            System.out.println("");
//        }

        //输入两个正整数a和b，求其最大公约数和最小公倍数
        //调用java.util.Scanner可以获得从键盘输入的数字;
//        Scanner scan= new Scanner(System.in);
//        //定义两个整型数字的变量
//
//        System.out.print("请输入第一个数：");
//        int a= scan.nextInt();//nextInt();方法用来获取输入的Int NUM
//        System.out.print("请输入第二个数：");
//        int b= scan.nextInt();
//
//        //获取两个数的较小值
//        int minAB = (a < b)? a:b;
//        //获取公约数
//        for(int ii = minAB; ii >= 1 ; ii--){
//            if(a % ii == 0 && b % ii == 0){
//                System.out.println(a + "和" + b + "的最大公约数是：" + ii);
//                break;
//            };
//        }
//        //获取两个数的较小值
//        int maxAB = (a > b)? a:b;
//        //获取最小公倍数
//        for(int ii = maxAB; ii <= a * b ; ii++){
//            if( ii % a == 0 && ii % b == 0){
//                System.out.print(a + "和" + b + "的最小公倍数是：" + ii);
//                break;
//            };
//        }

        //练习 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
        //说明：1\不在循环条件部分限制次数的结构：for(;;) 或while(ture);2\结束方式有2种方式： 方式一：循环条件返回false 方式二：在循环体中执行break;
//        Scanner sacn = new Scanner(System.in);
//
//        int positiveNum = 0;
//        int negative = 0;
//        //for循环方法
//        for(;;){
//        //while循环方法
//        //while(true){  //跟for(;;){ 可以互换
//            int x = sacn.nextInt();
//            //判断输入时正数还是负数
//            if(x > 0){
//                positiveNum++;
//            }else if(x < 0){
//                negative++;
//            }else if(x == 0){
//                    break;
//            }
//        }
//        System.out.println("正数的个数是：" + positiveNum);
//        System.out.println("负数的个数是：" + negative);

        //嵌套循环 99乘法表
//        for(int i =1;i <= 9;i++){//控制行数
//            for(int j =1;j <= i;j++){//控制列数
//                System.out.print(j + " * " + i + " = " + (j*i) +"; " );
//            }
//            System.out.println();
//        }

        //打印7行的菱形
//        int size = 7;
//        if (size % 2 == 0) {
//            size++; // 计算菱形大小
//        }
//        for (int i = 0; i < size / 2 + 1; i++) {
//            for (int j = size / 2 + 1; j > i + 1; j--) {
//                System.out.print(" "); // 输出左上角位置的空白
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("*"); // 输出菱形上半部边缘
//            }
//            System.out.println(); // 换行
//        }
//        for (int i = size / 2 + 1; i < size; i++) {
//            for (int j = 0; j < i - size / 2; j++) {
//                System.out.print(" "); // 输出菱形左下角空白
//            }
//            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
//                System.out.print("*"); // 输出菱形下半部边缘
//            }
//            System.out.println(); // 换行
//        }

        //打印心型
        System.out.print("\n\n打印心型-----------------------------\n");
		for (float y = (float) 1.5; y > -1.5; y -= 0.1) {
        for (float x = (float) -1.5; x < 1.5; x += 0.05) {
            float a = x * x + y * y - 1;
            if ((a * a * a - x * x * y * y * y) <= 0.0) {
                System.out.print("*");
            } else
                System.out.print(" ");
        }
        System.out.println();
    }

    }
}
