package template.Impl;

import template.Record;

public class User extends Record {
    @Override
    public void validate() {
        System.out.println("validate");
    }

    @Override
    public void afterSave() {
        System.out.println("afterSave");
    }

    @Override
    public void failSave() {
        System.out.println("failSave");
    }
}
