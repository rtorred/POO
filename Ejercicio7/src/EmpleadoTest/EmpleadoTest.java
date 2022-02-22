package EmpleadoTest;

import java.util.Scanner;

import Empleado.Empleado;

public class EmpleadoTest {
	
	static Empleado[] empleados = new Empleado[20];
	static Scanner sn = new Scanner(System.in);
	
	public static void introduceEmpreados() {
		Empleado e;
		String dni, nombre;
        double sueldoBase;
        int horasExtras;
        double IRPF;
        String casado;
        int nHijos;
        int i, nEmpleados;
        
        do {
			System.out.println("cuantos empleados tenemos?");
			nEmpleados=sn.nextInt();
		} while (nEmpleados<0 || nEmpleados>20);
        
        for (i = 0; i <=nEmpleados; i++) {
        	sn.nextLine();
            System.out.println("Empleado " + i);
            System.out.print("Nif: ");
            dni = sn.nextLine();
            System.out.print("Nombre: ");
            nombre = sn.nextLine();
            System.out.print("Sueldo Base: ");
            sueldoBase = sn.nextDouble();
            System.out.print("Horas extra: ");
            horasExtras = sn.nextInt();
            System.out.print("Tipo de IRPF: ");
            IRPF = sn.nextDouble();
            sn.nextLine();
            System.out.print("Casado (S/N): ");
            casado = sn.nextLine();
            System.out.print("Número de hijos: ");
            nHijos = sn.nextInt();
            
            e = new Empleado(dni);
            e.setNombre(nombre);
            e.setSueldoBase(sueldoBase);
            e.setHorasExtras(horasExtras);
            e.setIrpf(IRPF);
            e.setCasado(casado);
            e.setHijo(nHijos);
            empleados[i]=e;
		}
	}
	
	public static void muestraEmpleados() {
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i]);
		}
	}
	

	public static Empleado empleadoMasCobra() {
		Empleado rico = empleados[0];
		for (int i = 0; i <=empleados.length; i++) {
			if (rico.calculaSueldo()<empleados[i].calculaSueldo()) {
				rico=empleados[i];
			}
		}
		return rico;
	}
	
	public static Empleado empleadoMenosCobra() {
		Empleado pobre = empleados[0];
		for (int i = 0; i <=empleados.length; i++) {
			if (pobre.calculaSueldo()<empleados[i].calculaSueldo()) {
				pobre=empleados[i];
			}
		}
		return pobre;
	}
	public static double introduceImporteHorasExtras() {
        double importe;
        System.out.print("Introduce el importe a pagar por cada hora extra: ");
        importe = sn.nextDouble();
        return importe;
    }
	
	public static Empleado empleadoQueMasCobraPorExplotado() {
        Empleado rico = empleados[0];
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].calcularImporteHorasExtras() > rico.calcularImporteHorasExtras()) {
            	rico = empleados[i];
            }
        }
        return rico;
    }
	
	public static Empleado empleadoQueMenosCobraPorExplotado() {
        Empleado pobre = empleados[0];
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].calcularImporteHorasExtras() < pobre.calcularImporteHorasExtras()) {                 
            	pobre = empleados[i];
            }
        }
        return pobre;
    }
	
	public static void ordenarEmpleados() {
			Empleado aux;
			for (int i = 0; i < empleados.length-1; i++) {
				for (int j = 0; j < empleados.length-i-1; j++) {
					if (empleados[j + 1].calculaSueldo() < empleados[j].calculaSueldo()) {
						aux = empleados[j + 1];
	                    empleados[j + 1] = empleados[j];
	                    empleados[j] = aux;
					}
				}
			}
	}
	
	
	

	public static void main(String[] args) {
		introduceEmpreados();
		empleadoMasCobra();
		empleadoMenosCobra();
		empleadoQueMasCobraPorExplotado();
		empleadoQueMenosCobraPorExplotado();
		muestraEmpleados();
		ordenarEmpleados();
		

	}

}
