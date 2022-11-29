package sem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "sem2/3.json";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String baseLine = scanner.nextLine();
        StringBuilder line = new StringBuilder();
        while (scanner.hasNextLine()) {
            line.append(scanner.nextLine());
        }
        baseLine = line.toString();
        // System.out.println(baseLine);
        StringBuilder line2 = new StringBuilder();
        for (int i = 0; i < baseLine.length(); i++) {
            if (baseLine.charAt(i) != '{'
                    && baseLine.charAt(i) != '}'
                    && baseLine.charAt(i) != '"'
                    && baseLine.charAt(i) != '['
                    && baseLine.charAt(i) != ']'
                    && baseLine.charAt(i) != ' ') {
                char t = baseLine.charAt(i);
                line2.append(t);
            }
        }
        String newLine = line2.toString();
        System.out.println(newLine);
        String[] tVal = newLine.split("[ : \\ ,]");
        ArrayList<String> student = new ArrayList();
        ArrayList<String> mark = new ArrayList();
        ArrayList<String> subject = new ArrayList();
        for (int i = 1; i < tVal.length; i = i + 6) {
            student.add(tVal[i]);
        }
        for (int i = 3; i < tVal.length; i = i + 6) {
            mark.add(tVal[i]);
        }
        for (int i = 5; i < tVal.length; i = i + 6) {
            subject.add(tVal[i]);
        }
        scanner.close();
        System.out.println(student);
        System.out.println(mark);
        System.out.println(subject);
        System.out.println("\n");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < student.size(); i++) {
            result.append(
                    "Студент " + student.get(i) + " получил " + mark.get(i) + " по предмету " + subject.get(i) + "\n");
        }
        System.out.println(result);
    }
}
