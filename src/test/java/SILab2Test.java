import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testEveryBranch() {
        // Test case for allItems == null
        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertEquals("allItems list can't be null!", exception.getMessage());

        // Test case for valid allItems and valid payment
        Item item1 = new Item("item1", "0123456789", 100, 0.1f);
        Item item2 = new Item(null, "0123456789", 200, 0);
        assertTrue(SILab2.checkCart(Arrays.asList(item1, item2), 350));

        // Test case for invalid barcode character
        Item item3 = new Item("item3", "01234x6789", 100, 0);
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(Collections.singletonList(item3), 100));
        assertEquals("Invalid character in item barcode!", exception.getMessage());

        // Test case for item with no barcode
        Item item4 = new Item("item4", null, 100, 0);
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(Collections.singletonList(item4), 100));
        assertEquals("No barcode!", exception.getMessage());
    }

    @Test
    void testMultipleCondition() {
        // Test cases for multiple conditions
        Item item = new Item("item", "0123456789", 400, 0.1f);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // True, True, True

        item = new Item("item", "1123456789", 400, 0.1f);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // True, True, False

        item = new Item("item", "0123456789", 400, 0);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // True, False, True

        item = new Item("item", "1123456789", 400, 0);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // True, False, False

        item = new Item("item", "0123456789", 200, 0.1f);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // False, True, True

        item = new Item("item", "1123456789", 200, 0.1f);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // False, True, False

        item = new Item("item", "0123456789", 200, 0);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // False, False, True

        item = new Item("item", "1123456789", 200, 0);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 500)); // False, False, False
    }
}