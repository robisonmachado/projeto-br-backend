package br.com.gcmdigital.projetobrbackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", maxAge = 3600)
@Log4j2
public class TesteController {

    @GetMapping
    public ResponseEntity<String> getTeste(
            @ParameterObject @PageableDefault(size = 100, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
            @RequestParam(value = "ano", required = false) Integer ano,
            @RequestParam(value = "mes", required = false) Integer mes,
            @RequestParam(value = "dia", required = false) Integer dia) {

        return ResponseEntity.ok("endpoint funcionando");
    }
}
