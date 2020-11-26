package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        CurrencyService currencyService = new CurrencyServiceImpl();

        currencyService.setExchangeRate(3);
        System.out.println(currencyService.convert(12));
        System.out.println(currencyService.convert(122.3));

        try{
            Log my_log = new Log("log.txt");

            my_log.logger.setLevel(Level.ALL);
        } catch (Exception ignored) {
        }
    }
}