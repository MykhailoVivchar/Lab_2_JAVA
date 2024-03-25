public class FunctionCalculator {
    private final double[] xValues; // Масив аргументів
    private final double[] yValues; // Масив значень функції
    private final double p; // Коефіцієнт p
    private final double a; // Параметр a

    // Конструктор класу, що приймає коефіцієнт p, параметр a, діапазон аргументів та крок
    public FunctionCalculator(double p, double a, double start, double end, double step) {
        this.p = p;
        this.a = a;
        int steps = calculateSteps(start, end, step);
        xValues = new double[steps];
        yValues = new double[steps];
        populateArrays(start, end, step);
    }

    // Метод для обчислення значення функції для заданого аргументу
    public double calculateFunction(double x) {
        double y;
        if (x < 1.3) {
            y = p * Math.pow(x, 2) - (7 / Math.pow(x, 2));
        } else if (x == 1.3) {
            y = a * Math.pow(x, 3) + 7 * Math.sqrt(a);
        } else {
            y = Math.log(x + 7 * Math.sqrt(Math.abs(x + a)));
        }
        return y;
    }

    // Метод для обчислення кількості кроків для табулювання
    public int calculateSteps(double start, double end, double step) {
        return (int) Math.ceil((end - start) / step);
    }

    // Метод для заповнення масивів аргументів та значень функції
    private void populateArrays(double start, double end, double step) {
        for (int i = 0; i < xValues.length; i++) {
            xValues[i] = start + i * step;
            yValues[i] = calculateFunction(xValues[i]);
        }
    }

    // Метод для отримання значення y за індексом
    public double getYValue(int index) {
        return yValues[index];
    }

    // Метод для отримання значення x за індексом
    public double getXValue(int index) {
        return xValues[index];
    }

    // Метод для знаходження номеру найбільшого елементу масиву значень функції
    public int findMaxIndex() {
        double max = yValues[0];
        int maxIndex = 0;
        for (int i = 1; i < yValues.length; i++) {
            if (yValues[i] > max) {
                max = yValues[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Метод для знаходження номеру найменшого елементу масиву значень функції
    public int findMinIndex() {
        double min = yValues[0];
        int minIndex = 0;
        for (int i = 1; i < yValues.length; i++) {
            if (yValues[i] < min) {
                min = yValues[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод для обчислення суми значень функції
    public double calculateSum() {
        double sum = 0;
        for (double y : yValues) {
            sum += y;
        }
        return sum;
    }

    // Метод для обчислення середнього арифметичного значень функції
    public double calculateAverage() {
        return calculateSum() / yValues.length;
    }
}
