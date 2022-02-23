package br.com.seteideias.injecaodedependenciainversaodecontrole.controller;


import br.com.seteideias.injecaodedependenciainversaodecontrole.service.PayService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotacao")
public class CotacaoController {

    final PayService payService;

    public CotacaoController(PayService payService) {
        this.payService = payService;
    }

    @GetMapping(value = "get/{numero}")
    public Integer inicio(@PathVariable Integer numero) throws JSONException {
        String estado = "MG";
        teste();
        return payService.precoFinal(numero, estado);
    }

    public JSONObject teste() throws JSONException {
        //instancia um novo JSONObject
        JSONObject my_obj = new JSONObject();

        //preenche o objeto com os campos: titulo, ano e genero
        my_obj.put("titulo", "JSON x XML: a Batalha Final");
        my_obj.put("ano", 2012);
        my_obj.put("genero", "Ação");

        //serializa para uma string e imprime
        String json_string = my_obj.toString();
        System.out.println("objeto original -> " + json_string);
        System.out.println();

        return my_obj;
    }

}
