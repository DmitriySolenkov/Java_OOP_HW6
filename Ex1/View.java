package Ex1;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        while (true) {
            Presenter presenter = new Presenter();
            System.out.println("_______________________________________");
            System.out.println("Выберите способ разблокировки телефона:");
            System.out.println("Введите 1 для разблокировки по нажатию,");
            System.out.println("Введите 2 для разблокировки по ПИН-коду,");
            System.out.println("Введите 3 для разблокировки по FaceID,");
            System.out.println("Введите 4 для разблокировки по отпечатку пальца,");
            System.out.println("Введите 5 для выхода:");
            Scanner sc = new Scanner(System.in, "cp866");
            String str = sc.nextLine();
            try {
                int mode = Integer.parseInt(str);

                if (mode > 0 && mode < 5) {
                    presenter.unlock(mode);
                } else if (str.equals("5")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Неверный ввод, попробуйте еще раз!");
            }
        }
    }
}
