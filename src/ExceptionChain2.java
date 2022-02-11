public class ExceptionChain2 {
    static String s = "-";
    public static void main(String[] args){
        new ExceptionChain2().go1();
        System.out.println(s);
    }
    void go1(){
        try{ go2(); }
        catch(Exception e){ s += "c"; }
    }
    void go2() throws Exception{
        // go3(); s += "2";
        // go3(); s += "2b";
        go3();
        int a= 0;
    }
    void go3() throws Exception{
        throw new Exception();
    } 
}
