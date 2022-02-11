import java.io.IOException;

public class ConstructorException extends Parent{
    ConstructorException() throws IOException{
        System.out.println("child");
    }
    public static void main(String[] args) throws IOException{
        new ConstructorException();
    }
}

class Parent{
    Parent() throws IOException {
        System.out.println("parent");
    }
}
