package org.example.armstrong;

public class IntAlgorithm {
    private final Logger logger = new Logger();

    public void calculate(int max) {
        for (int i = 0; i < max; i++) {
            int length = ArmstrongUtil.length(i);
            int[] split = ArmstrongUtil.split(i, length);
            int result = 0;
            for (int j = 0; j < split.length; j++) {
                result += Math.pow(split[j], length);
            }
            if (result == i) {
                logger.log(result);
            }
        }
        logger.print();
    }

    public void calculateWithMatrix(int max) {
        for (int i = 0; i < max; i++) {
            int length = ArmstrongUtil.length(i);
            int[] split = ArmstrongUtil.split(i, length);
            int result = 0;
            for (int j = 0; j < split.length; j++) {
                result += ArmstrongUtil.MATRIX[split[j]][length];
            }
            if (result == i) {
                logger.log(result);
            }
        }
        logger.print();
    }


}
