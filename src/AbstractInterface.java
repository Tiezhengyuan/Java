/*
interface collects abstract type of methods and constant variables.
1.interface can't be instantiated. methods have not method body.
2. default access for interface is public.
    not protected/private/final
3. default access of methods is public abstract. 
    not protected/private
4. no static method. static variable must be constant - "public static final"
*/

public class AbstractInterface {
    public static void main(String[] args){
        Birds b = new Birds();
        b.getLegs();
    }
}


// define interface
// must have public or 
interface Fly{
    abstract void setFly(int times);
}
interface Walk{
    // default access is public abstract
    int getLegs();
}
interface Swim{
    public abstract double getDive();
}


class Birds implements Walk, Fly, Swim{
    // public can't be omitted
    public int getLegs(){
        System.out.println("number of legs");
        return 10;
    } 
}