public class operatorAssignment extends Test{
    public static void main(String[] args){
        // assign value
        int a =4;
        System.out.println(a=5);

        // assign object to reference variable.
        Test t1 = new Test();
        Test t2 = t1;
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
    }
}

class Test{

}
