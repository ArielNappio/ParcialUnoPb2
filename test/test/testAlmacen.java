package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import dominio.Almacen;
import dominio.BebidaAlcoholica;
import dominio.CantidadMiliLitros;
import dominio.Gaseosa;
import dominio.Marca;
import dominio.TipoGaseosa;

public class testAlmacen {


    @Test
    public void queSePuedaAgregarUnaBebida() {
        Almacen laEsquina = new Almacen();
        BebidaAlcoholica vodka = new BebidaAlcoholica(10.000, Marca.SMIRNOFF, CantidadMiliLitros.ML1000);
        Boolean resultadoEsperado = true;
        Boolean resultadoObtenido = laEsquina.agregarProducto(vodka);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }


    @Test
    public void queSePuedaComprarBebidas() {

        Almacen laEsquina = new Almacen();
        Gaseosa manaosCola = new Gaseosa(100.00, Marca.MANAOS, CantidadMiliLitros.ML500, TipoGaseosa.BEBIDA_COLA);
        laEsquina.agregarProducto(manaosCola);
        boolean resultado = laEsquina.comprarBebida(Marca.MANAOS, CantidadMiliLitros.ML500);
        
        assertTrue(resultado);
    }

    @Test
    public void	queSePuedaCalcularElPrecioDeUnaBebida() {
        Almacen laEsquina = new Almacen();
        Gaseosa manaosCola = new Gaseosa(100.00, Marca.MANAOS, CantidadMiliLitros.ML500, TipoGaseosa.BEBIDA_COLA);
        laEsquina.agregarProducto(manaosCola);
        Double resultadoObtenido = laEsquina.calcularPrecioDeLaBebida(Marca.MANAOS, CantidadMiliLitros.ML500);
        Double resultadoEsperado = 100.00; 

        assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void verSiEsMayorONo() {

        Almacen laEsquina = new Almacen();
        Boolean puedeTomar = laEsquina.siEsMayor(20);
        Boolean resultoEsperado = true;
        assertEquals(resultoEsperado, puedeTomar);
    
    }
    
    @Test 
    public void queLaBebidaEnPromocionCueste10PorCientoMenos() {
    	 Almacen laEsquina = new Almacen();
    	 Gaseosa manaosCola = new Gaseosa(100.00, Marca.MANAOS, CantidadMiliLitros.ML500, TipoGaseosa.BEBIDA_COLA);
    	 laEsquina.agregarProducto(manaosCola);
    	 // ejecucion
    	 manaosCola.setEnPromocion(true);
    	 Double valorEsperado = 90.0;
    	 //comprobacion 
    	 assertEquals(valorEsperado, manaosCola.getPrecio());
    	 
    }
    @Test 
    public void queSePuedaVerElPorcentajeDeAzucarEnLasGaseosas() {
    	Almacen laEsquina = new Almacen();
   	 Gaseosa manaosCola = new Gaseosa(100.00, Marca.MANAOS, CantidadMiliLitros.ML500, TipoGaseosa.BEBIDA_COLA);
   	 laEsquina.agregarProducto(manaosCola);
   	 //ejecucion
   //TERMINAR//TERMINAR//TERMINAR//TERMINAR//TERMINAR
    }
    

}
