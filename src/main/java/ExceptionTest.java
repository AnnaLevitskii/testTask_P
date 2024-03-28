public class ExceptionTest {
    public static void main(String[] args) {
        pause();
        uncheckedExceptionDivisionBy0(5,0);
        try {
            withMyException(null);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pause(){
        checkedException();
    }
    public static void checkedException(){
        try {
            Thread.sleep(3000);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }finally {

        }
    }
    public static void uncheckedExceptionDivisionBy0(int a, int b){
        double res = 0;
        res =  (double) a /b;
        System.out.println(res); // this way a=5 b=0 => Infinity
    }
    public static void withMyException(String str) throws MyException {
        if(str==null) throw new MyException("my exception");
        else System.out.println(str);
    }
}
