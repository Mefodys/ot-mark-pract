//import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SubTest {

    val x = 4

    @Test
    fun myTest() {
        Assertions.assertEquals(4, 10)
    }

    @Test
    fun myTest2() {
        Assertions.assertEquals(4, x)
    }
}