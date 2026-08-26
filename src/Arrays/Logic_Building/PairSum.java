package Arrays.Logic_Building;

public class PairSum {
    public static int paircount (int arr[], int target) {
        int paircount = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    paircount++;
                }
            }
        }
        return paircount;
    }

    static void main() {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("paircount" + arr );
    }
}
