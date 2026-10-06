import java.util.Arrays;

public class rotateArray {

    public static Object[] rotateRight(Object[] arr) {
      Object item = arr[arr.length - 1];

      for (int i = arr.length - 1; i > 0; i--) {
          arr[i] = arr[i - 1];
      }

      arr[0] = item;

      return arr;
    }
  

  public static void main(String args[]) {

    Object[] arr = new Integer[] { 1, 2, 3, 4, 5 };

    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = new String[] { "Hello", "there", "my friend" };

    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
