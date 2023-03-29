package com.sofkau.utils;

public enum StarWarsResources {
    REQRES_BASE_URL_STAR_WARS("https://swapi.dev/api/"),
    RESOURCE_STAR_WARS("planets/");


    private final String value;

    StarWarsResources(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
