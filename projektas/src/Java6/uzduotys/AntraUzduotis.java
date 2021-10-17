package Java6.uzduotys;

public class AntraUzduotis {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println(getElementByIndex(array, 1));
        System.out.println(getElementByIndex(array, 9));
    }
    static Integer getElementByIndex(Integer[] array, int index) {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}
