package ge.edu.btu.currency.service;

public interface CurrencyService {

    double convert(double amount);
    void setExchangeRate(int value);
}