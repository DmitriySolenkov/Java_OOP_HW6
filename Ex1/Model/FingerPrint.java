package Ex1.Model;

public class FingerPrint extends Unlocker {
    int print = 0;

    public void setPrint() {
        System.out.println("Прислоните палец к датчику для сохранения отпечатка");
        print = 1;
        System.out.println("Отпечаток успешно сохранен!");
    }

    public void unlock() {
        if (print == 1) {
            System.out.println("Прислоните палец к датчику для сканирования");
            System.out.println("Телефон разблокирован!");
        } else {
            System.out.println("Нет сохраненных отпечатков! Сначала сохраните как минимум один!");
        }
    }
}
