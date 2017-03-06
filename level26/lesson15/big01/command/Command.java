package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by Alla on 17.08.16.
 */
interface Command {
    void execute() throws InterruptOperationException;
}