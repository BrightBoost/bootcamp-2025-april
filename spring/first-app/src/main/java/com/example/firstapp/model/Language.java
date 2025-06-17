package com.example.firstapp.model;

public class Language {
    private int languageId;
    private String name;

    public Language() {
    }

    public Language(String name) {
        this.name = name;
    }

    public Language(int languageId, String name) {
        this.languageId = languageId;
        this.name = name;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
