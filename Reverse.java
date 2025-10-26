
public class Reverse {
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr,int i,int n){
        while(i<n/2){
            swap(arr,i,n-i-1);
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2};
        int n=arr.length;
        
        reverse(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
