public class Opgave_10 {

    public static void main(String[] args) {

        int [] array1 = {5, 42, 9, 53, 3, 10};
        int [] array2 = {3, 9, 19, 33, 10, 1};

        for (int i = 0; i < array1.length ; i++) {

            max(array1[i], array2[i]);

        }


    }

    public static void max(int num1, int num2) {

        if (num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

    }

}
