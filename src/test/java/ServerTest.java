import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest harry;
    Guest dan;

    @BeforeEach
    public void setUp(){
        server = new Server();
        harry = new Guest("Harry", 23, 20, 90, true, '£');
        dan = new Guest("Dan", 13, 4, 40, false, '€');
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void onlyServeOver18(){
        assertThat(harry.ageCheck(harry)).isEqualTo(true);
        assertThat(dan.ageCheck(dan)).isEqualTo(false);
    }
    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void onlyServeIfMoney(){
        assertThat(harry.moneyCheck(harry)).isEqualTo(true);
        assertThat(dan.moneyCheck(dan)).isEqualTo(false);
    }
    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void onlyServeIfSober(){
        assertThat(harry.sobernessCheck(harry)).isEqualTo(true);
        assertThat(dan.sobernessCheck(dan)).isEqualTo(false);
    }
    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void onlyServeIfNotBanned(){
        assertThat(harry.bannedCheck(harry)).isEqualTo(true);
        assertThat(dan.bannedCheck(dan)).isEqualTo(false);
    }
    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void onlyServeIfCorrectCurrency(){
        assertThat(harry.currencyCheck(harry)).isEqualTo(true);
        assertThat(dan.currencyCheck(dan)).isEqualTo(false);
    }
    //other
    @Test
    public void canServeHarry(){
        harry.setBanned(false);
        assertThat(server.canServeGuest(harry)).isEqualTo(true);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
