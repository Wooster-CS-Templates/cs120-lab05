import TaskA.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TaskATests {

    @Test
    @DisplayName("Test add function")
    void Test_Add() {
        List myList = new List();
        myList.add(10);
        Assertions.assertTrue(myList.contains(10));
        Assertions.assertFalse(myList.contains(0));
    }
}
