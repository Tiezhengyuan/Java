/*
    float is assumed to double unless 'f' postfix is added.
*/ 

public class PrimitiveFloat {
    public static void main(String[] args){
        float a2 = 3.4f;
        float a1 = (float) 3.4; //double to float
        double a3 = 3.4;
        float a4= 3; // upcast int to float
        float a5 = 3L;
        float a6 = 0b11; // cast binary int to float
        float a7 = 'a';
        // float a1 = 3.4; cant convert double to float

    }
}
