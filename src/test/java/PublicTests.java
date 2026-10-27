import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PublicTests {

    @Test
    public void testRemoveArrayList() {
        ArrayList arrayList = new ArrayList();

        // Corner Case 1: Remove from empty list
        assertTrue(arrayList.isEmpty());
        try {
            arrayList.remove(0);
            fail("deveria ter lançado exceção");
        } catch (RuntimeException e) {}
        
        // Add some elements for further testing
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);


         try {
            arrayList.remove(-1);
            fail("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

         try {
            arrayList.remove(3);
            fail("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        
        // Usual Case 1: Remove middle element
        int removedValue = arrayList.remove(1); // remove 20
        assertEquals(20, removedValue);
        assertEquals(2, arrayList.size());
        assertEquals(0, arrayList.indexOf(10)); // 10 still at index 0
        assertEquals(1, arrayList.indexOf(30)); // 30 shifted from index 2 to index 1
        assertEquals(-1, arrayList.indexOf(20)); // 20 no longer exists
        
        // Usual Case 2: Remove first element
        removedValue = arrayList.remove(0); // remove 10
        assertEquals(10, removedValue);
        assertEquals(1, arrayList.size());
        assertEquals(0, arrayList.indexOf(30)); // 30 shifted to index 0
        assertEquals(-1, arrayList.indexOf(10)); // 10 no longer exists
        
        // Usual Case 3: Remove last (and only) element
        removedValue = arrayList.remove(0); // remove 30
        assertEquals(30, removedValue);
        assertEquals(0, arrayList.size());
        assertTrue(arrayList.isEmpty());
        assertEquals(-1, arrayList.indexOf(30)); // 30 no longer exists
        
        // Usual Case 4: Test with multiple elements - remove last element
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        removedValue = arrayList.remove(3); // remove last element (400)
        assertEquals(400, removedValue);
        assertEquals(3, arrayList.size());
        assertEquals(0, arrayList.indexOf(100));
        assertEquals(1, arrayList.indexOf(200));
        assertEquals(2, arrayList.indexOf(300));
        assertEquals(-1, arrayList.indexOf(400));
        
        // Usual Case 5: Multiple consecutive removals
        assertEquals(200, arrayList.remove(1)); // remove 200
        assertEquals(2, arrayList.size());
        assertEquals(0, arrayList.indexOf(100));
        assertEquals(1, arrayList.indexOf(300)); // 300 shifted to index 1
        
        assertEquals(100, arrayList.remove(0)); // remove 100
        assertEquals(1, arrayList.size());
        assertEquals(0, arrayList.indexOf(300)); // 300 shifted to index 0
        
        assertEquals(300, arrayList.remove(0)); // remove 300
        assertEquals(0, arrayList.size());
        assertTrue(arrayList.isEmpty());
        
        // Usual Case 6: Test with duplicate values
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(7);
        arrayList.add(8);
        removedValue = arrayList.remove(1); // remove second occurrence of 7
        assertEquals(7, removedValue);
        assertEquals(3, arrayList.size());
        assertEquals(0, arrayList.indexOf(7)); // first 7 still at index 0
        assertEquals(2, arrayList.indexOf(8)); // 8 moved to index 2
        
        // Clean up for final test
        arrayList = new ArrayList();
        arrayList.add(42);
        
        // Usual Case 7: Single element removal
        removedValue = arrayList.remove(0);
        assertEquals(42, removedValue);
        assertEquals(0, arrayList.size());
        assertTrue(arrayList.isEmpty());
	}

    @Test
    public void testRemoveLinkedList() {
        LinkedList linkedList = new LinkedList();

        // Corner Case 1: Remove from empty list
        assertTrue(linkedList.isEmpty());
        try {
            linkedList.remove(0);
            fail("deveria ter lançado exceção");
        } catch (RuntimeException e) {}
        
        // Add some elements for further testing
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);


         try {
            linkedList.remove(-1);
            fail("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

         try {
            linkedList.remove(3);
            fail("deveria ter lançado exceção");
        } catch (RuntimeException e) {}

        
        // Usual Case 1: Remove middle element
        int removedValue = linkedList.remove(1); // remove 20
        assertEquals(20, removedValue);
        assertEquals(2, linkedList.size());
        assertEquals(0, linkedList.indexOf(10)); // 10 still at index 0
        assertEquals(1, linkedList.indexOf(30)); // 30 shifted from index 2 to index 1
        assertEquals(-1, linkedList.indexOf(20)); // 20 no longer exists
        
        // Usual Case 2: Remove first element
        removedValue = linkedList.remove(0); // remove 10
        assertEquals(10, removedValue);
        assertEquals(1, linkedList.size());
        assertEquals(0, linkedList.indexOf(30)); // 30 shifted to index 0
        assertEquals(-1, linkedList.indexOf(10)); // 10 no longer exists
        
        // Usual Case 3: Remove last (and only) element
        removedValue = linkedList.remove(0); // remove 30
        assertEquals(30, removedValue);
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
        assertEquals(-1, linkedList.indexOf(30)); // 30 no longer exists
        
        // Usual Case 4: Test with multiple elements - remove last element
        linkedList.addLast(100);
        linkedList.addLast(200);
        linkedList.addLast(300);
        linkedList.addLast(400);
        removedValue = linkedList.remove(3); // remove last element (400)
        assertEquals(400, removedValue);
        assertEquals(3, linkedList.size());
        assertEquals(0, linkedList.indexOf(100));
        assertEquals(1, linkedList.indexOf(200));
        assertEquals(2, linkedList.indexOf(300));
        assertEquals(-1, linkedList.indexOf(400));
        
        // Usual Case 5: Multiple consecutive removals
        assertEquals(200, linkedList.remove(1)); // remove 200
        assertEquals(2, linkedList.size());
        assertEquals(0, linkedList.indexOf(100));
        assertEquals(1, linkedList.indexOf(300)); // 300 shifted to index 1
        
        assertEquals(100, linkedList.remove(0)); // remove 100
        assertEquals(1, linkedList.size());
        assertEquals(0, linkedList.indexOf(300)); // 300 shifted to index 0
        
        assertEquals(300, linkedList.remove(0)); // remove 300
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
        
        // Usual Case 6: Test with duplicate values
        linkedList.addLast(7);
        linkedList.addLast(7);
        linkedList.addLast(7);
        linkedList.addLast(8);
        removedValue = linkedList.remove(1); // remove second occurrence of 7
        assertEquals(7, removedValue);
        assertEquals(3, linkedList.size());
        assertEquals(0, linkedList.indexOf(7)); // first 7 still at index 0
        assertEquals(2, linkedList.indexOf(8)); // 8 moved to index 2
        
        // Clean up for final test
        linkedList = new LinkedList();
        linkedList.addLast(42);
        
        // Usual Case 7: Single element removal
        removedValue = linkedList.remove(0);
        assertEquals(42, removedValue);
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
	}


}




