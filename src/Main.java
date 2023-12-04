// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class Fish {
    private int randomStartPosition;
    private int randomMovementArea;
    private int randomHorizontalDirection;
    private int randomVerticalDirection;
    private int randomMinLeft;
    private int randomMaxRight;
    private int randomMinTop;
    private int randomMaxBottom;

    static void moveUp(){

    }
    static void MoveDown(){

    }
    static void MoveLeft(){

    }
    static void MoveRight(){

    }
    public Fish() {
		this.randomMovementArea();
		this.randomHorizontalDirection();
		this.randomVerticalDirection();

		this.randomStartPosition();
    
}

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

    }
}
