package commandPattern.editor;

public class HtmlDocument {
  private String content;

  public void makeBold() {
    content = "<b>" + content + "</b>";
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
