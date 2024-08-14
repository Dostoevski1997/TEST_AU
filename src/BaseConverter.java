import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите температуру = ");
        float celcios = (float) scanner.nextFloat();

        System.out.print ("Единица измерения конвертации: K - кельвины, F - фаренгейты = ");
        char units = scanner.next().charAt(0);
        System.out.println();



        BaseConverter convert = new BaseConverter();
        float result = 0;

        if (units == 'K') {
            result = convert.convToK(celcios);
            System.out.printf("%.2f градусов Цельсия = %.2f Кельвинов\n", celcios, result);
        } else if (units == 'F') {
            result = convert.convToF(celcios);;
            System.out.printf("%.2f градусов Цельсия = %.2f Фаренгейтов\n", celcios, result);
        } else {
            System.out.println("Неверная единица конвертации. Пожалуйста, выберите K для Кельвинов или F для Фаренгейтов");
            System.exit(1);
        }

//        switch (units) {
//            case 'K':
//                result = convert.convToK(celcios);
//                System.out.printf("%.2f градусов Цельсия = %.2f Кельвинов\n", celcios, result);
//                break;
//            case 'F':
//                result = convert.convToF(celcios);
//                System.out.printf("%.2f градусов Цельсия = %.2f Фаренгейтов\n", celcios, result);
//                break;
//            default:
//                System.out.println("Неверная единица конвертации. Пожалуйста, выберите K для Кельвинов или F для Фаренгейтов.");
//        }

        System.out.println("Результат: " + result);
    }


    public static float convToK(float celcios) {
        return celcios + 273;
    }

    public static float convToF(float celcios) {
        return celcios * 9/5 + 32;
    }
}
