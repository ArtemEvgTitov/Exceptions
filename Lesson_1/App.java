package Lesson_1;

import java.io.File;

public class App{
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("123")));
        System.out.println(devide(-10, 0));
        a();
        

        
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }
    
    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int devide(int a1, int a2){
        if (a2 == 0){
            throw new RuntimeException("Нельзя делить на ноль");
        }
        return a1/a2;
    }

    public static long getFileSize(File file){
        if (!file.exists()){
            return -1L;
        }
        return file.length();
    }
}