package commandPattern.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class History {
  private Deque<UndoableCommand> commands = new ArrayDeque<>();

  public void push(UndoableCommand commmand) {
    commands.add(commmand);
  }

  public UndoableCommand pop() {
    return commands.pop();
  }
}
