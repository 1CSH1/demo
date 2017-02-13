package com.example;

import com.example.model.City;
import com.example.model.Country;
import com.example.service.CityService;
import com.example.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author James-CSH
 * @since 2/11/2017 7:25 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@Transactional
@SpringBootTest
public class TestEhCache {

    @Autowired
    private CountryService countryService;

    @Autowired
    private CityService cityService;

    @Test
    public void test01() {
        Country country = countryService.getById(1);
        System.out.println(country.getCountryname());
        Country country1 = countryService.getById(1);
        System.out.println(country1.getCountryname());
    }

    @Test
    public void test02() {
        City city = cityService.getById(1);
        System.out.println(city.getName());
        City city1 = cityService.getById(1);
        System.out.println(city1.getName());
    }
}
