public class Ex3 {
    public static void main(String[] args) {
        int array[] = new int[]{3, 74, 8, 3, 5, 23, 423, 21, 41};
        System.out.println("Максимальний елемент масиву: " + getMaxIndexOfArray(array));
    }

    public static int getMaxIndexOfArray(int array[]) {
        int max = -1;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return index;
    }

}
