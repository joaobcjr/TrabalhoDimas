package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class Instrutor extends Pessoa {
    private String Formacao; 
    private String AreaAtuacao; 
    private ArrayList<Turma> Turmas;
    
    public Instrutor(String CPF, String Nome){
       super(CPF, Nome);
       Turmas = new ArrayList<Turma>();
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }

    public void addTurmas(Turma t) {
        this.Turmas.add(t);
        t.setInstrutor(this);
    }

    public ArrayList<Turma> getTurmas() {
        return Turmas;
    }
    
}
