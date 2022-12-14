package com.example.homework2_5collections.controller;

import com.example.homework2_5collections.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator/")
public class EmployeeController {
    private final CalculatorService calculatorService;

    @GetMapping
    public String welcome(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if (a==null || b==null) return "Пустое поле запроса";
        int plus = calculatorService.plus(a, b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if (a==null || b==null) return "Пустое поле запроса";
        int minus = calculatorService.minus(a, b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping("/multiple")
    public String multiple(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if (a==null || b==null) return "Пустое поле запроса";
        int multiple = calculatorService.multiple(a, b);
        return a + " * " + b + " = " + multiple;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if (a==null || b==null) return "Пустое поле запроса";
        double divide;
        try {
         divide = calculatorService.divide(a, b);
        } catch (Throwable e) {
            return e.getMessage();
        }

        return a + " / " + b + " = " + divide;
    }

}
