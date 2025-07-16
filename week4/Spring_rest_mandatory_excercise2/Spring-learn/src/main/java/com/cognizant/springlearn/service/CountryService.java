package com.cognizant.springlearn.service;

import java.util.List;
import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

public class CountryService {
    private List<Country> countryList;

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public Country getCountry(String code) throws CountryNotFoundException {
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException());
    }
}
