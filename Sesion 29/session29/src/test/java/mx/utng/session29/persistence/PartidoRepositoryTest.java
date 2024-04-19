package mx.utng.session29.persistence;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.session29.model.Equipo;
import mx.utng.session29.model.Partido;


@SpringBootTest
@ComponentScan(basePackages = "mx.utng.session29")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PartidoRepositoryTest {
    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private PartidoRepository partidoRepository;

    @BeforeAll
    void cleanDatabase (){
        partidoRepository.deleteAll();
    }

    @Test
    @DisplayName("Prueba guardar partido")
    void canSave(){
        Equipo local = new Equipo();
        Equipo visitante = new Equipo();
        local.setNombre("Rayados");
        visitante.setNombre("Tigres");

        equipoRepository.save(local);
        equipoRepository.save(visitante);

        Partido clasicoNorte = new Partido();
        clasicoNorte.setEquipoLocal(local);
        clasicoNorte.setEquipoVisitante(visitante);
        clasicoNorte.setMarcador_Local(2);
        clasicoNorte.setMarcador_Visitante(1);

        clasicoNorte = partidoRepository.save(clasicoNorte);
        assertNotNull(clasicoNorte.getId());
        assertNotEquals(0, clasicoNorte.getId());
    }
}
