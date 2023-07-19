package services.CurrencyServices;

import models.Currency;
import java.util.List;
import java.util.Map;

public interface CurrencyService {
    List<Currency> addCurrency (int code, String title, List<Currency> currencyList);

    Map<String, Double> buyingRate(String title, double course);

    Map<String, Double> salesRate(String title, double course);
    double converterBuyingRate(String currency, Map<String, Double> buyingRate);
    double converterSalesRate(String currency, Map<String, Double> salesRate);

}
