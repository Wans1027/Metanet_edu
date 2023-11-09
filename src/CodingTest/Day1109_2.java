package CodingTest;

import java.util.*;

public class Day1109_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] ijk = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> li = new ArrayList<>();
        for (int i = ijk[0]-1; i < ijk[1]; i++) {
            li.add(arr[i]);
        }
        Collections.sort(li);
        System.out.println(li.get(ijk[2]-1));
    }
}
