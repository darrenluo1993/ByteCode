public class HelloByteCode {

    public String string;

    public static String stringStatic;

    public HelloByteCode helloByteCode;

    public static HelloByteCode helloByteCodeStatic;

    {
        System.out.println("非静态代码块被执行！");
        this.string = "这是一个字符串变量！";
    }

    static {
        System.out.println("静态代码块被执行！");
        stringStatic = "这是一个静态字符串变量！";
    }

    public HelloByteCode() {
        System.out.println("无参构造函数被执行！");
    }

    public void printInfo(String info) {
        System.out.println(info);
    }

    public static void main(String[] args) {
        System.out.println("系统名称");
        HelloByteCode obj = new HelloByteCode();
	obj.helloByteCode = obj;
	helloByteCodeStatic = obj;
	obj.printInfo("这是HelloByteCode类");
    }
}
