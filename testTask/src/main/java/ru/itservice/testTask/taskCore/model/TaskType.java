package ru.itservice.testTask.model;

public enum TaskType {

    LEXICOGRAPHIC_ORDER("Поиск слов по лексиграфическому порядку"),
    HALF_MAGIC_CUBE("Полумагический куб");

    private final String type;

    TaskType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
