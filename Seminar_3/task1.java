package Seminar_3;

public class task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void doSomething() throws RuntimeException {
        throw new RuntimeException("This is exception");
    }
}
