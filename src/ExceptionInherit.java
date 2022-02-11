public class ExceptionInherit extends myTest{
    ExceptionInherit(){
        System.out.println("parent");
    }
    public static void main(String[] args) throws myExceptions{
        new ExceptionInherit().go();
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