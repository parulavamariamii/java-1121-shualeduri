package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    public static int value;
    @Override
    public double convert(double amount) {
        return amount/value;
    }

    @Override
    public void setExchangeRate(int value) {
        CurrencyServiceImpl.value = value;
    }
}