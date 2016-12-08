package quiz

import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test

/**
 * Created by AidenChoi on 2016. 12. 7..
 */
class ElevatorTest {
    lateinit var elevator: Elevator

    @Before
    fun create() {
        elevator = Elevator()
    }

    @Test
    fun _총_10개_층을_가지고_있음() {
        assertEquals(elevator.getFloorCount(), 10)
    }

    @Test
    fun _목적지를_하나_설정_할_수_있음() {
        fail()
    }

    @Test
    fun _tick_으로_한_층_이동() {
        fail()
    }

    @Test
    fun _목적지_설정하고_tick_으로_이동() {
        fail()
    }

    @Test
    fun _목적지_2개_설정하고_tick_으로_이동() {
        fail()
    }

}