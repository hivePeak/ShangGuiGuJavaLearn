
class VariableTest {
    VariableTest() {
    }

    public static void main(String[] var0) {
        byte var1 = 12;
        System.out.println(var1);
        short var2 = 1001;
        System.out.println(var2);

/* 数据类型之间的运算规则
*  自动类型提升
*   当容量小的数据类型变量与容量大的数据类型变量做运算是，结果激动提升为容量大的数据类型
*   byte \ char \ short --> int --> lone --> float --> double
*   当byte char short 三种变量做运算时，计算结果为int型 （同种计算也为int）  java 在做运算时，如果操作的数据均在int范围内，那么一律在int的空间内运算
 *  //强制类型转换
 * 1、需要使用强转符：（）  例：int in1 = (int)d1
 * 2、注意：强制类型转换，可能导致精度损失
* */
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
    }
}