import java.lang.Integer;

public class OperatorEqual extends A{
    public static void main(String[] args){
        System.out.println("primitive");
        System.out.println(5==5.00);

        Integer i = 3;
        int j =3;
        System.out.println(i==j); //true
        System.out.println(i.equals(j)); //true

        // assignment
        boolean x = true;
        boolean y = x = false;
        System.out.println(x==y);

        System.out.println("\ncompare string");
        // create one object
        String a = "A";
        String b = "A";
        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true

        System.out.println("\ncreate two string objects");
        String c = new String("A");
        String d = new String("A");
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true

        System.out.println(a==d);//false
        System.out.println(a.equals(d));//true

        String n = new String("A");
        String m = n;
        System.out.println(m==n);//true
        System.out.println(m.equals(n));//true

        System.out.println("\n object:");
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1==a2);//false
        System.out.println(a1.equals(a2));//false
        A a3=a1;
        System.out.println(a1==a3);//true
        System.out.println(a1.equals(a3));//true

    }
    
}


class A{}