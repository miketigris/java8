package com.miketigris.studyCapture5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Created by xuguirong on 26/04/2017.
 */
@AllArgsConstructor
@Data
@ToString
public class Transaction {

    private final Trader trader;

    private final int year;

    private final int value;
}
