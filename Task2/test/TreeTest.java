import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {
    @Test
    public void insertInTree() {
        TreeService<Integer> tree = new TreeService<>();
        Integer[] input = {17, 15, 23, 16};
        Integer[] raw_exp = {17, 15, 16, 23};
        for (int j : input) tree.insert(j);
        ArrayList<Integer> expectedValue = new ArrayList<>();
        for (int j : raw_exp) expectedValue.add(j);
        ArrayList<Integer> receivedValue = new ArrayList<>();
        tree.printTree(tree.getRoot(), receivedValue);
        System.out.print("Received Tree: ");
        for (Integer i : receivedValue) {
            System.out.print(i + " ");
        }
        System.out.println();
        assertEquals(expectedValue, receivedValue);
    }

    @Test
    public void deleteFromTree() {
        TreeService<Integer> tree = new TreeService<Integer>();
        int[] input = {19, 15, 16, 23, 14, 18, 17};
        int[] raw_exp = {18, 15, 14, 16, 17, 23};
        for (int j : input) tree.insert(j);
        System.out.println("Deleted 19");
        tree.remove(19);
        tree.remove(111);
        ArrayList<Integer> expectedValue = new ArrayList<>();
        for (int j : raw_exp) expectedValue.add(j);
        ArrayList<Integer> receivedValue = new ArrayList<>();
        tree.printTree(tree.getRoot(), receivedValue);
        System.out.print("Received Tree: ");
        for (Integer i : receivedValue) System.out.print(i + " ");
        System.out.println();
        assertEquals(expectedValue, receivedValue);
    }
}
