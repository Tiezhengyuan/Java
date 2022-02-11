class Snake {}
class Cobra extends Snake {}
class GardenSnake {}

public class Casting2 {
    private Snake snake;
    public void setSnake(Snake snake) { 
        this.snake = snake; 
    }
    public static void main(String[] args) {
        new Casting2().setSnake(new Snake());
        new Casting2().setSnake(new Cobra());
        new Casting2().setSnake(null);
    }
}