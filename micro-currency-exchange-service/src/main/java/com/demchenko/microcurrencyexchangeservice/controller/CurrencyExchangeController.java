package com.demchenko.microcurrencyexchangeservice.controller;

import com.demchenko.microcurrencyexchangeservice.model.CurrencyExchange;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable("from") String from,
                                                  @PathVariable("to") String to) {
        return CurrencyExchange.builder()
                .id(1000L)
                .from(from)
                .to(to)
                .conversionMultiple(BigDecimal.valueOf(50))
                .environment(environment.getProperty("local.server.port"))
                .build();
    }
}
