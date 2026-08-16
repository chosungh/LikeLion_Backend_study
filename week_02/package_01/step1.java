package week_02.package_01;
import week_02.package_01.Lion;

import java.util.Scanner;

public class step1 {
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

        System.out.println("입력값 검증을 시도합니다.");

        if (name.isEmpty()) {
            System.out.println("이름은 비어있을 수 없습니다.");
            return;
        }

        if (major.isEmpty()) {
            System.out.println("전공은 비어있을 수 없습니다.");
            return;
        }

        if (generation < 1) {
            System.out.println("기수는 1보다 작을 수 없습니다.");
            return;
        }

        System.out.println("입력값 검증을 통과하여 아기사자 객체 생성을 시도합니다.");
        
        try {    
            babyLion = new Lion(name, major, generation);
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        System.out.println("아기사자 객체를 성공적으로 생성하였습니다!");

        System.out.println("아기사자 정보를 출력합니다.");

        System.out.printf("이름: %s | 전공: %s | 기수: %d \n", babyLion.getName(), babyLion.getMajor(), babyLion.getGeneration());
    }
}