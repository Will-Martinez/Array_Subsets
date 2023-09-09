package ArraySubsets;
import java.util.ArrayList;
import java.util.Collections;

public class SubsetintArray {


    public void displayAllSubsets(int s, ArrayList<Integer> inputArrayList) {

        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        getSubsets(0, tmp, answer, inputArrayList);

        for (int i = 0; i < answer.size(); i++) {
            Collections.sort(answer.get(i));
            System.out.print("[");
            for (int j = 0; j < answer.get(i).size(); j++) {
                System.out.print(answer.get(i).get(j) + "");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private void getSubsets(int i, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> answer, ArrayList<Integer> inputArrayList) {
        if (i == inputArrayList.size()) {
            if (tmp.size() > 0) {
                answer.add(tmp);
            }
            return;
        }

        ArrayList<Integer> tmp1 = new ArrayList<>(tmp);
        tmp1.add(inputArrayList.get(i));
        getSubsets(i + 1, tmp1, answer, inputArrayList);
        getSubsets(i + 1, tmp, answer, inputArrayList);

    }
}
