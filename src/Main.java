import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите состояние телефона (Вкл/Выкл): ");
        boolean state = scanner.nextBoolean();
        System.out.println("Введите диагональ дисплея телефона: ");
        int diagonal = scanner.nextInt();
        System.out.println("Введите операционную систему телефона");
        scanner = new Scanner(System.in);
        String OS = scanner.nextLine();

        TouchTone touchTone = new TouchTone(state, diagonal, OS);
        touchTone.call("89857632299");
        touchTone.blockTelephone();
        System.out.println(touchTone.sendSms("Я люблю Lo-Fi"));
        touchTone.unblockTelephone();
    }
}