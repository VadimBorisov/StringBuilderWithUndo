import java.util.Stack;

public class SnapshotStorage {
  private final Stack<MyStringBuilder.Snapshot> storage = new Stack<>();

  public SnapshotStorage() {
  }


  public void save(MyStringBuilder.Snapshot snapshot) {
    storage.push(snapshot);
  }

  public MyStringBuilder.Snapshot get() {
    return storage.pop();
  }
}
