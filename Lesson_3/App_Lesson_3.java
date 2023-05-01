package Lesson_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App_Lesson_3 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test.md");
                FileWriter writer = new FileWriter("test2.md")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy complete");
    }
}