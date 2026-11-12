package es.iesteis.prog.ud4;

public class Alarma {
    private int horas;
    private int minutos;

    public Alarma() {
        this.horas = 7;
        this.minutos = 0;
    }

    public void setHoraAlarma(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public String getHoraAlarma() {
        String h;
        if (this.horas < 10) {
            h = "0" + this.horas;
        } else {
            h = "" + this.horas;
        }

        String m;
        if (this.minutos < 10) {
            m = "0" + this.minutos;
        } else {
            m = "" + this.minutos;
        }

        return h + ":" + m;
    }


}
