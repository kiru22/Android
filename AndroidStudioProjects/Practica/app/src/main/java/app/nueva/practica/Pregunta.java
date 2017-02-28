package app.nueva.practica;

/**
 * Created by kiru on 28/02/2017.
 */

public class Pregunta {

    String numero = null;
    String pregunta = null;
    String respuesta1 = null;
    String respuesta2 = null;
    String respuesta3 = null;
    String respuesta4 = null;
    String verdadera = null;
    String publico = null;
    String telefono = null;
    String cincuenta1 = null;
    String cincuenta2= null;

    public Pregunta() {
    }

    public Pregunta(String respuesta1, String respuesta2, String respuesta3, String respuesta4, String publico, String cincuenta1, String cincuenta2, String numero, String telefono, String verdadera, String pregunta) {

        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.publico = publico;
        this.cincuenta1 = cincuenta1;
        this.cincuenta2= cincuenta2;
        this.numero = numero;
        this.telefono = telefono;
        this.verdadera = verdadera;
        this.pregunta = pregunta;



    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public String getVerdadera() {
        return verdadera;
    }

    public void setVerdadera(String verdadera) {
        this.verdadera = verdadera;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCincuenta1() {
        return cincuenta1;
    }

    public void setCincuenta1(String cincuenta1) {
        this.cincuenta1 = cincuenta1;
    }

    public String getCincuenta2() {
        return cincuenta2;
    }

    public void setCincuenta2(String cincuenta2) {
        this.cincuenta2 = cincuenta2;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
