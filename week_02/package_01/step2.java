package week_02.package_01;
import week_02.package_01.Lion;

import java.util.Scanner;

public class step2 {
    public static void main (String[] args) {
        String name;
        String major;
        int generation;
        Lion babyLion = null;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("이름을 입력하세요");
            name = scanner.nextLine();

            System.out.println("전공을 입력하세요");
            major = scanner.nextLine();
            
            System.out.println("기수를 입력하세요");
            generation = scanner.nextInt();
            scanner.nextLine();
        }

        try {
            babyLion = new Lion(name, major, generation);
        } catch (Exception e) {
            
        }

        System.out.printf("이름: %s, 전공: %s, 기수: %d \n", babyLion.getName(), babyLion.getMajor(), babyLion.getGeneration());
    }
}