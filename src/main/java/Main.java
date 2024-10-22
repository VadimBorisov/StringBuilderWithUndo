public class Main {
  public static void main(String[] args) {
    MyStringBuilder builder_v2 = new MyStringBuilder();
    builder_v2.append("one");
    System.out.println(builder_v2);
    builder_v2.append(" two");
    System.out.println(builder_v2);
    builder_v2.append(" three");
    System.out.println(builder_v2);
    builder_v2.undo();
    System.out.println(builder_v2);
    builder_v2.undo();
    System.out.println(builder_v2);
  }
}
