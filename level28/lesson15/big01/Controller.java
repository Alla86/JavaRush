package com.javarush.test.level28.lesson15.big01;

/**
 * Created by Alla on 18.08.16.
 */
public class Controller {

    private Model model;

    private Controller() {
    }

    public Controller(Model model) throws IllegalArgumentException {
        this.model = model;
        if (model == null) throw new IllegalArgumentException();
    }
}