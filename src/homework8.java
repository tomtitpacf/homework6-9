import java.util.Arrays;

public class homework8 {
    public static void main(String[] args) {

        // task 1

        int[] arr = new int[]{1, 2, 3};
        double[] miu = new double[]{1.57, 7.654, 9.986};
        boolean[] ara = new boolean[]{true, true, false, true, false, false, true};
        // my brain while i'm trying int not to go crazy with my life

        // task 2

        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }

        for (int index = 0; index < miu.length; index++) {
            if (index == miu.length - 1) {
                System.out.println(miu[index]);
                break;
            }
            System.out.print(miu[index] + ", ");
        }

        for (int index = 0; index < ara.length; index++) {
            if (index == ara.length - 1) {
                System.out.println(ara[index]);
                break;
            }
            System.out.print(ara[index] + ", ");
        }

        // task 3

        for (int index = arr.length - 1; 0 <=index; index--) {
            if (index == 0 ) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }

        for (int index = miu.length - 1; 0 <=index; index--) {
            if (index == 0 ) {
                System.out.println(miu[index]);
                break;
            }
            System.out.print(miu[index] + ", ");

        }

        for (int index = ara.length - 1; 0 <=index; index--) {
            if (index == 0 ) {
                System.out.println(ara[index]);
                break;
            }
            System.out.print(ara[index] + ", ");
        }

        // task 4

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 != 0) {
                arr[index] ++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}