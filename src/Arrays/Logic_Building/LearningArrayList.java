package Arrays.Logic_Building;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    static void main() {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(0, 3);
        list.add(1,6);
        list.add(2, 9);
        list.add(3, 12);
        list.add(3,100);

        System.out.println("This is the arraylist:- "+list);
        int nums[] = new int[list.size()];

        for (int i = 0; i<nums.length; i++){
            nums[i] = list.get(i);
            System.out.print("This is converter from arraylist to array:- " );
            System.out.println(Arrays.toString(nums));
        }
    }

}
