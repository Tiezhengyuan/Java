/*
tenary operator: <> ? <> : <>

*/

public class OperatorTenary {

    public static void main(String[] args){
        // common pattern
        int x=3, y=4;
        int z = (x>y) ? x : y;
        //ok: int z = x>y ? x : y; 
        System.out.println(z);

        z = (x>y) ? (x*3) : (y*4);
        // ok: z = x > y ? x * 3 : y * 4;
        System.out.println(z);

        // shortcut
        z = (x<y) ? (x=1) : (y=2);
        System.out.print(x);
        // x<y is true. so y=2 doesn't execute
        System.out.print(y);
        System.out.println(z);

        z = (x<y) ? x++ : y++;
        System.out.print(x);//x is 2
        System.out.print(y); // y is 4
        System.out.println(z); //z is 1

        int p = x > 2 ? x < 4 ? 10 : 8 :7;
        System.out.println(p);
        // not compiling
        // z = (x<y) ? x : "horse"; cannot convert from String to int
    } 
    
}
