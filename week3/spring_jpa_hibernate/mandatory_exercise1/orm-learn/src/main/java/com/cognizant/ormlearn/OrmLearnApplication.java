package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testGetAllCountries();
        testFindCountryByCode();
        testAddCountry();
        testUpdateCountry();
        testDeleteCountry();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }

    private static void testFindCountryByCode() throws CountryNotFoundException {
        LOGGER.info("Start");
        Country country = countryService.findCountryByCode("TL");
        LOGGER.debug("Country: {}", country);
        LOGGER.info("End");
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start");
        Country country = new Country();
        country.setCode("JP");
        country.setName("Japan");
        countryService.addCountry(country);
        Country added = countryService.findCountryByCode("JP");
        LOGGER.debug("Added Country: {}", added);
        LOGGER.info("End");
    }

    private static void testUpdateCountry() throws CountryNotFoundException {
        LOGGER.info("Start");
        countryService.updateCountry("JP", "Japan Updated");
        Country updated = countryService.findCountryByCode("JP");
        LOGGER.debug("Updated Country: {}", updated);
        LOGGER.info("End");
    }

    private static void testDeleteCountry() throws CountryNotFoundException {
        LOGGER.info("Start");
        countryService.deleteCountry("JP");
        try {
            countryService.findCountryByCode("JP");
        } catch (CountryNotFoundException e) {
            LOGGER.debug("Country 'JP' successfully deleted.");
        }
        LOGGER.info("End");
    }
}
