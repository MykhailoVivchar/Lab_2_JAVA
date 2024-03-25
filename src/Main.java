public class Main {
    public static void main(String[] args) {
        // Вхідні дані
        double p = 1.0;
        double a = 1.65;
        double start = 0.7;
        double end = 2;
        double step = 0.005;

        // Створення об'єкта FunctionCalculator
        FunctionCalculator calculator = new FunctionCalculator(p, a, start, end, step);

        // Виведення результатів
        System.out.println("Початок інтервалу: " + start);
        System.out.println("Кінець інтервалу: " + end);
        System.out.println("Кількість кроків для табулювання: " + calculator.calculateSteps(start, end, step));
        System.out.println("Номер найменшого елементу: " + calculator.findMinIndex() + ", Значення аргументу: " + calculator.getXValue(calculator.findMinIndex()));
        System.out.println("Номер найбільшого елементу: " + calculator.findMaxIndex() + ", Значення аргументу: " + calculator.getXValue(calculator.findMaxIndex()));
        System.out.println("Сума елементів масиву значень: " + calculator.calculateSum());
        System.out.println("Середнє арифметичне елементів масиву значень: " + calculator.calculateAverage());
    }
}
