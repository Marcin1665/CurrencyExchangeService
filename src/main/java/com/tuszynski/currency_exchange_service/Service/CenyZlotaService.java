package com.tuszynski.currency_exchange_service.Service;

import com.tuszynski.currency_exchange_service.Model.CenyZlota;
import com.tuszynski.currency_exchange_service.Repository.CenyZlotaRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CenyZlotaService {


    @Autowired
    CenyZlotaRepository cenyZlotaRepository;

    public void saveCenyZlota(CenyZlota cenyZlota) {
        cenyZlotaRepository.save(cenyZlota);
    }
}



