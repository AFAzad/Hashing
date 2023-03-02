import java.util.HashSet;

public class FindDuplicateHSet {
    public static void main(String[] args) {
        int[] arr = { 20, 40, 30, 10, 30, 10, 50 };

        HashSet<Integer> set = new HashSet<>();

        boolean flag = false;
        
        for (int n : arr) {
            
            if (set.add(n) == false) {
                System.out.println( n+" ");
                
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Not any Duplicates");
        }
    }

}
