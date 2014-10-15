package utn.ia;


public class Main {

	public static void main (String [ ] args) {

        AgController controller = new AgController();
        
        //SAX
        controller.setPopulationSize(10);
        controller.setMutationRate(10);
        /*        controller.setqArqueros(Integer.valueOf(this.edtCantArqueros.getText()));
        controller.setqArquerosCaballo(Integer.valueOf(this.edtCantArqCaballo.getText()));
        controller.setqCaballeria(Integer.valueOf(this.edtCantCaballeria.getText()));
        controller.setqRecolectores(Integer.valueOf(this.edtCantRecolectores.getText()));
        controller.setqRecursos(Integer.valueOf(this.edtRecursos.getText()));
        controller.setqSoldados(Integer.valueOf(this.edtCantInfanteria.getText()));
        controller.setqVueltas(Integer.valueOf(this.edtCantVueltas.getText()));
        try {
            AgResultado result = controller.run();
            this.lblResultAtaque.setText("Ataque " + String.valueOf(result.getMejorCromosoma().getAtaque()));
            this.lblResultCosto.setText("Costo " + String.valueOf(result.getMejorCromosoma().getCosto()));
            this.lblResultDefensa.setText("Defensa " + String.valueOf(result.getMejorCromosoma().getDefensa()));
            this.lblResultRecoleccion.setText("Recoleccion " + String.valueOf(result.getMejorCromosoma().getRecolector()));
            this.lblResultTiempo.setText("Tiempo " + String.valueOf(result.getMejorCromosoma().getTiempo()));
            this.lblResultCantidad.setText("Cantidad " + String.valueOf(result.getMejorCromosoma().getCantidad()));                    
            this.lblResultUnidad.setText("Nombre unidad: " + String.valueOf(result.getUnidad().nombreByCromosoma(result.getMejorCromosoma())));
        } catch(Exception e) {
            throw new RuntimeException("Error al ejecutar", e);
        }*/
    }
	
	
}
