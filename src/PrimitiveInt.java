/*
1. primitive type: 
    boolean(true/false),
    byte(8 bit), short(16 bit), int(32 bit), long(64 bit),
    float(32 bit), double(64 bit)
    char(0-255)
2. default import
    no methods
    variables store value
    values rather than reference are passed into functions
3. byte/short/char are autmatically convert to int before binary operation.
*/

public class PrimitiveInt {
    public static void main(String[] args){
        int a1 = 4;
        int a2 = 4_9;
        int a, b, c=10;//a and b is declared but not initialized
        a=b=c; // a and b must be declared before
        int a11=3, 
        a12=4;// it is ok but not suggested

        int a4 = 013;  //octal, 8+3==11
        int a5= 0b110; //binary 4+2+0==6
        int a6 = 0x1E; //heaxadecimal 16+14==30
 
        //implicit casting
        int a8 = 'A'; //cast char to int unicode==65

        // explicit casting
        int a3 = (int) 4.3; // cast float
        int a7 = (int) 1.3E3; // cast double 1.3*1000==1300
        int a9 = (int) 3L;
        
        // 
        byte b1 = 3;
        byte b2 = (byte) 3.3;
        short c1 = 3;
        
        //unicode (UTF-8 format)
        char d1 = '\u004e';
        System.out.println(d1);
        int d2 = '\u004e';
        System.out.println(d2);

        // not compiling 
        // int a = _4;
        // int a=4, int b=10; can't repeat int iteral
        // int a=4; int a=10; can't repeat declaration
        // int a=4; b=4; miss int iteral
        // int c=4, float d=4; various type can't be declared in one line;
        // int a= 4_; _can't be put at head or tail
        // int a = 4.3; should explicitly cast
        // int a = 45L; can't automatically convert int to long
        // int a = 34l; can't convert to long
        // int a = 12345678900; out of range
        // int a = 0b12; wrong binary format
        // int a = 1E0; can't convert double to int
        // int x=y=z=10; y and z can't be resolved to a variable
    }
    
}
