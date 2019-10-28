package br.com.fiap.netflix.chamado.controller;

import br.com.fiap.netflix.chamado.entity.Chamado;
import br.com.fiap.netflix.chamado.repository.ChamadoRepository;
import com.google.gson.Gson;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChamadoController {

    @Autowired
    private ChamadoRepository chamadoRepository;

    @ApiOperation(
            value="Cria e atualiza chamados ",
            response= String.class,
            notes="Essa operação Cria e atualiza chamados")
    @ApiResponses(value= {
            @ApiResponse(
                    code=200,
                    message="Inserção feita com sucesso",
                    response= String.class
            ),
            @ApiResponse(
                    code=500,
                    message="Erro",
                    response=String.class
            )

    })
    @PostMapping("/chamado")
    public String insertAndInsertChamado(@RequestBody Chamado chamado){

        return new Gson().toJson(chamadoRepository.save(chamado));
    }


    @ApiOperation(
            value="Consulta ikes a um Movie ",
            response= String.class,
            notes="Essa operação Adiciona likes a um Movie")
    @ApiResponses(value= {
            @ApiResponse(
                    code=200,
                    message="Inserção feita com sucesso",
                    response= String.class
            ),
            @ApiResponse(
                    code=500,
                    message="Erro",
                    response=String.class
            )

    })
    @GetMapping("/chamado")
    public String consultaChamado(@PathVariable("id") Long id){

        return new Gson().toJson(chamadoRepository.findById(id));
    }
}
