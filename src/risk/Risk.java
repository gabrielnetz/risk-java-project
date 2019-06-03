package risk;

public class Risk {
  public static void main(String[] args) {
		try {
			this.run();
		} catch (Exception e) {
			System.err.println("Market Interface parou de funcionar.");
		}
  }

  public static run() {
    System.out.println("hello world");
  }
}
