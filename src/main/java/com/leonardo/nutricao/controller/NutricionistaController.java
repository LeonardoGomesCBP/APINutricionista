package com.leonardo.nutricao.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.nutricao.exception.NutricionistaNotFoundException;
import com.leonardo.nutricao.exception.NutricionistaResourceException;
import com.leonardo.nutricao.model.Nutricionista;
import com.leonardo.nutricao.resourcemodel.NutricionistaResource;
import com.leonardo.nutricao.service.BuscarNutriPorIDServiceImpl;
import com.leonardo.nutricao.service.BuscarNutricionistaServiceImpl;
import com.leonardo.nutricao.service.CadastroNutricionista;


@RestController
@RequestMapping(value = "/api")
public class NutricionistaController {

  @Autowired
  private BuscarNutricionistaServiceImpl serviceBuscar;

  @Autowired
  private CadastroNutricionista serviceCadastro;

  @Autowired
  private BuscarNutriPorIDServiceImpl serviceBuscarPorId;

  @GetMapping(path = "/nutricionista")
  public List<Nutricionista> buscarNutricionistas() {
    return serviceBuscar.buscarTodosOsNutricionistas();
  }

  @GetMapping(path = "/nutricionista/id/{id}")
  public Nutricionista buscarNutricionistasPorId(
      @PathVariable(name = "id", required = true) Long id) throws NutricionistaNotFoundException {
    return serviceBuscarPorId.buscarPorId(id);
  }

  @PostMapping(path = "/nutricionista/criar")
  public void salvarNutricionista(@RequestBody  @Valid NutricionistaResource nutricionista) throws NutricionistaResourceException {
    serviceCadastro.cadastro(nutricionista);
  }

  @DeleteMapping(path = "/nutricionista/delete/{id}")
  public void deleteNutricionista(@PathVariable(name = "id", required = true) Long id)
      throws NutricionistaNotFoundException {
    serviceBuscarPorId.deletarPorId(id);
  }

	

}
