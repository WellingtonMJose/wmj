/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logisticawmj.wmj.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.logisticawmj.wmj.domain.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellington
 */
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar() {
        
        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Comercial");
        Categoria cat3 = new Categoria(3, "Financeiro");
        Categoria cat4 = new Categoria(4, "Estoque");
        Categoria cat5 = new Categoria(5, "Contas a Pagar");
        Categoria cat6 = new Categoria(6, "Almoxarife");
        
        List<Categoria> listaCategoria = new ArrayList<>();
        listaCategoria.add(cat1);
        listaCategoria.add(cat2);
        listaCategoria.add(cat3);
        listaCategoria.add(cat4);
        listaCategoria.add(cat5);
        listaCategoria.add(cat6);
        
        return listaCategoria;
    }

}
