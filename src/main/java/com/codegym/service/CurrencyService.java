package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {
    @Override
    public double calculate(String unit, double money) {

        double result;
        switch (unit.toLowerCase()) { // Chuyển đổi đơn vị sang chữ thường để tránh vấn đề chữ hoa/chữ thường
            case "usd":
                result = money * 25000;
                break;
            case "vnd":
                result = money / 25000;
                break;
            default:
                throw new IllegalArgumentException("Unexpected currency unit: " + money);
        }
        return result;
    }
}
