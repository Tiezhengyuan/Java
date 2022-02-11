public class ExceptionInherit2 extends myTest{
    ExceptionInherit2(){
        System.out.println("parent");
    }
    void go() throws myExceptions{
        throw new myExceptions("parent exceptions");
    }
    public static void main(String[] args) throws myExceptions{
        new ExceptionInherit2().go();
    }
}


class myExceptions extends Exception{
    myExceptions(String msg){
        super(msg);
    }
}

class myTest{
    myTest(){
        System.out.println("child");
    }
    void go() throws myExceptions{
        throw new myExceptions("child exceptions");
    }
}