

public class Hospital implements Cloneable {
    private String nomeHospital;
    private String medicoResponsavel;

    public Hospital(String nomeHospital, String medicoResponsavel) {
        super();
        this.nomeHospital = nomeHospital;
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nomeHospital='" + nomeHospital + '\'' +
                ", medicoResponsavel='" + medicoResponsavel + '\'' +
                '}';
    }
}