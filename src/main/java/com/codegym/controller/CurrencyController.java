package com.codegym.controller;


import com.codegym.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;

@Controller
public class CurrencyController {

    @Autowired
    private ICurrencyService currencyService;

    @GetMapping("/transaction")
    public String showTransaction() {
        return "transaction";
    }

    @GetMapping("/exchange")
    public ModelAndView result(@RequestParam String result,
                               @RequestParam double amount) {
        double calculatedValue = currencyService.calculate(result, amount);
        DecimalFormat df = new DecimalFormat("#,###.###");
        String formattedValue = df.format(calculatedValue);
        return new ModelAndView("transaction", "currency", formattedValue);
    }
}
