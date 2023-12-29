import java.util.Math.random;

public class Fish {
    // private int randomStartPosition;
    // private int randomMovementArea;
    // private int randomMinLeft;
    // private int randomMaxRight;
    // private int randomMinTop;
    // private int randomMaxBottom;

    // private void randomMinLeft() {
		// this.minLeft = Math.random() * 10; //gives value from 0 to 10
	// }

    // static void moveUp(){

    // }
    // static void MoveDown(){

    // }
    // static void MoveLeft(){

    // }
    // static void MoveRight(){
    // }
    public void randomStartPosition(){
      int start_x = Math.random() * (1200 - 100) + 100;
      int start_y = Math.random() * (800 - 100) + 100;
      this.setLocation(start_x, start_y);
    }

    public Fish() {
      ImageIcon fish_photo = new ImageIcon("C:\\Users\\TEMP.CSPUT\\Desktop\\long-term-project-java-Olsonikk-main\\fish2.png");
      randomStartPosition();
    }

}