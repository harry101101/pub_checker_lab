import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GuestTest {

    Guest harry;
    Guest dan;

    @BeforeEach
    public void setUp(){
        harry = new Guest("Harry", 23, 20, 90, true, '£');
        dan = new Guest("Dan", 13, 4, 40, false, '€');
    }

    @Test
    public void canGetName(){
        assertThat(harry.getName()).isEqualTo("Harry");
    }
    @Test
    public void canGetAge(){
        assertThat(harry.getAge()).isEqualTo(23);
    }
    @Test
    public void canGetMoney(){
        assertThat(harry.getMoney()).isEqualTo(20);
    }
    @Test
    public void canGetSoberness(){
        assertThat(harry.getSoberness()).isEqualTo(90);
    }
    @Test
    public void canGetBanned(){
        assertThat(harry.getBanned()).isEqualTo(true);
    }
    @Test
    public void canGetCurrency(){
        assertThat(harry.getCurrency()).isEqualTo('£');
    }
    @Test
    public void canSetMoney(){
        harry.setMoney(30);
        assertThat(harry.getMoney()).isEqualTo(30);
    }
    @Test
    public void canSetSoberness(){
        harry.setSoberness(30);
        assertThat(harry.getSoberness()).isEqualTo(30);
    }
    @Test
    public void canSetBanned(){
        harry.setBanned(false);
        assertThat(harry.getBanned()).isEqualTo(false);
    }
    @Test
    public void canSetCurrency(){
        harry.setCurrency('$');
        assertThat(harry.getCurrency()).isEqualTo('$');
    }
}
