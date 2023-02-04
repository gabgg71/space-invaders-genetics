
package modelo;

import java.util.Comparator;

public class Cromosoma {
    String secuencia; 
    float fitness;

    public Cromosoma(String secuencia, float fitness) {
        this.secuencia = secuencia;
        this.fitness = fitness;
    }

    public Cromosoma(String secuencia) {
        this.secuencia = secuencia;
    }
    
    

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public float getFitness() {
        return fitness;
    }

    public void setFitness(float fitness) {
        this.fitness = fitness;
    }
    
    public static Comparator<Cromosoma> porFitness = new Comparator<Cromosoma>() {         
    @Override         
    public int compare(Cromosoma jc1, Cromosoma jc2) {             
      return (jc2.fitness < jc1.fitness ? -1 :                     
              (jc2.fitness== jc1.fitness? 0 : 1));           
    }     
  }; 
    
    
}
