public class App {

  public static void printTriangle(Object[] arr) {

    for(int row = 0; row < arr.length; row++){
      for(int column = 0; column < row + 1; column++){
        System.out.print(arr[column]);
      }
      System.out.println();
    } 
  }


  public static void main(String args[]) {
    printTriangle(new Integer[] { 1, 2, 3, 4 });
    printTriangle(new Character[] { 'A', 'B', 'C', 'D', 'E' });
    printTriangle(new String[] {});
    printTriangle(new String[] { "Hello" });
    printTriangle(new String[] { "Hello", "There", "Friend" });
  }
}