package com.agendador.tarefas.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/pessoa")
internal class PessoaController {


    @GetMapping
    fun olaMundo(): String = "ola mundooo"



}