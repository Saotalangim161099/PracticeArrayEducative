public class Practice {
    public static int[] copyArr(int[] arr) {
        int[] copyArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            copyArr[k++] = arr[i];
        }
        return copyArr;
    }

    //public static int[] removeElement(int[] arr) {
    //  int[] resArr = new int[arr.length];

    //}

    public static int[] removeEven(int[] arr) {

        // Write - Your - Code- Here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        return arr; // change this and return the correct result array
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] copyArr = copyArr(nums);
        for (int i : copyArr) {
            System.out.println(i);
        }
    }
}
