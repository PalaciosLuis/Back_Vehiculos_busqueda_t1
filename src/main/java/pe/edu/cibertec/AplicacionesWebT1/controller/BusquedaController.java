package pe.edu.cibertec.AplicacionesWebT1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.AplicacionesWebT1.dto.BusquedaRequestDTO;
import pe.edu.cibertec.AplicacionesWebT1.dto.BusquedaResponseDTO;
import pe.edu.cibertec.AplicacionesWebT1.service.BusquedaService;

import java.io.IOException;

@RestController
@RequestMapping("/inicio")
public class BusquedaController {

    @Autowired
    BusquedaService busquedaService;

    @PostMapping("/buscar")
    public BusquedaResponseDTO buscar(@RequestBody BusquedaRequestDTO busquedaRequestDTO) {
       //try catch


    }

}
