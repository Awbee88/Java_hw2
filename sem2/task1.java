package sem2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        String s = parseJson("sem2/1.json");
        String[] text;
        text = s.split(",");
        StringBuilder sqlText = new StringBuilder();
        sqlText.append("SELECT * FROM students WHERE ");
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceFirst("\"", "");
            text[i] = text[i].replaceFirst("\"", "");
            if (!(text[i].contains("null"))) {
                text[i] = text[i].replace(":", " = ");
                sqlText.append(text[i]);
                if (i != 2) {
                    sqlText.append(" AND ");
                }
                // System.out.println(text[i]);
            }
        }
        System.out.println(sqlText.toString());
    }

    private static String parseJson(String path) {

        try (FileReader fr = new FileReader(path);) {
            Scanner scan = new Scanner(fr);
            StringBuilder build = new StringBuilder();
            String s = "";
            while (scan.hasNextLine()) {
                build.append(scan.nextLine());
            }
            s = build.toString();
            fr.close();
            s = s.replace(" ", "");
            s = s.replace("{", "");
            s = s.replace("}", "");
            System.out.println(s + "\n");
            return s;
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return "";
    }
}
