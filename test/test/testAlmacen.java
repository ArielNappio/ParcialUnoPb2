import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Almacen;
import dominio.BebidaAlcoholica;
import dominio.CantidadMiliLitros;
import dominio.Gaseosa;
import dominio.TipoAlcohol;
import dominio.TipoGaseosa;

public class testAlmacen {

    @Test
    public void queSePuedaAgregarUnaBebida() {

        Almacen loshijosdeputa = new Almacen();

        // Double cantidad, Double precio, String marca
        BebidaAlcoholica vodka = new BebidaAlcoholica(100.00, 10.000, "new style", TipoAlcohol.GANCIA,
                CantidadMiliLitros.ML1000);

        Boolean resultadoEsperado = true;
        Boolean resultadoObtenido = loshijosdeputa.agregarProducto(vodka);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void queSePuedaAgregarUnaGaseosa() {

        Almacen loshijosdeputa = new Almacen();

        // Double precio, String marca, TipoGaseosa tipoDeGaseosa, CantidadMiliLitros
        // miliLitros
        Gaseosa cocaCola = new Gaseosa(10.00, "cola ", TipoGaseosa.BEBIDA_NARANJA, CantidadMiliLitros.ML2250);

        assertTrue(loshijosdeputa.agregarProducto(cocaCola));

    }

    // arreglar

    @Test
    public void queSePuedaEliminarBebidas() {

        Almacen loshijosdeputa = new Almacen();

        // Double precio, String marca, TipoGaseosa tipoDeGaseosa, CantidadMiliLitros
        // miliLitros
        Gaseosa cocaCola = new Gaseosa(100.00, "new style", TipoGaseosa.BEBIDA_COLA, CantidadMiliLitros.ML500);

        boolean resultado = loshijosdeputa.eliminarBebida(100);

        assertTrue(resultado);
    }

    // completar

    @Test
    public void calculoDelPrecio() {

        Almacen losHijosDePuta = new Almacen();

        Gaseosa cocaCola = new Gaseosa(100.00, "new style", TipoGaseosa.BEBIDA_COLA, CantidadMiliLitros.ML500);

        Double resultadoObtenido = losHijosDePuta.calcularPrecioDeLaBebida("new style");
        Double resultadoEsperado = 100.00;

        assertEquals(resultadoObtenido, resultadoEsperado);

    }

    // arreglar

    @Test
    public void verSiEsMayorONo() {

        Almacen loshijosdeputa = new Almacen();
 
        Boolean puedeTomar = loshijosdeputa.siEsMayor(20);
        Boolean resultoEsperado = true;

        assertEquals(resultoEsperado, puedeTomar);
    
    }

}
