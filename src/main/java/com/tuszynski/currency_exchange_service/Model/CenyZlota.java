package com.tuszynski.currency_exchange_service.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class CenyZlota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @JsonIgnoreProperties("data")
    public String data;
    @JsonIgnoreProperties("cena")
    public BigDecimal cena;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "CenyZlota{" +
                "data=" + data +
                ", cena=" + cena +
                '}';
    }
}
