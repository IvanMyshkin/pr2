package ru.mirea;

public class Main {

    public static void main(String[] args) {
        Author a1 = new Author("Ivan", "1van99773311@gmail.com", 'M');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }
}
