package Arrays.Logic_Building;

public class DuplicateNumber {
    public static void duplicateNumber (int arr[])
    {
        for(int i = 0; i<arr.length; i++){
            for (int j = i + 1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i<arr.length; i++){
           if(arr[i] != -1)
        System.out.print(arr[i]);
        }
    }
}
