package br.com.tech4me.cliente.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("informacoes-ms")
public interface FilmeFeingClient {
    @RequestMapping(method = RequestMethod.GET, value= "/filmes/{id}")
    Filme obterFilmePorId(@PathVariable String id);
    
}
