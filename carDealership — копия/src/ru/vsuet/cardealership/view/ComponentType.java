package ru.vsuet.cardealership.view;

import java.util.Arrays;

public enum ComponentType {

    MENU(0, " - menu"),
    LIST(1, " - object lists cars in Car Dealership"),
    SINGLE(2, " - get object by id"),
    ADDCAR(3, " - add car"),
    ADDCATEGORY(4, " - add category"),
    LISTCATEGORY(5, " - list category"),
    TEST(6, " - some test");
    private final int type;
    private final String comment;

    ComponentType(int type, String comment){
        this.type = type;
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public String getComment() {
        return comment;
    }

    public static ComponentType fromType(int type) {
        return Arrays.stream(values())
                .filter(v -> v.type == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Type not match: " + type));
    }
}
