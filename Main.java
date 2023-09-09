package ArraySubsets;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SubsetintArray obj = new SubsetintArray();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int j = 1; j <= 3; j++){
            arrayList.add(j);
        }

        System.out.println("For the array list: " + arrayList + "\n");
        System.out.println("The subsets are: ");
        obj.displayAllSubsets(arrayList.size(), arrayList);
        System.out.println();
        arrayList.clear();
    }
}