package com.javarush.test.level26.lesson15.big01;

/**
 * Created by Alla on 12.08.16.
 */
public enum Operation {
    LOGIN,
    INFO,
    DEPOSIT,
    WITHDRAW,
    EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i) {
        if (i > 0 && i < Operation.values().length)
            return Operation.values()[i];
        else throw new IllegalArgumentException(String.format("Недопустимый код операции. Выберите другой.", i));
    }
}