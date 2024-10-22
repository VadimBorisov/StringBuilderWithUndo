public class MyStringBuilder {

  private StringBuilder stringBuilderDelegate;

  public MyStringBuilder append(String str) {
    save(stringBuilderDelegate.toString());
    stringBuilderDelegate.append(str);
    return this;
  }

  int count;

  SnapshotStorage storage = new SnapshotStorage();

  public MyStringBuilder() {
    stringBuilderDelegate = new StringBuilder();
  }

  public MyStringBuilder(int capacity) {
    stringBuilderDelegate = new StringBuilder(capacity);
  }

  public MyStringBuilder(String str) {
    stringBuilderDelegate = new StringBuilder(str);
  }


  private void save(String str) {
    storage.save(new Snapshot(new StringBuilder(String.valueOf(str)), count));
  }

  @Override
  public String toString() {
    return stringBuilderDelegate.toString();
  }

  public void undo() {
    Snapshot snapShot = storage.get();
    stringBuilderDelegate = snapShot.value;
    count = snapShot.count;
  }

  public static class Snapshot {
    private final StringBuilder value;
    private final int count;

    Snapshot(StringBuilder value, int count) {
      this.value = value;
      this.count = count;
    }

  }
}
