package src.main.java.ru.mai.is.tmp.students.mogurchikov.coursework.Symbols.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Symbols {

    public static void main(String[] args) throws IOException {
        String s = readFile("C:\\IncomprehensibleProgram.java");
        int d = s.length();
        int len = d - s.replaceAll("\\{", "").length();
        int lol = d - s.replaceAll("\\}", "").length();
        if (len == lol) {
            System.out.println("Все ОК. Скобок одинаковое число. Каждой по " + len);
        } else {
            System.out.println("Что-то со скобками. Каких-то больше.");
        }

    }

    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}
