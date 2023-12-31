package com.cydeo.client;

import com.cydeo.annotation.ExecutionTime;
import com.cydeo.dto.CurrencyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://cdn.jsdelivr.net", name = "CURRENCY-CLIENT")
public interface CurrencyClient {

    @ExecutionTime
    @GetMapping("/gh/fawazahmed0/currency-api@1/latest/currencies/usd.json")
    CurrencyDto getCurrencyRates();
}
