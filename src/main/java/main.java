public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 30;
        actual = service.calculate(1000, false);
        System.out.println("2. " + expected + " == ? == " + actual);

    }
}
