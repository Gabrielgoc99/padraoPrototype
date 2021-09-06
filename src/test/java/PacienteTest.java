import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Paciente paciente = new Paciente(198, "Serj Tankian", new Hospital("Sírio Libanês", "Dr. Drauzio Varella"), "Arritmia Cardíaca");

        Paciente pacienteClone = paciente.clone();
        pacienteClone.setNroRegistro(199);
        pacienteClone.setNome("Eddie Vedder");
        pacienteClone.getHospital().setNomeHospital("Nove de Julho");

        assertEquals("Paciente{nroRegistro=198, nome='Serj Tankian', hospital=Hospital{nomeHospital='Sírio Libanês', medicoResponsavel='Dr. Drauzio Varella'}, enfermidade='Arritmia Cardíaca'}", paciente.toString());
        assertEquals("Paciente{nroRegistro=199, nome='Eddie Vedder', hospital=Hospital{nomeHospital='Nove de Julho', medicoResponsavel='Dr. Drauzio Varella'}, enfermidade='Arritmia Cardíaca'}", pacienteClone.toString());
    }
}