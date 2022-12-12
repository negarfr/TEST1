package day31_practicesession;

import java.time.LocalDate;

public class Q02_MarketProductExpDate {

    String productName; // create variable but do not insenciate them
    double productPrice; // Create Variable
    String expirationDate;

    // right click--Generate--Constructor-- choose variables you want  and create class method by using above Variables
    public Q02_MarketProductExpDate(String productName, double productPrice) {
        this.productName = productName;       // we teeling java want to use only two
        this.productPrice = productPrice;
    }

    public Q02_MarketProductExpDate(String name, double price, int monthLeft) {
        this.productName = name;
        this.productPrice = price;
        this.expirationDate = LocalDate.now().plusMonths(monthLeft).toString();
    }
}
