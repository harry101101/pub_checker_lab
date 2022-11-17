public class Guest {

    private String name;
    private int age;
    private double money;
    private int soberness;
    private boolean banned;
    private char currency;

    public Guest(String name, int age, double money, int soberness, boolean banned, char currency){
        this.name = name;
        this.age = age;
        this.money = money;
        this.soberness= soberness;
        this.banned = banned;
        this.currency =currency;
    }
    //Checks
    public boolean ageCheck(Guest guest){
        if (guest.getAge() < 18){
            return false;
        }
        return true;
    }
    public boolean moneyCheck(Guest guest){
        if (guest.getMoney() < 5){
            return false;
        }
        return true;
    }
    public boolean sobernessCheck(Guest guest){
        if (guest.getSoberness() < 50){
            return false;
        }
        return true;
    }
    public boolean currencyCheck(Guest guest){
        if (guest.getCurrency() == '£'){
            return true;
        }
        return false;
    }
    public boolean bannedCheck(Guest guest){
        if (guest.getBanned() == true){
            return true;
        }
        return false;
    }

    //GETTERS
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public int getSoberness() {
        return soberness;
    }

    public boolean getBanned() {
        return banned;
    }

    public char getCurrency() {
        return currency;
    }

    //SETTERS
    public void setBanned(boolean banned){
        this.banned = banned;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public void setCurrency(char currency) {
        this.currency = currency;
    }
    public void setSoberness(int soberness) {
        this.soberness = soberness;
    }
}
