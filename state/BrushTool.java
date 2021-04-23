package state;

public class BrushTool implements Tool {

  @Override
  public void mouseDown() {
    System.out.print("Brush icon");
  }

  @Override
  public void mouseUp() {
    System.out.println("Draw a line");
  }
  
}
