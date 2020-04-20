package com.RAFC.x00118719;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean rebooting;

        do{
            try{
                rebooting = false;
                System.out.println("Empleado de Servicio Profesional: ");
                System.out.print("Nombre: ");
                String nombre = scan.nextLine();

                if(nombre == null || nombre.isEmpty() || nombre.replaceAll("\\w+", "").isEmpty())
                    throw new EmptyInputException("No has escrito nada ");
                else if(Numero(nombre)){
                    throw new InvalidOptionException("Opcion Erronea ");
                }

                System.out.print("Puesto: ");
                String puesto = scan.nextLine();
                if(puesto == null || puesto.isEmpty() || puesto.replaceAll("\\w+", "").isEmpty())
                    throw new EmptyInputException("No has escrito nada ");
                else if(Numero(puesto))
                    throw new InvalidOptionException("Opcion Erronea ");


                System.out.print("Salario: ");
                double salario = scan.nextDouble(); scan.nextLine();
                if(salario <= 0.00)
                    throw new InvalidOptionException("Opcion Erronea ");

                System.out.print("Meses de contrato: ");
                int meses = scan.nextInt(); scan.nextLine();
                if(meses <= 0.00)
                    throw new InvalidOptionException("Opcion Erronea ");

                ServicioProfesional SP = new ServicioProfesional(nombre, puesto, salario, meses);

                System.out.println("Empleado de Plaza Fija: ");
                System.out.print("Nombre: ");
                String Name = scan.nextLine();
                if(Name == null || Name.isEmpty() || Name.replaceAll("\\w+","").isEmpty())
                    throw new EmptyInputException("No has escrito nada ");
                else if(Numero(Name)){
                    throw new InvalidOptionException("Opcion Erronea ");
                }

                System.out.print("Puesto: ");
                String Stall = scan.nextLine();
                if(Stall == null || Stall.isEmpty() || Stall.replaceAll("\\w+","").isEmpty())
                    throw new EmptyInputException("No has escrito nada ");
                else if(Numero(Stall))
                    throw new InvalidOptionException("Opcion Erronea");

                System.out.print("Salario: ");
                double Salary = scan.nextDouble(); scan.nextLine();
                if(salario <= 0.00)
                    throw new InvalidOptionException("Opcion Erronea ");


                System.out.print("Numero de extension: ");
                int Extension = scan.nextInt(); scan.nextLine();
                if(Extension <= 0.00)
                    throw new InvalidOptionException("Opcion Erronea ");

                PlazaFija PF = new PlazaFija(Name, Stall, Salary, Extension);

                System.out.println("El pago respectivo de "+SP.getNombre()+" es de: $"+CalculadoraImpuestos.calcularPago(SP));
                System.out.println("El pago respectivo de "+PF.getNombre()+" es de: $"+CalculadoraImpuestos.calcularPago(PF));

                System.out.println(CalculadoraImpuestos.mostrarTotales());
                System.out.println("Programa Terminado ");

            }
            catch(EmptyInputException | InvalidOptionException a){
                System.out.println(a.getMessage());
                System.out.println("Reiniciando... ");
                rebooting = true;
            }

        }while(rebooting);

    }
    public static boolean Numero(String n) {
        char[] chars = n.toCharArray();
        for(char h : chars){
            if(Character.isDigit(h)){
                return true;
            }
        }
        return false;
    }
}

