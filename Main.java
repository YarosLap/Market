package Market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Customer customer1 = new Customer("Афанасий");
        Customer customer2 = new Customer("Вальдемар");
        Customer customer3 = new Customer("Иннокентий");
        Customer customer4 = new Customer("Спиридон");
        market.acceptToMarket(customer1);
        market.acceptToMarket(customer2);
        market.acceptToMarket(customer3);
        market.acceptToMarket(customer4);
        market.update();
    }
}
