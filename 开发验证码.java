package com.study;
 
import java.util.Random;
 
public class Test3 {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println("随机验证码：" + code);
    }
    
    //1、定义一个方法返回一个随机验证码
    public  static String createCode(int n){
        //3、定义一个字符串变量记录生成的随机字符
        String code = "";
        Random r = new Random();
        //2、定义一个for循环，循环n次，依次生成随机字符
        for (int i = 0; i < n; i++) {
            //3、生成一个随机字符：英文大写 小写 数字（0 1 2）
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    //大写字符（A 65 —— Z 65+25） 编号范围(0-25)+65
                    char ch = (char)(r.nextInt(26)+25);
                    code += ch;
                    break;
                case 1:
                    //小写字符（a 97 —— z 97+25） 编号范围(0-25)+97
                    char ch1 = (char)(r.nextInt(26)+97);
                    code += ch1;
                    break;
                case 2:
                    //数字字符
                    code += r.nextInt(10);//0-9
                    break;
            }
        }
        return code;
    }
}