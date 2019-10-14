package com.soap.spring;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.baeldung.springsoap.gen.Country;

@Component
public class CountryRepository {
 
    private static final Map<String, Country> countries = new HashMap<>();
 
    @PostConstruct
    public void initData() {
        // initialize countries map
    }
 
    public Country findCountry(String name) {
        return countries.get(name);
    }
}