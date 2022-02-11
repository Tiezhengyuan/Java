public class MethodInstance extends Animal{
    public static void main(String[] args) {
        int good = 1;
        // System.out.println(getAge(good, 3));
        Animal c = new Animal();
        System.out.println(c.getAge(good, 3));
    }
}

class Animal{
    int getAge(int x, int y){
        System.out.println(x+y);
        return x+y;
    }
}