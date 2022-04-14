/**
 * 算数运算符
 * 赋值运算符  不会改变数据类型
 * 比较运算符    比较运算符的结果是boolean类型
 * 逻辑运算符
 * 位运算符     1、都是操作整型的数据；2、在一定的范围内 << 等于 *2，>>等于 /2
 * 三元运算符
 *
 算数运算符	描述	例子
 +	加法 - 相加运算符两侧的值	A + B 等于 30
 -	减法 - 左操作数减去右操作数	A – B 等于 -10
 *	乘法 - 相乘操作符两侧的值	A * B等于200
 /	除法 - 左操作数除以右操作数	B / A等于2
 ％	取余 - 左操作数除以右操作数的余数	B%A等于0
 ++	自增: 操作数的值增加1	B++  先运算后取值或 ++B 先取值后原酸
 --	自减: 操作数的值减少1	B-- 或 --B
  *
 赋值运算符	描述	例子
 =	简单的赋值运算符，将右操作数的值赋给左侧操作数	C = A + B将把A + B得到的值赋给C
 + =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
 - =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C - A
 * =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
 / =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A，C 与 A 同类型时等价于 C = C / A
 （％）=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
 << =	左移位赋值运算符	C << = 2等价于C = C << 2
 >> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
 ＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
 ^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
 | =	按位或赋值操作符	C | = 2等价于C = C | 2
 *
 比较运算符  描述	例子
 ==	检查如果两个操作数的值是否相等，如果相等则条件为真。	（A == B）为假。
 !=	检查如果两个操作数的值是否相等，如果值不相等则条件为真。	(A != B) 为真。
 > 	检查左操作数的值是否大于右操作数的值，如果是那么条件为真。	（A> B）为假。
 < 	检查左操作数的值是否小于右操作数的值，如果是那么条件为真。	（A <B）为真。
 >=	检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。	（A> = B）为假。
 <=	检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。	（A <= B）为真。
 *
 逻辑运算符	描述	例子
 && 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。	（A && B）为假。
 ||	称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。	（A | | B）为真。
 !	称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。	！（A && B）为真。
 &
 |
*
 A = 0011 1100
 B = 0000 1101
 -----------------
 A&B = 0000 1100
 A | B = 0011 1101
 A ^ B = 0011 0001
 ~A= 1100 0011
 操作符	描述	例子
 ＆	如果相对应位都是1，则结果为1，否则为0	（A＆B），得到12，即0000 1100
 |	如果相对应位都是 0，则结果为 0，否则为 1	（A | B）得到61，即 0011 1101
 ^	如果相对应位值相同，则结果为0，否则为1	（A ^ B）得到49，即 0011 0001
 〜	按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	（〜A）得到-61，即1100 0011
 << 	按位左移运算符。左操作数按位左移右操作数指定的位数。在一定范围内为*2	A << 2得到240，即 1111 0000
 >> 	按位右移运算符。左操作数按位右移右操作数指定的位数。在一定范围内为/2	A >> 2得到15即 1111
 >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。	A>>>2得到15即0000 1111
 *
 条件运算符  也被称为三元运算符 (? :)  该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。
 1、结构：（条件表达式) ? 表达式1 ：表达式2；   variable x = (expression) ? value if true : value if false
 2、说明: a\条件表达式的结果为boolean类型
         b\根据条件表达式真或假，决定执行表达式1，还是表达式2；  如果表达式位ture 则执行表达式1，如果表达式为false，则执行表达式2；
         c\表达式1与表达式2 要求是一致的
        d、三元运算符可以嵌套使用
 3、三元运算符与if-else的关系： a、三元运算符可件货 if-else 语句；b、三元运算符要求必须返回一个结果；c、if后的代码块可有多个语句；
 4、三元运算符可以嵌套使用
 5、三元运算符都可以改写成 if-else； if-else 不一定都能改成三元运算符；   优先选三元运算符、三元简洁、效率高、if-else适用性广 ；

 *
 运算符的优先级
 */

public class AriTest{
    /** 方法描述 运算符*/
    public static void main(String[] arg){
        //除号：/  11/5=2 余1  得2
        int num1 = 11;
        int num2 = 5;
        int result1= num1 / num2;
        System.out.println(result1);//2


        System.out.println(result1 + 0.0);//2.0

        //取余：%   11/5=2 余1  得1
        //结果符号与被模数符号相同
        //开发中经常用取模符%判断能否被除净的情况。   0位除干净
        int result2= num1 % num2;
        System.out.println(result2);//1

        //++ 不会改变数据类型，超过计算范围值时，回到最低位置  如btye a1 = 127； a1++；//-128  (01111111 变为 10000000)
        //++(X):先自增1再运算
        //(X)++:先运算再自增1
        int ax = 1;
        System.out.println("ax++) =" + ax++) ;
        System.out.println("ax++) =" + ax++) ;
        int ay = 1;
        System.out.println("++ay) =" + ++ay) ;


        int a1 = 10;
        int b1 = ++a1;
        int c1 = a1++;
        System.out.println("a1 = "+ a1 + ",b1 = "+b1 + ",c1 = " + c1) ;

        byte aa1 = 127;
        aa1++;
        System.out.println(aa1++);

        byte aa2 = -1;
        aa2++;
        System.out.println(aa2++);


        int a2 = 10;
        int b2 = a1++;
        System.out.println("a2 = "+ a2+ ",b2 = "+b2);

        //答打印三位数整数，打印显示他的个位数、十位数、百位数的值。
        int num = 187;
        int bai = num/100;
        int shi = num%100/10;// 187%100 = 87 87/10 =8  int shi = num/10%10
        int ge = num % 10;
        System.out.println("百位数为：" + bai);//1
        System.out.println("十位数为：" + shi);//8
        System.out.println("个位数为：" + ge);//7

        //赋值符号：==
        int i1 = 10;
        int j1 = 10;
        //连续赋值
        int i2,j2;
        i2=j2=10;
        int i3=10,j3=10;

        //+=
        int num11=10;
        num11 += 2;//num11 = num11 + 2
        System.out.println(num11);//12

        //%=
        int num22 = 12;
        num22 %= 5;//num2 = num % 5
        System.out.println(num22);//2

        //练习
        int n =10;
        n += (n++) + (++n);//n= n + n++ + ++n     n= 10 + 10 +12
        System.out.println(n);//32

        //==
        int i = 10;
        int j = 20;
        System.out.println(i == j);//false
        System.out.println(i <= j);//true
        System.out.println(i = j);//20

        boolean bb1 = true;
        boolean bb2 = false;
        System.out.println(bb2 == bb1);//false
        System.out.println(bb2 = bb1);//ture



        //区分==与=的区别
        boolean bbb2 = false;
        if (bbb2 == true)
            System.out.println("结果为真");//
        else
            System.out.println("结果为假");//
        if (bbb2 = true)
            System.out.println("结果为真");//
        else
            System.out.println("结果为假");//

        // && ||
        boolean ba1 = true;
        boolean ba2 = false;
        System.out.println(ba1&ba2);
        System.out.println(ba1&&ba2);

        //区分& 与 &&
        //相同点1：& 与 && 的计算结果相同
        //相同点2：当符号左边是 ture时，二者都会执行符号右边的运算
        //不同点：当符号左边是false时，&继续执行符号右边的运算 ，&&不在执行符号右边的运算
        boolean bx1 =true;
        bx1 =false;
        int numx1 =10;
        if(bx1 & (numx1++ > 0)){
            System.out.println(">");
        }else{
            System.out.println("<");
        }
        System.out.println("numx1 =" + numx1);

        boolean bx2 =true;
        bx2 =false;
        int numx2 =10;
        if(bx2 && (numx2++ > 0)){
            System.out.println(">");
        }else{
            System.out.println("<");
        }
        System.out.println("numx2 =" + numx2);

        // 区分 | 与 ||
        //相同点1：| 与 || 的计算结果相同
        //相同点2：当符号左边是 ture时，二者都会执行符号右边的运算
        //不同点：当符号左边是false时，| 继续执行符号右边的运算 ，|| 不在执行符号右边的运算
        boolean by1 =true;
        by1 =false;
        int numy1 =10;
        if(bx1 & (numy1++ > 0)){
            System.out.println(">");
        }else{
            System.out.println("<");
        }
        System.out.println("numy1 =" + numy1);

        boolean by2 =true;
        by2 =false;
        int numy2 =10;
        if(bx2 && (numx2++ > 0)){
            System.out.println(">");
        }else{
            System.out.println("<");
        }
        System.out.println("numy2 =" + numy2);

        //>> <<
        int int1 =21;
        int int2 =-21;
        System.out.println("int1<<2 :" + (int1 << 2));
        System.out.println("int1<<3 :" + (int1 << 3));
        System.out.println("int1<<27 :" + (int1 << 27));
        System.out.println("int2<<2 :" + (int2 << 2));
        System.out.println("int2<<3 :" + (int2 << 3));
        System.out.println("int2<<27 :" + (int2 << 27));

        //& | ^

        int int3 =12;
        System.out.println("BinaryInt3 :" + Integer.toBinaryString(int3));//1100
        int int4 = 5;
        System.out.println("BinaryInt4 :" + Integer.toBinaryString(int4));//101
        // & 如果相对应位都是1，则结果为1，否则为0
        System.out.println("Binary(int3 & int4) :" + Integer.toBinaryString((int3 & int4)));//100
        System.out.println("int3 & int4 :" + (int3 & int4));//4
        // |	如果相对应位都是 0，则结果为 0，否则为 1
        System.out.println("Binary(int3 | int4) :" + Integer.toBinaryString((int3 | int4)));//1101
        System.out.println("int3 | int4 :" + (int3 | int4));//13
        // ^ 如果相对应位值相同，则结果为0，否则为1
        System.out.println("Binary(int3 ^ int4) :" + Integer.toBinaryString((int3 ^ int4)));//1001
        System.out.println("int3 ^ int4 :" + (int3 ^ int4));//9


        //练习:交换两个变量的值
        int num111 = 10;
        int num112 = 20;

        //方式一：定义一个临时变量， 推荐使用
        int tempNum;
        tempNum = num111;
        num111 = num112;
        num112 = tempNum;
        System.out.println("num111:" + num111 + ",num112:" + num112);//num111:20,num112:10

        //方式二：累加后相减；  好处不用定义临时变量，弊端：1、相加可能超出存储范围；2、有局限性（只能适用于数值类型）
        num111 = num111+num112;
        num112 = num111 - num112;
        num111 = num111 - num112;
        System.out.println("num111:" + num111 + ",num112:" + num112);//num111:10,num112:20

        //方式三：使用位运算符     弊端：有局限性（只能适用于数值类型）
        num111 = num111 ^ num112;
        num112 = num111 ^ num112;
        num111 = num111 ^ num112;
        System.out.println("num111:" + num111 + ",num112:" + num112);//num111:20,num112:10

        //三元运算符
        int m = 12;
        int nx = 5;

        int max = (m > nx)? m : nx;
        System.out.println(max);

        double nun = (m > n)? 2 :1.0;
        //(m > n)? 2: "n大"；//编译错误

        nx=12;
        String maxStr = (m > nx)? "m大" : ((m == nx)? "m和nx相等":"nx大");
        System.out.println(maxStr);

        //练习：获取三个数的最大值
        int nn1 = 12;
        int nn2 = 30;
        int nn3 = -42;

        //方法一  //推荐、效率高、可读性高   方法二和方法三可以拆分为方法一
        int max1 =(nn1 > nn2)? nn1 : nn2;
        int max2 =(max1 > nn3)? max1 : nn3;
        System.out.println("三个数中的最大值为：" + max2);//三个数中的最大值为：30

        //方法二
        int max3 = (nn1 > nn2)? ((nn1 > nn3)? nn1 : nn3) : ((nn2 > nn3)? nn2 : nn3);//先第一个跟第二个比，然后第一个/第二个 跟第三个比
        System.out.println("三个数中的最大值为：" + max3);//三个数中的最大值为：30

        //方法三
        int max4 = ((((nn1 > nn2)? nn1: nn2) >nn3)?  ((nn1 > nn2)? nn1: nn2) : nn3);//第一个和第二个比完跟第三个比，然后第一个和第二个比完的结果跟第三个比
        System.out.println("三个数中的最大值为：" + max4);//三个数中的最大值为：30

        //改写if-else
        if(nn1 > nn2){
            if (nn1 > nn3){
                System.out.println("if-else三个数中的最大值为：" + nn1);//三个数中的最大值为：30
            }
            else{
                System.out.println("if-else三个数中的最大值为：" + nn3);//三个数中的最大值为：30

            }

        }else{
            if (nn2 > nn3){
                System.out.println("if-else三个数中的最大值为：" + nn2);//三个数中的最大值为：30
            }
            else{
                System.out.println("if-else三个数中的最大值为：" + nn3);//三个数中的最大值为：30
            }
        }





    }
}
