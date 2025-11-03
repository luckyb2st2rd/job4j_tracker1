package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
            }

            if (result == -1) {
                throw new ElementNotFoundException("Element is not in array");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] value = {"a", "b", "c", "d"};
        String key = "e";

        try {
            indexOf(value, key);
        } catch (ElementNotFoundException e) {
            System.out.println("Элемент не в массиве."); // чисто для себя
            e.printStackTrace(); // хотя алишев говорит так лучше, а то если оставлять трейс, не френдли код получается
        }
    }
}
