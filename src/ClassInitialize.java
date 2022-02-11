/*How initialize variables
1. initialize instant variable by block and then constructor, or 
 update by object if access is default/public/protected.
2. initialize static variable by static block
3. initialize by order of class block, constructor

*/ 
public class ClassInitialize {
    public static void main(String[] args){
        Good c= new Good(10);
        c.gender = 'F';
        c.height = 200;
        System.out.println(c.age);
        System.out.println(c.gender);
        System.out.println(c.height);
    }
    
}

class Good{
    int age;
    int height;
    static char gender;
    {
        System.out.println("A");
    }
    Good(int age){
        age=1;
        System.out.println("B");
    }
    static {
        gender = 'N';
    }
    {
        height = 100;
    }
    {
        System.out.println("C");
    }
}

