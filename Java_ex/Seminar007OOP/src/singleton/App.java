package singleton;
public class App {
    public static void main(String[] args) throws Exception {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings2.equals(settings1));

    }
}
