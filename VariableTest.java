/**变量 与 数据类型 、进制
 *变量概念：
 内存中的一个存储区域
 此区域的数据可以在同一类型范围内不断变化
 变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值。

 变量的作用：
 用于在内存中保存数据
 定义变量的格式：
 数据类型 变量名 = 变量值;  int ordNum = 3;
 或 数据类型 变量名;      变量名 = 变量值；

 使用变量注意：
 java中背个变量必须先声明，后使用  (必须要定义、声明并赋值过)
 使用变量名来访问这块区域的数据

 变量的作用域：其定义所在的一对{}内
 变量只有在其作用域内才邮箱

 同一个作用域内，不能定义重名的变量

 # 变量的数据类型：
 基本数据类型
 整型：byte -128~127 (1字节=8个bit  2^8 256)
    short 2字节 -2^15~2^15-1
    int 4字节 约21亿  -2^31~2^31-1  使用最多的
    lone 8字节   -2^63~2^63-1 (必须以’L’ ,’l’结尾  大小写L)
 浮点: —小数点
    float：4字节，单精度，7位有效数字，通常很难满足需求  因为有科学计数的存在，范围比long大
    double 8字节 精度是float的两倍(必须以’F’ ,’f’结尾  大小写F)
 字符:char 2字节  通常使用一对’’,内部只能使用一个字符，或者ascii码。
 布尔:boolean  ture\flase  ，常常在条件判断，循环中使用  — Boolean类型在实际编译过程中都是转化为int类型进行底层运算的

 引用数据类型（
 类class[字符串]、
 接口interface、
 数据组[]）

 变量类型-位置分类
    成员变量：在方法体外，类体内声明的变量。
    实例变量：不以static修饰
    类变量：以static修饰
 局部变量：在方法体声明的变量称为局部变量。
    形参：方法、构造器中定义的变量
    方法局部变量：在方法内定义
    代码块局部变量：在代码块中定义

 * 变量 与 数据类型 、进制
 *
 * boolean
 *  自动类型提升
 *   当容量小的数据类型变量与容量大的数据类型变量做运算是，结果激动提升为容量大的数据类型
 *   byte \ char \ short --> int --> lone --> float --> double
 *   当byte char short 三种变量做运算时，计算结果为int型 （同种计算也为int）  java 在做运算时，如果操作的数据均在int范围内，那么一律在int的空间内运算
 *  //强制类型转换
 * 1、需要使用强转符：（）  例：int in1 = (int)d1
 * 2、注意：强制类型转换，可能导致精度损失
 *
 *
 * * Sting类型的使用
 *         * 1\String 属于引用数据类型， 翻译为字符串
 *         * 2、声明Sting变量时，应该引用一对""
 *         * 3、string可以和8种基本数据类型做运算，且运算只能是连接运算
 *
 *  # 变量之进制 非重点
 * 二进制（binary）：0，1以0b或0B开头  //转二进制java 原生方法 Integer.toBinaryString(int i)
 * 八进制 （decimal）：以数字0开头
 * 十进制（octal）：0~9满10进一   //转十进制java 原生方法 Integer.toOctalString(int i)
 * 十六进制（hex）：以0x或0X开头  //转十六进制java 原生方法 Integer.toHexString(int i)
 * 原码、反码、补码
 *
 */


class VariableTest {
    VariableTest() {
    }

    public static void main(String[] var0) {
        byte var1 = 12;
        System.out.println(var1);
        short var2 = 1001;
        System.out.println(var2);


        //自动类型提升
        byte b1 = 2;
        int i1 = 129;
        int b2 = b1 + i1;
        System.out.println(b2);

        float f = b1 + i1;
        System.out.println(f); //123.0


        //强制类型转换


        long i2 = 122;
        short s2 = (short)i2;
        System.out.println(s2); //122 精度未损失

        double d1 = 12.9;
        int in1 = (int)d1;//截断操作
        System.out.println(in1); //12 精度损失

        int in2 = 128;
        byte by2 =(byte)in2;
        System.out.println(by2);//-128 精度损失


        //整型常量，默认为int，浮点型常量，默认为double
        long l2 = 122;// 不加L默认为int
        System.out.println(l2);

        //long l3 = 1333333333331;不加L默认为int,超过int最大
        long l3 = 1333333333331l;
        System.out.println(l3);


        //float f5 = 12.9;//末尾不加F编译不通过
        float f5 = 12.9f;

        //boolean的使用
        boolean isMarry = false;
        if (isMarry) {
            System.out.println("不能参加单身party了");
        }else{
            System.out.println("你可以多谈女朋友");
        }

        /**
         * Sting类型的使用
         */
        String s1 = "test";
        System.out.println(s1);

        String s22 = "";
        System.out.println(s22);

        //char c1 = '';//编译不通过

        int i11 = 1001;
        System.out.println(s1+i11);
        String numStr = "学号";
        String stuNumStr = numStr + i11;//连接运算
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

        /*进制转换
        十进制 转二进制
        除以2取余的逆  13/2 =6余1  6/2 =3余0 3/2=1余1  1/2=0余1   1011 的逆为 1101
        二进制转十进制
        乘2的幂数
        二进制转八进制： 3个一位  如111101 拆为 111 101 就是7 5  八进制 为 075
        八进制转2进制：每一位拆成三位的2进制   057   5  7  为  101 111  二进制为 101111
        二进制转十六进制：4个合成一位
        十六进制转二进制：一位拆4位
        */

        //转10进制   //Integer.toOctalString(int i)
        System.out.println(Integer.toOctalString(0b1111));//17

        //练习   ，0~255（二进制为1111 1111）范围整数，十进制转16进制。例如60的16进制表示形式3C
        int int1 = 60;
        int int2 = int1 & 15;//取得二进制的后四位的   求与 15 (二进制 1111)
        System.out.println(int2);//13
        String j = (int2 >9)? (char)(i2-10+'A') + "":int2 + "";// 二进制（四位）转16进制
        int temp = int1 >>> 4;// 右移四位 ，求四位的二进制
        int2 = temp & 15;
        String k = (int2 > 9)?(char)(i2-10+'A') + "":int2 + "";
        System.out.println(k + "" + j);//17
    }
}