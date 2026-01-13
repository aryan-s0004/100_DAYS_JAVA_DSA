package Two_Pointers;

public class Problem_1 {
    public static void swap(int []arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void Rev_arr(int []arr){
        int left=0,right=arr.length-1;
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    public static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
     //MAIN FUNCTION STARTS

        System.out.println("WAP REVERSE AN  ARRAY" );

        int []arr2={24,6,8,15,23};
         Rev_arr(arr2);
         printArr(arr2);

     //MAIN FUNCTION ENDS
    }

}


