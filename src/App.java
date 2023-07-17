public class App {
    public static void main(String[] args) throws Exception {

        Duck donald = new Duck();
        Duck daisy = new PekingDuck();
        donald.clean(new Cow());
        daisy.clean(donald);

    }
}
