import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class tests {

    @Test
    //test if there is coin
    void testNull(){
        int[] com = {};
        Exception e = assertThrows(IllegalArgumentException.class, () -> {Holder.holder(com, 42);});
        assertEquals("Can't have a blank coin combination", e.getMessage());
    }

    @Test
    //test the best solution
    void testSolution(){
        int[] com = {1,5,10,25};
        Integer[] solution = {25,10,5,1,1,null,null};
        assertTrue(Arrays.equals(solution, Holder.holder(com,42)));
    }

    @Test
    //test the negative num
    void testNegative(){
        int[] com = {-1,1,-2};
        Exception e = assertThrows(IllegalArgumentException.class, () -> {Holder.holder(com, 42);});
        assertEquals("Can't have a negative or zero coin combination.", e.getMessage());
    }

    @Test
    //test when there is no solution
    void testNoSolution(){
        int[] com = {2,10,20};
        Exception e = assertThrows(IllegalArgumentException.class, () -> {Holder.holder(com, 13);});
        assertEquals("Can't get a coin combination solution", e.getMessage());
    }
}
