package peluqueria;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Stream;

public class PrincipalPeluqueria {
    public static void main(String[] args) {
       ServicioPeluqueria servicioUnas = ServicioPeluqueria.UÑAS;
        ServicioPeluqueria servicioCorte = ServicioPeluqueria.CORTE;
        ServicioPeluqueria servicioTinte = ServicioPeluqueria.TINTE;


        System.out.println(servicioUnas);
        System.out.println("Nombre:"+servicioUnas.nombre);
        System.out.println("Descripcion:"+servicioUnas.descripcion);
        System.out.println("Precio:"+servicioUnas.precio);
        System.out.println("Cuidado y modo de uso:"+servicioUnas.mostrarDescripcionServicio());
        System.out.println("");
        System.out.println(servicioCorte);
        System.out.println("Nombre:"+servicioCorte.nombre);
        System.out.println("Descripcion:"+servicioCorte.descripcion);
        System.out.println("Precio:"+servicioCorte.precio);
        System.out.println("Cuidado y modo de uso:"+servicioCorte.mostrarDescripcionServicio());
        System.out.println("");
        System.out.println(servicioTinte);
        System.out.println("Nombre:"+servicioTinte.nombre);
        System.out.println("Descripcion:"+servicioTinte.descripcion);
        System.out.println("Precio:"+servicioTinte.precio);
        System.out.println("Cuidado y modo de uso:"+servicioTinte.mostrarDescripcionServicio());
    }
}
