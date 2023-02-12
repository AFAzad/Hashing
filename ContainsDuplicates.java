import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
public class ContainsDuplicates {
    public  boolean countDub(int[] num){
        Array.sort(num);
        for(int i=0; i< num.length-1; i++){
            if(num[i] == num[i+1]){
                return true;
            }
        }
        return false;
    }
}
