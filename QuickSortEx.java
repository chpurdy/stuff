import java.util.Arrays;
public class QuickSortEx
{
 
  static int pass = 0;
  
  public static void quickSort(int[] list, int lo, int hi) 
  {
    if (lo >= hi)
      return;
    
    int left = lo;
    int right = hi;
    int pivot = list[(lo+hi)/2];
    
    while (left < right) 
    {
      while (list[left] < pivot)
      {
        left++;
      }
      
      while (list[right] > pivot)
      {
        right--;
      }
      
      if (left <= right)
      {
        swap(list, left, right);
        left++;
        right--;
      }
    }
    
    pass++;
    System.out.println("After Pass #" + pass);
    System.out.println(Arrays.toString(list));
    quickSort(list, lo, right);
    quickSort(list,left,hi);
    
    
  }
  
  public static void swap(int[] list, int i, int j)
  {
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }
  
  
  
  
  public static void main(String[] args)
  {
    int[] test = {5,12,7,-4,3,11,9,4,23,6,15};
    quickSort(test,0,10);
    System.out.println(Arrays.toString(test));
  }
  
}