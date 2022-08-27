import java.util.Random;

public class Main {
    public static void main(String[] args) {
        stringsMagicBox();
        numbersMagicBox();
    }

    private static void stringsMagicBox() {
        System.out.println("Магическая коробка со строками:");
        MagicBox<String> magicBox = new MagicBox<>(3);
        System.out.println("попытка добавления " + magicBox.add("А") + "\t\n");
        System.out.println("попытка добавления " + magicBox.add("Б") + "\t\n");
        System.out.println("попытка добавления " + magicBox.add("В") + "\t\n");

        String pick = magicBox.pick();
        System.out.println("Что достали? " + pick + "\n");
    }

    private static void numbersMagicBox() {
        System.out.println("Магическая коробка со строками:");
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        System.out.println("попытка добавления " + magicBox.add(1) + "\t\n");
        Integer pick = magicBox.pick();
        System.out.println(pick);
    }
}