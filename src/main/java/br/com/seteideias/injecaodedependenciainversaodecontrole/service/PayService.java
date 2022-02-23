package br.com.seteideias.injecaodedependenciainversaodecontrole.service;

import org.springframework.stereotype.Service;

@Service
public class PayService {

    private TaxService taxService;
    private DeliveryService deliveryService;

    public PayService(TaxService taxService, DeliveryService deliveryService) {
        this.taxService = taxService;
        this.deliveryService = deliveryService;
    }

    public Integer precoFinal (Integer precoBruto, String estado){
        if("MG".equals(estado)){
        return precoBruto + 5;
        }
        return precoBruto;
    }

}
