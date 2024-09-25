package pe.edu.cibertec.AplicacionesWebT1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.AplicacionesWebT1.dto.BusquedaRequestDTO;
import pe.edu.cibertec.AplicacionesWebT1.service.BusquedaService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class BusquedaServiceImpl implements BusquedaService {
    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public String[] buscarVehiculo(BusquedaRequestDTO busquedaRequestDTO) throws IOException {

        String[] datosVehiculo = null;
        Resource resource = resourceLoader.getResource("classpath:vehiculos.txt");

       //try catch

        return datosVehiculo;
    }
}
