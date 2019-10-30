public class array{
    public static void main(String[]args){
        int [] arr = new int[20];
        for(int i = 0; i < arr.length; i++){ // o(1) for search like arr[i]; 
            arr[i] = i;
            System.out .println(arr[i]);
        }
        int [] scores = new int []{100,23,123};
        for(int score : scores){
            System.out.println(score);
        }
    }
}