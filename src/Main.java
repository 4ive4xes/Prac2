import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите количество ядер у телефона: ");
        int userCores = scanner.nextInt();
        System.out.print("Напишите состояние телефона: ");
        boolean userState = scanner.nextBoolean();
        System.out.print("Напишите фирму телефона: ");
        String userFirm = sc.nextLine();

        Telephone telephone = new Telephone(userState, userFirm, userCores);
        telephone.offOrOnTelephone();
        telephone.call("89850872277");
        System.out.println(telephone);


    }
}