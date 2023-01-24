package Ex1.Model;

public class FaceID extends Unlocker {
    int face = 0;

    public void setFace() {
        System.out.println("Наведите камеру на лицо для сохранения");
        face = 1;
        System.out.println("Лицо успешно сохранено!");
    }

    public void unlock() {
        if (face == 1) {
            System.out.println("Наведите камеру на лицо для проверки");
            System.out.println("Телефон разблокирован!");
        } else {
            System.out.println("Нет сохраненных лиц! Сначала сохраните как минимум одно!");
        }
    }

}
