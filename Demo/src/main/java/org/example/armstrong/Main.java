package org.example.armstrong;

public class Main {
    public static void main(String[] args) {
        warmup();
        Logger.show = true;
        System.out.println("String algorithm matrix");
        new BasicAlgorithm().calculateWithMatrix(10_000_000);
        System.out.println("String algorithm");
        new BasicAlgorithm().calculate(10_000_000);
        System.out.println("Int algorithm matrix");
        new IntAlgorithm().calculateWithMatrix(10_000_000);
        System.out.println("Int algorithm");
        new IntAlgorithm().calculate(10_000_000);
        System.out.println("Speediest algorithm");
        new ArrayAlgorithm().calculate(Integer.MAX_VALUE);

    }

    private static void warmup() {
        for (int i = 0; i < 100; i++) {
            new BasicAlgorithm().calculate(100_000);
            new IntAlgorithm().calculate(100_000);
        }
    }
}
