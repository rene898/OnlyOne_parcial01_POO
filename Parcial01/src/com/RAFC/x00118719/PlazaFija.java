package com.RAFC.x00118719;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(String Nombre, String Puesto, double Salario, int extension) {
        super(Nombre, Puesto, Salario);
        this.extension = extension;
    }

    public int getExtension() {

        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

}
