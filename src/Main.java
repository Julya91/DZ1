import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte value1 = 120;
        byte value2 = 3;
        byte value3 = (byte) (value1 + value2);

        System.out.println(value1 + value2);
        System.out.println(value1 - value2);
        System.out.println(value3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите радиус");
        int r = scanner.nextInt();
        double val = squar(r);
        double dlina = dlina(r);
        System.out.println("Площадь окружности "+val);
        System.out.println("длина окружности"+ dlina);

}
public static double squar(double radius) {
    return 3.14 * radius * radius;
}
    public static double dlina(double radius) {
        return 3.14 * radius * 2;
    }


}