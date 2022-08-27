import java.util.Random;

public class MagicBox<T> {
    private static final Random randomazer = new Random();
    private T[] items;

    public MagicBox(int lengthitems) {
        this.items = (T[]) new Object[lengthitems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавили: " + item);
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format(
                        "Коробка не полна, необходимо добавить еще элемент(ы)", items.length - i));
            }
        }
        int randomCell = randomazer.nextInt(items.length);
        return items[randomCell];
    }
}
