package com.tuszynski.currency_exchange_service.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String table;

    public String currency;
    public String code;

    @OneToOne
    public Rate[] rates;


    public Currency() {

    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "table='" + table + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + Arrays.toString(rates) +
                '}';
    }
}