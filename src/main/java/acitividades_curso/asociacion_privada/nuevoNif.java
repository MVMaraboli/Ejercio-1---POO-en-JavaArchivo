/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.asociacion_privada;

/**
 *
 * @author Leon DeBurgh
 */
public class nuevoNif extends personasAsocioacion{
    private String cRut;
    public String rRut;

    public nuevoNif() {
    }

    public nuevoNif(String cRut,String rRut, String cNombres, String cApellidos) {
        super(cNombres, cApellidos);
        this.cRut = cRut;
        this.rRut = rRut;
    }

    public nuevoNif(String cRut,String rRut) {
        this.cRut = cRut;
        this.rRut = rRut;
    }

    public String getcRut() {
        return cRut;
    }

    public void setcRut(String cRut) {
        this.cRut = cRut;
    }
    
    public String getrRut() {
        return rRut;
    }

    public void setrRut(String rRut) {
        this.rRut = rRut;
    }
    
    
    
public static String validaRut(String cRut){
        // Por Marcelo Valenzuela Maraboli 10/12/1990
        int a = 0, suma = 0, resto = 0, dif = 0, rt = 0, i = 0;
        int j = 0, separa = 0, c = 0;

        String ruth = "          ";
        String dig, x = "-",rrut;
       
        //cRut=cRut;
        rrut = cRut.trim();
        rt = rrut.length();

        int[] aValid = new int[rt];
        int[] aRutex = new int[rt];

        for (i = 0; i < rt; i++) {
            
            aRutex[i] = Integer.parseInt(rrut.substring(i,i+1));
            switch (rt) {
                case 9 -> {
                    aValid[0] = 4;
                    aValid[1] = 3;
                    aValid[2] = 2;
                    aValid[3] = 7;
                    aValid[4] = 6;
                    aValid[5] = 5;
                    aValid[6] = 4;
                    aValid[7] = 3;
                    aValid[8] = 2;
                }
                case 8 -> {
                    aValid[0] = 3;
                    aValid[1] = 2;
                    aValid[2] = 7;
                    aValid[3] = 6;
                    aValid[4] = 5;
                    aValid[5] = 4;
                    aValid[6] = 3;
                    aValid[7] = 2;
                }
                case 7 -> {
                    aValid[0] = 2;
                    aValid[1] = 7;
                    aValid[2] = 6;
                    aValid[3] = 5;
                    aValid[4] = 4;
                    aValid[5] = 3;
                    aValid[6] = 2;
                }
                case 5 -> {
                    aValid[0] = 7;
                    aValid[1] = 6;
                    aValid[2] = 5;
                    aValid[3] = 4;
                    aValid[4] = 3;
                    aValid[5] = 2;
                }
                case 4 -> {
                    aValid[0] = 6;
                    aValid[1] = 5;
                    aValid[2] = 4;
                    aValid[3] = 3;
                    aValid[4] = 2;
                }
                case 3 -> {
                    aValid[0] = 5;
                    aValid[1] = 4;
                    aValid[2] = 3;
                    aValid[3] = 2;
                }
                case 2 -> {
                    aValid[0] = 4;
                    aValid[1] = 3;
                    aValid[2] = 2;
                }
                case 1 -> {
                    aValid[0] = 3;
                    aValid[1] = 2;
                }
                case 0 ->
                    aValid[0] = 2;
            }

        }
                
        for (j = 0; j < rt; j++) {
            c = aRutex[j];
            a = (c * aValid[j]);
            suma = suma + a;
        }
        
        resto = (int) (11 - (suma % 11));
        dig = switch (resto) {
            case 10 ->
                "K";
            case 11 ->
                "0";
            default ->
                String.valueOf(resto);
        };
        separa = rrut.length();
        if (separa <= 2) {
            ruth = rrut.trim() + x + dig;
        }
        if (separa > 2 && separa < 5) {
            ruth = rrut.substring(0, 2) + "." + rrut.substring(2, 5) + x + dig;
        }
        if (separa == 7) {
            ruth = rrut.substring(0, 1) + "." + rrut.substring(1, 4) + "." + rrut.substring(4, 7) + x + dig;
        }
        if (separa == 8) {
            ruth = rrut.substring(0, 2) + "." + rrut.substring(2, 5) + "." + rrut.substring(5, 8) + x + dig;
        }
        if (separa == 9) {
            ruth = rrut.substring(0, 3) + "." + rrut.substring(2, 4) + "." + rrut.substring(5, 7) + x + dig;
        }
        return ruth;
    }    
}
