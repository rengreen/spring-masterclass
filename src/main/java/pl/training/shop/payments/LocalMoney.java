package pl.training.shop.payments;

import org.javamoney.moneta.FastMoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.Locale;

public class LocalMoney {

    public static FastMoney of(Number number) {
        Locale locale = Locale.getDefault();
        CurrencyUnit currencyUnit = Monetary.getCurrency(locale);
        return FastMoney.of(number, currencyUnit);
    }

}
