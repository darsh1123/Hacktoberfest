// quick sort
public class quicksort {
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void quicksort(int arr[] , int si , int ei){
        if(si>=ei){
            return;
        }
        int ptdx = partition(arr, si , ei); 
        quicksort(arr, si , ptdx - 1);
        quicksort(arr , ptdx + 1  , ei);

    }
    public static int partition(int arr[] , int si , int ei){
        int pivot  = arr[ei];
        int i = si - 1; 
        for(int j = 0;j<ei;j++){ 
            if(arr[j] <= pivot){
                i++; 
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void main(String args[]){
        int arr[] = {4,3,1,2};
        quicksort(arr , 0 ,arr.length - 1);
        printArr(arr);
    }
    
}
