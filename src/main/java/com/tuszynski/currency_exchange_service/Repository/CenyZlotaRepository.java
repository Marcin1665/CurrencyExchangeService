package com.tuszynski.currency_exchange_service.Repository;

import com.tuszynski.currency_exchange_service.Model.CenyZlota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CenyZlotaRepository extends JpaRepository<CenyZlota, Long> {


}
