public class LambdaValidate {
    int age;
    String name;

    //validate age
    static boolean ValidateAge(int age){
        if(age<=0) {
            System.out.println("age should >=1");
            return false;
        }else if(age>=150) {
            System.out.println("age should <=150");
            return false;
        }
        return true;
    }
    // validate name
    static boolean ValidateName(String name){
        if(name == null || name.length()==0){
            System.out.println("name should not be empty");
            return false;
        }
        return true;
    }

    // define interface
    interface ValidateInteger{
        boolean Validate(int a);
    }

    // define a method
    void UpdateAge(int age, ValidateAttr v){
        if ( v.Validate(age)) {
            this.age = age;
            System.out.println("age is " + age);
        }else{
            System.out.println("wrong age input");
        }
    }
    public static void main(String[] args) {
        LambdaValidate c = new LambdaValidate();

        // validate age
        ValidateInteger valAge = age -> {
            return age>=1 && age<150;
        };
        c.UpdateAge(34,  valAge);
        c.UpdateAge(450,  valAge);
        c.UpdateAge(0,  valAge);

    }
    
}
