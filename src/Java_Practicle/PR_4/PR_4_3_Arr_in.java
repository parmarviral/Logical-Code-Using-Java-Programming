package Java_Practicle.PR_4;

class Arr_len_in {
    public static void main(String[] args) {
        int[] num_array = {50, -20, 0, 30, 40, 60, 10};

        System.out.println(num_array.length >= 2 && num_array[0] == num_array[num_array.length - 1]);
    }
}
