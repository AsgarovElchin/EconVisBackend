package com.example.demo.services;

import com.example.demo.models.Report;
import com.example.demo.models.Country;
import com.example.demo.models.Indicator;
import com.example.demo.models.Year;
import com.example.demo.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public List<Report> getReports(List<Country> countries, List<Indicator> indicators, List<Year> years) {
        return reportRepository.findByCountryInAndIndicatorInAndYearIn(countries, indicators, years);
    }
}
