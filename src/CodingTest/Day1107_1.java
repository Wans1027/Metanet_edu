package CodingTest;

import java.util.*;

public class Day1107_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j) result.add(arr[i] + arr[j]);
            }
        }
        List li = new ArrayList(result);
        Collections.sort(li);
        System.out.println(li);
    }
}
