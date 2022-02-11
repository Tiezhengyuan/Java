public class ForNested {
    static void test1(){
        char c = 'a';
        for(int i=1; i<= 3; i++)
        for(int j=0; j<= 2; j++) System.out.print(c++);
    }

    public static void main(String[] args){
        test1();
    }
}
