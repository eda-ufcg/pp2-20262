public class Asserts {

    public static void main(String[] args) {
        testRemoveArrayList();
        testRemoveLinkedList();

        System.out.println("Todos os asserts passaram!");
    }

    public static void testRemoveArrayList() {
        ArrayList arrayList = new ArrayList();

        // Corner Case 1: Remove from empty list
        assert arrayList.isEmpty();
        try {
            arrayList.remove(0);
            throw new AssertionError("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        // Add some elements for further testing
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        try {
            arrayList.remove(-1);
            throw new AssertionError("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        try {
            arrayList.remove(3);
            throw new AssertionError("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        // Usual Case 1: Remove middle element
        int removedValue = arrayList.remove(1); // remove 20
        assert removedValue == 20;
        assert arrayList.size() == 2;
        assert arrayList.indexOf(10) == 0; // 10 still at index 0
        assert arrayList.indexOf(30) == 1; // 30 shifted from index 2 to index 1
        assert arrayList.indexOf(20) == -1; // 20 no longer exists

        // Usual Case 2: Remove first element
        removedValue = arrayList.remove(0); // remove 10
        assert removedValue == 10;
        assert arrayList.size() == 1;
        assert arrayList.indexOf(30) == 0; // 30 shifted to index 0
        assert arrayList.indexOf(10) == -1; // 10 no longer exists

        // Usual Case 3: Remove last (and only) element
        removedValue = arrayList.remove(0); // remove 30
        assert removedValue == 30;
        assert arrayList.size() == 0;
        assert arrayList.isEmpty();
        assert arrayList.indexOf(30) == -1; // 30 no longer exists

        // Usual Case 4: multiple elements - remove last element
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        removedValue = arrayList.remove(3); // remove last element (400)
        assert removedValue == 400;
        assert arrayList.size() == 3;
        assert arrayList.indexOf(100) == 0;
        assert arrayList.indexOf(200) == 1;
        assert arrayList.indexOf(300) == 2;
        assert arrayList.indexOf(400) == -1;

        // Usual Case 5: multiple consecutive removals
        assert arrayList.remove(1) == 200; // remove 200
        assert arrayList.size() == 2;
        assert arrayList.indexOf(100) == 0;
        assert arrayList.indexOf(300) == 1; // 300 shifted to index 1

        assert arrayList.remove(0) == 100; // remove 100
        assert arrayList.size() == 1;
        assert arrayList.indexOf(300) == 0; // 300 shifted to index 0

        assert arrayList.remove(0) == 300; // remove 300
        assert arrayList.size() == 0;
        assert arrayList.isEmpty();

        // Usual Case 6: duplicate values
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(8);
        removedValue = arrayList.remove(1); // remove second occurrence of 7
        assert removedValue == 7;
        assert arrayList.size() == 3;
        assert arrayList.indexOf(7) == 0; // first 7 still at index 0
        assert arrayList.indexOf(8) == 2; // 8 moved to index 2

        // Clean up for final test
        arrayList = new ArrayList();
        arrayList.add(42);

        // Usual Case 7: single element removal
        removedValue = arrayList.remove(0);
        assert removedValue == 42;
        assert arrayList.size() == 0;
        assert arrayList.isEmpty();
    }

    public static void testRemoveLinkedList() {
        LinkedList linkedList = new LinkedList();

        // Corner Case 1: Remove from empty list
        assert linkedList.isEmpty();
        try {
            linkedList.remove(0);
            throw new AssertionError("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        // Add some elements for further testing
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);

        try {
            linkedList.remove(-1);
            throw new AssertionError("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        try {
            linkedList.remove(3);
            throw new AssertionError("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        // Usual Case 1: Remove middle element
        int removedValue = linkedList.remove(1); // remove 20
        assert removedValue == 20;
        assert linkedList.size() == 2;
        assert linkedList.indexOf(10) == 0; // 10 still at index 0
        assert linkedList.indexOf(30) == 1; // 30 shifted from index 2 to index 1
        assert linkedList.indexOf(20) == -1; // 20 no longer exists

        // Usual Case 2: Remove first element
        removedValue = linkedList.remove(0); // remove 10
        assert removedValue == 10;
        assert linkedList.size() == 1;
        assert linkedList.indexOf(30) == 0; // 30 shifted to index 0
        assert linkedList.indexOf(10) == -1; // 10 no longer exists

        // Usual Case 3: Remove last (and only) element
        removedValue = linkedList.remove(0); // remove 30
        assert removedValue == 30;
        assert linkedList.size() == 0;
        assert linkedList.isEmpty();
        assert linkedList.indexOf(30) == -1; // 30 no longer exists

        // Usual Case 4: multiple elements - remove last element
        linkedList.addLast(100);
        linkedList.addLast(200);
        linkedList.addLast(300);
        linkedList.addLast(400);
        removedValue = linkedList.remove(3); // remove last element (400)
        assert removedValue == 400;
        assert linkedList.size() == 3;
        assert linkedList.indexOf(100) == 0;
        assert linkedList.indexOf(200) == 1;
        assert linkedList.indexOf(300) == 2;
        assert linkedList.indexOf(400) == -1;

        // Usual Case 5: multiple consecutive removals
        assert linkedList.remove(1) == 200; // remove 200
        assert linkedList.size() == 2;
        assert linkedList.indexOf(100) == 0;
        assert linkedList.indexOf(300) == 1; // 300 shifted to index 1

        assert linkedList.remove(0) == 100; // remove 100
        assert linkedList.size() == 1;
        assert linkedList.indexOf(300) == 0; // 300 shifted to index 0

        assert linkedList.remove(0) == 300; // remove 300
        assert linkedList.size() == 0;
        assert linkedList.isEmpty();

        // Usual Case 6: duplicate values
        linkedList.addLast(7);
        linkedList.addLast(7);
        linkedList.addLast(7);
        linkedList.addLast(8);
        removedValue = linkedList.remove(1); // remove second occurrence of 7
        assert removedValue == 7;
        assert linkedList.size() == 3;
        assert linkedList.indexOf(7) == 0; // first 7 still at index 0
        assert linkedList.indexOf(8) == 2; // 8 moved to index 2

        // Clean up for final test
        linkedList = new LinkedList();
        linkedList.addLast(42);

        // Usual Case 7: single element removal
        removedValue = linkedList.remove(0);
        assert removedValue == 42;
        assert linkedList.size() == 0;
        assert linkedList.isEmpty();
    }
}
