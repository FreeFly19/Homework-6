public class Ex2 {
    public static void main(String []args){
        int[] arr = new int[] {4,2,7,3,5};
        System.out.println(multiplication(arr));//840
    }
    public static int multiplication(int array[]){
        int mul=1;
        for(int i=0;i<array.length;i++){
            mul=mul*array[i];
        }
        return mul;
    }
}
