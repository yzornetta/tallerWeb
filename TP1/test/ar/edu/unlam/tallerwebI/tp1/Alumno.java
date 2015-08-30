package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {
	
	public int PrimerParcial;
	public int SegundoParcial;
	
	
	public int getPrimerParcial()
	{
		return PrimerParcial;
	}

	public int getSegundoParcial() {
		return SegundoParcial;
	}


	public void calificarPrimerParcial(int PrimerParcial) {
	
		this.PrimerParcial=PrimerParcial;
		
	}

	public void calificarSegundoParcial(int SegundoParcial) {
		
		this.SegundoParcial=SegundoParcial;
		
	}

	public boolean estaAprobado() {
		
		if((this.PrimerParcial > 3) && (this.SegundoParcial>3)){
		return true;
		}else{
		return false;
		}
	}

	public boolean estaPromocionado() {
		
		if((this.PrimerParcial > 6) && (this.SegundoParcial>6)){
		return true;
		}else{
		return false;
		}
	}

}
