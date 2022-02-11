/*
standard approach:
1. case statements are usually ordered in value, and
    default statemnt is on the end of all case statements.
    but the order doesn't matter;
2. break statement are suggeted for each case statement.
    omitting break statments is ok but may cause side effect
3. only execute default and case statements. 
    Other blocks will cause not compiling
4. should variable in switch statement. expression will cause error.
    should be value or final variable in case statement. 

*/

public class SwitchDefine {
    static void test1(int day){
        // must be variable
        switch(day){
            // must be value with the same type
            // should have break statement
            case 'M':
                System.out.print("Monday ");  break;
            case 'T':
                System.out.print("Tuesday "); break;
            // default is optional
            default:
                System.out.print("Nothing "); break;
        }
        System.out.print("\n");
    }

    // if no break statement. select one entrance and execute till end
    static void test2(int day){
        switch(day){
            case 'M':
                System.out.print("Monday ");
            case 'T':
                System.out.print("Tuesday ");
            default:
                System.out.print("Nothing ");
        }
        System.out.print("\n");
    }

    // no order is ok.
    static void test3(int day){
        switch(day){
            default:
                System.out.print("Nothing ");break;
            case 'M':
                System.out.print("Monday "); break;
            case 'T':
                System.out.print("Tuesday ");break;
        }
        System.out.print("\n");
    }

    //only execute default and case statements
    static void test4(int day){
            switch(day){
                // not compiling
                // if(day>3) {
                //     System.out.print("good "); 
                // }
                case 'M':
                    System.out.print("Monday "); break;
                    // not compiling:
                    // System.out.print("good "); 
                case 'T':
                    System.out.print("Tuesday ");break;
                default:
                    System.out.print("Nothing ");break;
            }
            System.out.print("\n");
    }

    // case statements could by empty
    static void test5(int day){
        // must use final if d is used in case statement
        final int d = 'T';
        switch(day){
            case 'M':
                System.out.print("Monday "); break;
            case d:
            default:
                System.out.print("Nothing ");break;
        }
        System.out.print("\n");
}

    public static void main(String[] args) {
        // standard approach
        test1('M');
        test1('T');
        test1('N');

        // no break statements
        test2('M');
        test2('T');
        test2('N');
        
        System.out.println("\ndisorder statements:");
        test3('M');
        test3('T');
        test3('N');

        System.out.println("\nother statements:");
        test4('M');
        test4('T');
        test4('N');

        System.out.println("\nempty statements:");
        test5('M');
        test5('T');
        test5('N');
    }
    
}
