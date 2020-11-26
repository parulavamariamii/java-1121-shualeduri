package ge.edu.btu.main;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File myTextFile = new File("\\mariam-parulava-v2\\src\\BTU_DOCUMENT");
        File[] listFiles = myTextFile.listFiles();
        String[] list = myTextFile.list();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            assert listFiles != null;

            System.out.println("WHICH FILE ARE YOU SEARCHING FOR?: ");
            System.out.println(listFiles.length);

            String text = scanner.nextLine();

            assert list != null;

            for (String fileName : list) {
                if (fileName.contains(text)) {
                    System.out.println("FILE:" + fileName);
                }
            }

        }
    }
}