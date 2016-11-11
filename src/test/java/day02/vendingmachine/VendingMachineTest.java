package day02.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by AidenChoi on 2016. 11. 11..
 */
public class VendingMachineTest {

    public static final int COIN_500 = 500;
    public static final int COIN_300 = 300;
    public static final int COIN_100 = 100;
    private VendingMachine vm;

    @Before
    public void setUp() {
        vm = new VendingMachine();
    }

    @Test
    public void 돈_잘들어_가는지_확인() {
        vm.insertCoin(COIN_500);
        assertThat(vm.getCoin(), is(COIN_500));

        vm.insertCoin(COIN_300);
        assertThat(vm.getCoin(), is(COIN_300));

        vm.insertCoin(COIN_100);
        assertThat(vm.getCoin(), is(COIN_100));
    }

    @Test
    public void 자판기는_콜라를_가지고_있다() {
        Cola cola = vm.getCola();
        assertThat(cola, is(notNullValue()));
    }

    @Test
    public void 자판기는_콜라를_3개만_가지고_있다() {
        vm.getCola();
        vm.getCola();
        vm.getCola();

        assertThat(vm.getColaCount(), is(0));
    }
}
