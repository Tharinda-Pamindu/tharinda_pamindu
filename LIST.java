import java.util.*;

public class LIST {
    public static int[] number;

    public static int[] insert(int[] array, int number) {
        int temp[] = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = number;
        array = temp;
        return array;
    }

    public static void printList(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public static void remove() {
        int[] ar = new int[(LIST.number).length - 1];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = LIST.number[i];
        }
        LIST.number = ar;
    }

    public static void remove(int index) {
        int[] temp = new int[(LIST.number).length - 1];
        l1: for (int i = 0; i < temp.length; i++) {
            if (i != index) {
                temp[i] = LIST.number[i];
            } else {
                for (int j = i; j < temp.length; j++) {
                    temp[j] = LIST.number[j + 1];
                }
                break l1;
            }
        }
        LIST.number = temp;
    }

    public static void insert(int[] array, int number, int index) {
        int[] temp = new int[array.length + 1];
        for (int i = 0, j = array.length; i < index | j > index; i++, j--) {
            temp[i] = array[i];
            temp[j] = array[j - 1];
        }
        temp[index] = number;
        LIST.number = temp;
    }

    public static int size(int[] array) {
        int len = array.length;
        return len;
    }

    public static Boolean isEmpty(int[] array) {
        for (int i = 0; i < (LIST.number).length; i++) {
            if (LIST.number[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFull(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static void clear() {
        int[] temp = new int[(LIST.number).length];
        LIST.number = temp;
    }

    public static void clear(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void removeDuplicates(int[] array) {

    }

    public static int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isExist(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Input No. of Numbers : ");
        int len = input.nextInt();
        LIST.number = new int[len];
        for (int i = 0; i < len; i++) {
            int num = r.nextInt(101);
            number[i] = num;
        }

        System.out.print("Input an integer : ");
        int in = input.nextInt();
        number = insert(number, in);

        printList(number);

        remove();
        // System.out.println(Arrays.toString(number));

        System.out.print("Insert index : ");
        int index = input.nextInt();
        remove(index);
        // System.out.println(Arrays.toString(number));

        insert(number, in, index);
        // System.out.println(Arrays.toString(number));

        int size = size(number);
        System.out.println("size of array " + size);

        boolean empty = isEmpty(number);
        System.out.println(empty);

        boolean full = isFull(number);
        System.out.println(full);

        clear();

        clear(number);

        removeDuplicates(number);

        System.out.print("Input search number : ");
        int searchNum = input.nextInt();
        search(number, searchNum);

        System.out.print("Input number : ");
        int existNum = input.nextInt();
        isExist(number, existNum);

        input.close();

    }
}
