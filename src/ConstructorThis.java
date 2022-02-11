/* how and when use "this" in constructor.
"this." denotes attribute of an object.
"this." can be used in constructor or methods
Omitting "this." shows that this is static or local variable. 
*/ 
public class ConstructorThis {
    int a=-1;
    static int b=-1;
    String c;
    // it is ok to add return identifier and retrun statement
    //but that is not suggested.
    public int ConstructorDefine(){
        return 1;
    }
    public ConstructorThis(){
        // it is ok to omit this but not suggested.
        // not suggested: a=1;
        this.a=1;
        // it is ok to add this but not suggested.
        // not suggested: this.b=1;
        b=2;
    }
    public ConstructorThis(int a){
        // Note: no update this.a 
        // It is different reference though identical names
        a = a+1;
    }
    // the argument "c" override the class attribute "c".
    public ConstructorThis(String c){
        // this.c doesn't update
        //here, c is local variable define by argument
        // c=c;
        c=this.c;
    }
    // methods
    public void Print(){
        // must come with this or not compiling
        System.out.println(this.a);
        // it is ok to add this, but not suggested.
        System.out.println(b);
    }
    public static void main(String[] args){
        ConstructorThis c1 = new ConstructorThis();
        c1.Print();
        
        int a=3;
        ConstructorThis c2 = new ConstructorThis(a);
        //object a differs from int a though identical names
        System.out.println(c2.a);
        System.out.println(a);

        String c="abc";
        ConstructorThis c3 = new ConstructorThis(c);
        System.out.println(c3.c);
    }

    
}
