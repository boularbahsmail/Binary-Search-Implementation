// Implementation of Binary Search Algorithm using Java Programming language
// Binary Search class
class BinarySearch {
 public static void binarySearch(int arr[], int firstIndex, int lastIndex, int value) {
   int middleIndex = ((firstIndex + lastIndex) / 2);
   while( firstIndex <= lastIndex ) {
      if ( arr[middleIndex] < value ) {
        firstIndex = middleIndex + 1;
      }else if ( arr[middleIndex] == value ){
        System.out.println("Element is found at index: " + middleIndex);
        break;
      } else {
         lastIndex = middleIndex - 1;
      }
      middleIndex = ((firstIndex + lastIndex) / 2);
   }
   if ( firstIndex > lastIndex ) {
      System.out.println("Element is not found!");
   }
 }
 // Main class
 public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 3;
        int lastIndex = arr.length - 1;
        binarySearch(arr, 0, lastIndex, value); // Element is found at index: 2
 }
}
