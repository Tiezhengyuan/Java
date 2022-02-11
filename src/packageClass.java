class packageClass{
    private int b;
    int c;
    // wrong: private PrivateClass(int b){...}
    packageClass(int b){
        this.b = b;
    }
    // wrong: private void Print(){...}
    void Print(){
        System.out.println(this.b);
    }
}