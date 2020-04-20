package com.RAFC.x00118719;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String Nombre, String Puesto, double Salario, int mesesContrato) {
        super(Nombre, Puesto, Salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato(){
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

}

