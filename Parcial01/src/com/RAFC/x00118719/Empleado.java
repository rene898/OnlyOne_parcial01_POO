package com.RAFC.x00118719;

public abstract class Empleado {
    protected String Nombre, Puesto;
    protected double Salario;

    public Empleado(String Nombre,String Puesto,double Salario){
        super();
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.Salario = Salario;
    }

    public String getNombre() {

        return Nombre;
    }

    public String getPuesto() {

        return Puesto;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = Salario;
    }
}
