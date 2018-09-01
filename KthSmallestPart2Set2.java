package kth.smallest.part2.set.pkg2;

class kthSmallest{
    // This function returns k'th smallest element in arr[l..r]
    // using QuickSort based method.  ASSUMPTION: ALL ELEMENTS
    // IN ARR[] ARE DISTINCT
    public int smallest(int[] array,int left,int right, int k){
         // If k is smaller than number of elements in array
        if(k>0 && k<=right-left+1){
            // Partition the array around a random element and
            // get position of pivot element in sorted array
            int position=randomPartition(array,left,right);
            // If position is same as k
            if(position-left==k-1){
                return array[position];
            }
            // If position is more, recur for left subarray
            if(position-left>k-1){
                return smallest(array, left, position-1, k);
            }
            // Else recur for right subarray
            return smallest(array, position+1, right,k-position+left-1);
        }
         // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    }
    // Standard partition process of QuickSort().  It considers
    // the last element as pivot and moves all smaller element 
    // to left of it and greater elements to right. This function
    // is used by randomPartition()
    public static int randomPartition(int[] array,int left,int right){
        int x=array[right];
        int i=left;
        for(int j=left;j<=right-1;j++){
            if(array[j]<=x){
                swap(array,i,j);
                i++;
            }
        }
        swap(array,i,right);
        return i;
    }
    // Utility method to swap array[i] and array[j]
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}

public class KthSmallestPart2Set2 {

    public static void main(String[] args) {
        kthSmallest kSmallest=new kthSmallest();
        int arr[] = {12, 3, 5, 7, 4, 19, 26};
        int size = arr.length,k = 3;
        System.out.println("Kth smallest element is:"+kSmallest.smallest(arr, 0, size-1, k));
    }
    
}
