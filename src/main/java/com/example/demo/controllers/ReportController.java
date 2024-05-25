package com.example.demo.controllers;

import com.example.demo.models.Report;
import com.example.demo.models.Country;
import com.example.demo.models.Indicator;
import com.example.demo.models.Year;
import com.example.demo.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public List<Report> getReports(@RequestBody ReportRequest reportRequest) {
        return reportService.getReports(reportRequest.getCountries(), reportRequest.getIndicators(), reportRequest.getYears());
    }
}
