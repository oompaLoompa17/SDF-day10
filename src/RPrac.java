public class RPrac {
    
    public static void main(String[] args) {
        
        int[] values = {1,3,5,7,9};

        
    }

    public static int rx(int n){
        int result;
        if (n == 1){
            return 1;
        }
        result = rx(n - 1) * n;
        return result;
    }
}
