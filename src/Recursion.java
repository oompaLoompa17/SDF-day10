public class Recursion {
    
    public static void main (String[] args){
        recursiveFn(4);
    }

    public static void recursiveFn (int n){
        System.out.println(n);
        if (n > 1){
            recursiveFn(n-1);   
            System.out.println(n);
        }
    }
    
}
