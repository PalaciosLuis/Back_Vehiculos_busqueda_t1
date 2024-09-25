package pe.edu.cibertec.AplicacionesWebT1.service;

import pe.edu.cibertec.AplicacionesWebT1.dto.BusquedaRequestDTO;

import java.io.IOException;

public interface BusquedaService {
    String[] buscarVehiculo(BusquedaRequestDTO busquedaRequestDTO) throws IOException;
}
