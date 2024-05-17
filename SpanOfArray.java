package Array;

public class SpanOfArray {
    static int large(int arr[]){
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar ;
    }
    static int smallest(int arr[]){
        int sm = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<sm){
                sm=arr[i];
            }
        }
        return sm ;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        System.out.println("Span of array" + ( large(arr)-smallest(arr)));
    }
}
