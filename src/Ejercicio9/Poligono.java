
package Ejercicio9;


public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }
    
    public String ToString(){
        return "Numero Lados: "+numeroLados;
    }
    
    public abstract double area();
    
}
