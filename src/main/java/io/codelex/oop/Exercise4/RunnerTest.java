package io.codelex.oop.Exercise4;

enum Runner {
    BEGINNER(300, 420),
    INTERMEDIATE(180, 299),
    ADVANCED(120, 179);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.minTime && marathonTime <= runner.maxTime) {
                System.out.println(runner);
                return runner;
            }
        }
        throw new IllegalArgumentException("Invalid marathon time");
    }
}
public class RunnerTest {
    public static void main(String[] args) {
        Runner.getFitnessLevel(305);
    }
}
