package state;

public class Canvas {
  private Tool currentTool;

  
  public void mouseDown(){
   currentTool.mouseDown();
  }
  public void mouseUp(){
   currentTool.mouseUp();
  }

  public Tool getCurrentTool() {
    return this.currentTool;
  }

  public void setCurrentTool(Tool currentTool) {
    this.currentTool = currentTool;
  }
}
