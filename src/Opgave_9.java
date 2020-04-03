public class Opgave_9 {
    public static void main(String[] args) {

        int [] array1 = {5, 42, 9, 53, 3, 10};
        int [] array2 = {3, 9, 19, 33, 10, 1};

        for (int i = 0; i < array1.length ; i++) {

            add(array1[i], array2[i]);

        }


    }

    public static void add(int num1, int num2) {

        System.out.println(num1 + num2);

    }
}
