package week_02.package_01;

public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("이름은 비어 있을 수 없습니다.");
        }

        if (major.isEmpty()) {
            throw new IllegalArgumentException("전공은 비어 있을 수 없습니다.");
        }

        if (generation < 1) {
            throw new IllegalArgumentException("기수는 비어 있을 수 없습니다.");
        }

        this.name = name;
        this.major = major;
        this.generation = generation;
        
    }

    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    public int getGeneration() {
        return this.generation;
    }
}
