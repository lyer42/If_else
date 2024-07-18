import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scan.nextLine();

        System.out.print("Введите пароль: ");
        String pass = scan.nextLine();

        if (role.equals("Admin") && pass.equals("52")) {
            System.out.println("Все пользователи");
        } else {
            System.out.print("Првиет, как вас зовут? ");
            String name = scan.nextLine();

        }

    }
}