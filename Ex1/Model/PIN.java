package Ex1.Model;

import java.util.Scanner;

public class PIN extends Unlocker {
    private int code = 0;

    public void setCode() {
        System.out.println("Введите желаемый ПИН-код:");
        Scanner sc = new Scanner(System.in, "cp866");
        boolean check = true;
        while (check) {
            try {
                code = Integer.parseInt(sc.nextLine());
                System.out.println("ПИН-код успешно сохранен!");
                check = false;
            } catch (Exception e) {
                System.out.println("Проверьте правильность набора!");
            }
        }
    }

    public void unlock() {
        boolean check = true;
        int tries = 5;
        while (check) {
            int num = -1;
            System.out.println("Введите ПИН-код:");
            Scanner sc = new Scanner(System.in, "cp866");
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num == code) {
                    System.out.println("Телефон разблокирован!");
                    check = false;
                } else {
                    if (tries > 1) {
                        tries--;
                        System.out.format("Неверный ПИН-код! Осталось попыток: %d\n", tries);
                    } else {
                        System.out.println("Телефон заблокирован на 15 минут! Попробуйте позже!");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Проверьте правильность набора!");
            }

        }

    }

}
