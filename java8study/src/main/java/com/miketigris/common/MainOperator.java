package com.miketigris.common;

import com.miketigris.studyCapture5.Trader;
import com.miketigris.studyCapture5.Transaction;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xuguirong on 26/04/2017.
 */
public class MainOperator {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

    }
}
