public class UseString{

    public static void main(String[] args) {
        //空字符串 ""
        String str = "是我字符串  ";
        int charLen = str.length();  //字符串长度
        System.out.println(charLen);

        int nameLen = "Jerry".length();
        System.out.println(nameLen);

        // String 变量名 = 字面量;
        String st = "中国123abc";

        // ()一对儿小括号代表方法
        int length = st.length();
        System.out.println("字符串的长度为："+length);

        //2.字符串比较
        String string1 = "Google 公司";
        String string2 = "Google 公司";

        // // 这句代码有意义吗？
        // string1.compareTo(string2);
        // 比较结果为 int型
        int result =  string1.compareTo(string2);
        // 条件判断语句
        if (result == 0) {
             System.out.println("字符串相等");
        }else {
            System.out.println("字符串不相等");
        }

        // 等号
        if (result == 0) {
            System.out.println("字符串相等");
        }else if (result >0) {
            System.out.println("字符串string1大");
        }else if(result < 0) {
            System.out.println("字符串string2大");
        }

        if (string1.compareToIgnoreCase(string2) == 0) {
            System.out.println("字符串相等");
        }else if (string1.compareToIgnoreCase(string2) >0) {
            System.out.println("字符串string1 大");
        }else if(string1.compareToIgnoreCase(string2) < 0) {
            System.out.println("字符串string大");
        }

        // 如果if 只有一条语句，{}可以省略
        if (string1.equals(string2))
        System.out.println("string1 等==于string2");

        // // 3查找字符串中的字符或子串 indexOf()
        // // 没找到返回-1
        // String country = "China America";

        // int index1 = country.indexOf("na");
        // System.out.println(index1);

        // int index2 =  country.indexOf("na", 5); // 没有返回-1
        // System.out.println(index2);

        // String cou = "naChi Americana";
        // int index3 = cou.lastIndexOf("na", 5);// 子串最后一次出现的位置
        // int index4 = cou.lastIndexOf("na");
        // System.out.println(index3);
        // System.out.println(index4);

        // String strLast="1234567893";
        // int last = strLast.lastIndexOf("3");
        // System.out.println(last);
        // // 前缀 后缀
        // boolean isStart = country.startsWith("Chi");
        // System.out.println(isStart);
        // boolean isStartWith = country.startsWith("Chi", 2);
        // System.out.println(isStartWith);

        // boolean isEnd = country.endsWith("ca");
        // System.out.println(isEnd);

        // //4从当前字符串中抽取子字符串
        // String sub1 = "piano voilion".substring(1);
        // System.out.println(sub1);

        // String sub2 = "piano voilion".substring(1,2);
        // System.out.println(sub2);
        // // "emptiness".substring(10); //返回 StringIndexOutOfBoundsException

        // String sub3 = "unhappy".substring(2);
        // System.out.println(sub3); // 返回 "happy"

        // String sub4 = "emptiness".substring(9);
        // System.out.println(sub4); //返回 "" (空串)

        // // 5字符串拼接
        // String s1 = "ABC";

        // String s2 = "XYZ";

        // s1 = s1.concat(s2); // 等同于 s1 = s1 + s2;
        // s1 = s1 + s2;

        // // 6:类 String 的成员方法 valueOf
        // String useValue = String.valueOf(1.2);
        // System.out.println(useValue);

        // //7:字符串分解
        // String name = "zhao,qian,sun,li";

        // String names[] = name.split(",");
        // System.out.println(names);

        // // (1)如果用“.”作为分隔的话,必须是如下写法:String.split("\\."),这样才能正确的分隔开,不能用 String.split(".");
        // // “.”和“|”都是转义字符,必须得加"\\" 转义
        // String namesAgain[] = "zhao|qian|sun|li".split("\\|");
        // System.out.println(namesAgain);

        // // 8替换 :返回一个新的字符串,它是将 s1 中的所有 char1 替换成的结果 char2
        // String replace = "replace".replace('e', 'a');
        // System.out.println(replace);
        // // 9大写
        // String upCase = "upcase".toUpperCase();
        // System.out.println(upCase);
        // // 10 全小写
        // String low = "LOWCASE".toLowerCase();
        // System.out.println(low);
        // // trim 去空格
        // String trim = " whiteSpace ".trim();
        // System.out.println(trim);

        // // 引用类转换成String;
        // int a[] ;
        // a = new int[3] ;
        // a[0] = 0 ;
        // a[1] = 1 ;
        // a[2] = 2 ;
        // System.out.println(a.toString());

        // // 将字符串转换成字符数组
        // char arr[] = "abcdefg".toCharArray();
        // System.out.println(arr);
    }
}