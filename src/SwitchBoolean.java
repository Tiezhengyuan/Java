public class SwitchBoolean {
    static void test(boolean val){
        String s = String.valueOf(val);
        switch(s){
            case "true":
                System.out.println("true");break;
            case "false":
                System.out.println("false");break;
            default:
                System.out.println("nothing");break;
        }
    }
    public static void main(String[] args) {
        test(true);
        test(false);
    }
}
