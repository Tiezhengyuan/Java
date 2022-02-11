/*
pass object into methods
*/
public class ObjectArguments {
    private Snake snake;
    public void setSnake(Snake snake) {
        this.snake = snake;
        System.out.println("set snake object");
    }
    public static void main(String[] args){
        ObjectArguments c = new ObjectArguments();

        // pass Snake object.        
        c.setSnake(new Snake());

        // pass child object.
        c.setSnake(new Cobra());

        //pass null
        c.setSnake(null);
        
        //not compiling 
        // c.setSnake(new object());
        // c.setSnake(new Reptile());
    }
    
}

class Reptile{}
class Snake extends Reptile{}
class Cobra extends Snake{}
