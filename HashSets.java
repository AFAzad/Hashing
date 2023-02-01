import java.util.HashSet;
import java.util.Iterator;


public class HashSets{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        // Adding elements 

        set.add(25);
        set.add(35);
        set.add(40);
        set.add(25); 
        set.add(75);
        set.add(35);

        // Hashset will not allow duplicate elements , it allows only unique element
        // Printing size of set
        System.out.println("Size of set is : " +set.size());
        // Printing all elements
        System.out.println("Elements are in the set is: "+ set);


        // search element
        if(set.contains(40)){
            System.out.println("element present in set");
        }
        if(!set.contains(65)){
            System.out.println("element not found in set");
        }


        // Remove or Delete element from set
        set.remove(35);

        if(!set.contains(35)){
            System.out.println("input element deleted");
        }
        System.out.println("New set after removing 35 : "+set); 


        if(set.contains(35)){
            System.out.print("Element present in set"); // it will print if 35 would be present
        }

        // Iteration - Hashset doesn't have any order

        set.add(35);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.print(it.next() +", ");
        }
        System.out.println();

        // isEmpty 

        if(!set.isEmpty()){
            System.out.println("Set is not empty");
        }
    }

}