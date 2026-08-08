import java.util.Scanner;

public class Study {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            boolean first = true;
            do {        
                if (!first) {
                    System.out.println("[error] 유효한 숫자가 아닙니다. 5 이상의 수를 입력하세요");
                }
                
                System.out.print("아기사자 수 입력: ");
                number = scanner.nextInt();

                first = false;
            } while (number < 5);

            String[] babyLions = new String[number];

            for(int i=0; i<number; i++) {
                System.out.printf("%d번 째 아기사자 이름 작성: ", i+1);
                babyLions[i] = scanner.next();
            }

            for (String name : babyLions) {
                System.out.println(name);
            }
        }
    }
}
