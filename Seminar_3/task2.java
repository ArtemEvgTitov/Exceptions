package Seminar_3;

import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        try (Counter c = new Counter()) {
            for (int i = 0; i < 5; i++) {
                if (c.getNum() > 3) {
                    c.setNum(null);
                }
                c.add();
            }
            c.error();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Counter implements AutoCloseable {
    private Integer num;

    public Counter() {
        this.num = 0;
    }

    public void add() throws IOException {
        if (ifClose()) {
            throw new IOException("Resource is closed");
        }
        this.num += 1;
    }

    public void error() {
        throw new RuntimeException("This is exception");
    }

    @Override
    public void close() throws Exception {
        this.num = null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(Integer val) {
        this.num = val;
    }

    public boolean ifClose() {
        return this.num == null;
    }
}
