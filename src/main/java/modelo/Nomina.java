/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW-B
 */
public class Nomina {
    private String nombre, apellidos;
    private int anios, dias;

    public Nomina() {
    }

    public Nomina(String nombre, String apellidos, int anios, int dias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anios = anios;
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public float getNomina(){
        float salario, salarioNeto = 0;
        double cuotaRetencion = 0.2;
        float retencion=0;
        if(this.anios>=5){
            salario = this.dias*80;
            retencion = (float) (salario*cuotaRetencion);
            salarioNeto = salario - retencion;
        }else{
            salario = this.dias*70;
            retencion = (float) (salario*cuotaRetencion);
            salarioNeto = salario - retencion;
        }
        return salarioNeto;
    }
}
