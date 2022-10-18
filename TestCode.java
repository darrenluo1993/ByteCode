public class TestCode {
    public static void main(String[] args) {
        String param = System.getProperty("param");
	System.out.println(param);
        int p = Integer.parseInt(args[0]);
        System.out.println(new TestCode().foo(p));
    }

    public int foo(int p) {
        int x;
        try {
            x = 100;
            x = 100 / p;
            return x;
        } catch (Exception e) {
            x = 200;
            return x;
        } finally {
            x = 300;
        }
    }
}
