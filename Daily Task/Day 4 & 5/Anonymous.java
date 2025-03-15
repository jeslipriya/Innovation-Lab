public class Anonymous {
    public static void main(String[] args) {
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class");
            }
        };

        run1.run();
    }
}