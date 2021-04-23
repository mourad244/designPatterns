package state;

public class EraserTool  implements Tool{

  @Override
  public void mouseDown() {
    System.out.print("Eraser icon");
  }

  @Override
  public void mouseUp() {
    System.out.println("Erase somthing");
  }


  
}
