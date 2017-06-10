package com.miketigris.common;

import lombok.Builder;
import lombok.Data;

/**
 * Created by xuguirong on 06/05/2017.
 */
@Data
@Builder
public class Dish {
    private String name;
    private int age;
    private int carleries;
}
