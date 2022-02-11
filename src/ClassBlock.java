class ClassBlock{
    static int length;
    // only work when instantiation
    {
        length=10;
    }
    {
        System.out.println("class is instantiated.");
        System.out.println(length);
    }
    public static void main(String[] args){
        System.out.println(ClassBlock.length);
        ClassBlock c = new ClassBlock();


    }
}