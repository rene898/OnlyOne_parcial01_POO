package com.RAFC.x00118719;

    public final class CalculadoraImpuestos {
    private static double totalRenta = 0, totalISSS = 0, totalAFP = 0;

    private CalculadoraImpuestos(){

    }

    public static double calcularPago(Empleado empleado){
        double total = 0;
        double renta = 0, ISSS, AFP;

        if(empleado instanceof ServicioProfesional){
            renta = 0.1 * empleado.getSalario();
            total = empleado.getSalario() - renta;

        }else if(empleado instanceof PlazaFija){

            ISSS = 0.03 * empleado.getSalario();
            AFP = 0.0625 * empleado.getSalario();
            double remaining = empleado.getSalario() - AFP - ISSS;

            if (remaining >= 0.01 && remaining <= 472.00) {
                renta = 0;
            } else if (remaining >= 472.01 && remaining <= 895.24) {
                renta = (0.1 * (remaining - 472.00) + 17.67);
            } else if (remaining >= 895.25 && remaining <= 2038.10) {
                renta = (0.2 * (remaining - 895.24) + 60);
            } else if (remaining >= 2038.11) {
                renta = (0.3 * (remaining - 2038.10) + 288.57);
            }

            totalISSS += ISSS;
            totalAFP += AFP;
            totalRenta += renta;

            total= (remaining - renta);
        }
        return total;
    }
    public static String mostrarTotales(){
        return "Totales: \na)ISSS: $"+totalISSS+ ". \nb)AFP: $ "+totalAFP+ ". \nc)Renta: $"+totalRenta+".";
    }

}
