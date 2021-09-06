

public class Paciente implements Cloneable {
    private int nroRegistro;
    private String nome;
    private Hospital hospital;
    private String enfermidade;

    public Paciente(int nroRegistro, String nome, Hospital hospital, String enfermidade) {
        this.nroRegistro = nroRegistro;
        this.nome = nome;
        this.hospital = hospital;
        this.enfermidade = enfermidade;
    }

    public int getNroRegistro() {
        return nroRegistro;
    }

    public void setNroRegistro(int nroRegistro) {
        this.nroRegistro = nroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getEnfermidade() {
        return enfermidade;
    }

    public void setEnfermidade(String enfermidade) {
        this.enfermidade = enfermidade;
    }

    @Override
    public Paciente clone() throws CloneNotSupportedException {
        Paciente pacienteClone = (Paciente) super.clone();
        pacienteClone.hospital = (Hospital) pacienteClone.hospital.clone();
        return pacienteClone;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nroRegistro=" + nroRegistro +
                ", nome='" + nome + '\'' +
                ", hospital=" + hospital +
                ", enfermidade='" + enfermidade + '\'' +
                '}';
    }
}