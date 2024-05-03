import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite vashe imiya: ");
        String name = scanner.nextLine();

        System.out.print("Vvedite vash parol: ");
        String parol = scanner.nextLine();

        if (parol.length() < 8 || parol.length() > 15) {
            do {
                System.out.println("Длина пароля должна составлять от 8 до 15 символов!");
                parol = scanner.nextLine();
            } while (parol.length() < 8 || parol.length() > 15);
        }
        System.out.printf("%s, Vash parol:  %s", name, parol);
    }
}
