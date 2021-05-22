package commandPattern.editor;

public class BoldCommand implements UndoableCommand {

  private String prevContent;
  private HtmlDocument document;
  private History history;

  public BoldCommand(HtmlDocument document, History history2) {
    this.document = document;
    this.history = history2;
  }

  @Override
  public void unexecute() {
    document.setContent(prevContent);
  }

  @Override
  public void execute() {
    prevContent = document.getContent();
    document.makeBold();
    history.push(this);
  }

}
