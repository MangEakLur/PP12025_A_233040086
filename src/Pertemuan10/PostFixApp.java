package Pertemuan10;

import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan ekspresi postfix: ");
        String input = in.nextLine();

        ParsePost parser = new ParsePost(input);
        int result = parser.doParse();

        System.out.println("Hasil: " + result);
    }
}

