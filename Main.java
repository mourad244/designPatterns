import commandPattern.AddCustomerCommand;
import commandPattern.BlackAndWhiteCommand;
import commandPattern.CompositeCommand;
import commandPattern.CustomerService;
import commandPattern.editor.BoldCommand;
import commandPattern.editor.History;
import commandPattern.editor.HtmlDocument;
import commandPattern.editor.UndoCommand;
import commandPattern.fx.Button;
import commandPattern.fx.ResizeCommand;
import decorator.CloudStream;
import decorator.EncryptedCouldStream;
import decorator.Stream;
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
    /*
     * var imageStorage = new ImageStorage(new JpegCompressor(), new
     * BlackAndWhiteFilter());
     * 
     * imageStorage.store("a");
     */

    // 5_------------- Command patter -------------------
    // Button
    // CheckBox
    // TextBox

    // ------a-----------
    /*
     * var service = new CustomerService(); var command = new
     * AddCustomerCommand(service); var button = new Button(command);
     * button.click();
     */

    // ---------b composition of commands------------
    /*
     * var composite = new CompositeCommand(); composite.add(new ResizeCommand());
     * composite.add(new BlackAndWhiteCommand());
     * 
     * // call composite.execute();
     */

    // -------c undo command ------------
    /*
     * var history = new History(); var document = new HtmlDocument();
     * document.setContent("Hello World");
     * 
     * var boldCommand = new BoldCommand(document, history); boldCommand.execute();
     * System.out.println(document.getContent());
     * 
     * var undoDocument = new UndoCommand(history); undoDocument.execute();
     * System.out.println(document.getContent());
     */

    // ------- 6 the decorator ----------

    // ---a using old inheritance
    /*
     * var CloudStream = new EncryptedCouldStream();
     * CloudStream.write("Here's some data");
     */

    // ------b using the decorator
    storeCreditCard(new CloudStream());
    storeCreditCard(new EncryptedCouldStream(new CloudStream()));

  }

  // for the decorator pattern
  public static void storeCreditCard(Stream stream) {
    stream.write("1234-1234-1234-1234");
  }
}
