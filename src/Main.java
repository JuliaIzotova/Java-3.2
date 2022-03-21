public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 180;
        int weight = 80;
        float bodyMassIndex = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bodyMassIndex);
    }
}