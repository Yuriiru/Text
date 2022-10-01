package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввести путь к файлу: ");
        String text = in.nextLine();

        String str;
        String readTxt = "";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(text));
        while ((str = bufferedReader.readLine()) != null) {
            readTxt = readTxt + str;
        }

        String sim = "Всего символов в тексте: " + readTxt.length();
        String probel = "Всего символов в тексте без пробелов: " + readTxt.replaceAll(" ", "").length();
        String words = "Всего слов в тексте: " + readTxt.split(" ").length;

        System.out.println(sim);
        System.out.println(probel);
        System.out.println(words);

        FileWriter fileWriter = new FileWriter("text3.txt");
        fileWriter.write(sim);
        fileWriter.write("\n" + probel);
        fileWriter.write("\n" + words);
        fileWriter.flush();
    }
}
