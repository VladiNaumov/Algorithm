package org.example.armstrong;

public class BasicAlgorithm {
    private final Logger logger = new Logger();

    public void calculate(int max) {
        for (int i = 0; i < max; i++) {
            String number = String.valueOf(i);
            int length = number.length();
            String[] split = number.split("");
            int result = 0;
            for (int j = 0; j < split.length; j++) {
                result += Math.pow(Integer.parseInt(split[j]), length);
            }
            if (result == i) {
                logger.log(result);
            }
        }
        logger.print();
    }

    public void calculateWithMatrix(int max) {
        for (int i = 0; i < max; i++) {
            String number = String.valueOf(i);
            int length = number.length();
            String[] split = number.split("");
            int result = 0;
            for (int j = 0; j < split.length; j++) {
                result += ArmstrongUtil.MATRIX[Integer.parseInt(split[j])][length];
            }
            if (result == i) {
                logger.log(result);
            }
        }

        logger.print();
    }
}
