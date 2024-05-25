package com.example.demo.controllers;

import com.example.demo.models.Country;
import com.example.demo.models.Indicator;
import com.example.demo.models.Year;

import java.util.List;

public class ReportRequest {
    private List<Country> countries;
    private List<Indicator> indicators;
    private List<Year> years;

    // Getters and Setters
    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }

    public List<Year> getYears() {
        return years;
    }

    public void setYears(List<Year> years) {
        this.years = years;
    }
}
