public int getTemp(){
​
        return temp >0?temp:0;
    }
​
    // 构造方法不允许声明为 static 的
    public   GeneralFunction(){
​
​
    }
    // static 方法可以用类名而不是引用来访问
    public static int addUp(int x, int y) {
        /* 一个类的静态方法只能访问静态属性,否则出错,
        并且静态方法中不存在当前对象,因而不能使用“this”,当然也不能使用”super”;*/
​
        //temp = 10; 
        // 一个类的静态方法不能够直接调用非静态方法,否则出错
        // x = getTemp();
        temp();
        return x + y+t;
        
    }
​
    static void temp(){
​
​
    }
​
}
​
class GeneralFunctionSon  extends GeneralFunction{
    //  静态方法不能被非静态方法覆盖;
    public static int addUp(int x, int y) {
​
        return x+y;
    }
​
}
​
class Count {
​
    public static int counter;
    
    static {//只运行一次
        counter = 123;
        System.out.println("Now in static block.");
    }
​
    public void test(){
        System.out.println("test method=="+counter);
    }
}
