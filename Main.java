import iterator.BrowseHistory;
import iterator.Iterator;
import state.Canvas;
import state.EraserTool;
import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;

public class Main {
  public static void main(String[] args) {

    /*
     * // 1---------memento pattern------------------ var editor = new Editor(); var
     * history = new History();
     * 
     * editor.setContent("a"); history.push(editor.createState());
     * 
     * editor.setContent("b"); history.push(editor.createState());
     * 
     * editor.setContent("c"); editor.restore(history.pop());
     * editor.restore(history.pop());
     * 
     * System.out.println(editor.getContent());
     * //-------------------------------------------
     */

    // 2- ------------state pattern------------
    /*
     * var canvas = new Canvas(); canvas.setCurrentTool(new EraserTool());
     * canvas.mouseDown(); canvas.mouseUp();
     */
    // -------------------------------------

    // 3- ---------itterator pattern---------------
    /*
     * var history = new BrowseHistory(); history.push("a"); history.push("b");
     * history.push("c");
     * 
     * Iterator iterator = history.createIterator(); while (iterator.hasNext()) {
     * var url = iterator.current(); System.out.println(url); iterator.next(); }
     */

    // 4_ ------------strategy pattern-------------------
    var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());

    imageStorage.store("a");
  }
}
