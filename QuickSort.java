package quick.sort;
//Keynotes of quick sort:
/*
    1.For pivot : last element or first element or any random element or the median element
    2.Keep the smaller element of pivot before pivot and larger element after pivot
*/
public class QuickSort {
    //for partitioning the array based on the pivot
    public static int partition(int[] arr,int low,int high){
        //taking the last element as pivot
        int pivot=arr[high];
        //initialize i as -1 because low is 0
        int i=low-1;
        int temp;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                temp=arr[i];
                //swapping values
                arr[i]=arr[j];
                arr[j]=temp;
                System.out.println("From partition method:Inside for and if loop ,arr[j] or arr[i] or temp="+arr[j]);
            }
        }
        temp=arr[i+1];
        //swapping values
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void sort(int[] arr,int low,int high){
        if(low<=high){
            int pi=partition(arr, low, high);
            System.out.println("Into sort method:");
            System.out.println("Pi is :"+pi);
            //recursively calls 
            sort(arr, low, pi-1);
            //recursively calls
            sort(arr, pi+1, high);
        }
    }
    public static void printArray(int[] array){
        for(int i:array){
            System.out.println("Element of array:"+i);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int size=arr.length;
        sort(arr, 0, size-1);
        System.out.println("Sorted array :");
        printArray(arr);
    } 
}
