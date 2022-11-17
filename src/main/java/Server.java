public class Server {
    public boolean canServeGuest(Guest guest){
        if((guest.ageCheck(guest) && guest.sobernessCheck(guest) && guest.currencyCheck(guest)
        && guest.moneyCheck(guest) && !(guest.bannedCheck(guest)))) {
            return true;
        }

        return false;
    }
}
