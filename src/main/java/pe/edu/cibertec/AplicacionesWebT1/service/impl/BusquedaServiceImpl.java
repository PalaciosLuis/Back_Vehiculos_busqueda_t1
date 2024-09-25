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
        try (BufferedReader br = new BufferedReader(new FileReader(resource.getFile()))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separar los valores de la línea por ";"
                String[] datos = linea.split(";");

                // Verificar si la placa coincide (índice 1)
                if (busquedaRequestDTO.placa().equals(datos[1])) {
                    datosVehiculo = new String[5];  // Arreglo para marca, modelo, asientos, precio, y color

                    // Asignar valores correctamente basados en el formato del archivo
                    datosVehiculo[0] = datos[2]; // Marca
                    datosVehiculo[1] = datos[3]; // Modelo
                    datosVehiculo[2] = datos[4]; // Número de asientos
                    datosVehiculo[3] = datos[5]; // Precio
                    datosVehiculo[4] = datos[6]; // Color
                    break;  // Dejar de buscar una vez que se encuentre la placa
                }
            }
        } catch (Exception e) {
            datosVehiculo = null;
            throw new IOException(e);
        }


        return datosVehiculo;
    }
}
