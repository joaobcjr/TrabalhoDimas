package fatec.poo.model;

/**
 *
 * @author Wesley
 */
public class Aluno extends Pessoa {
    private String Escolaridade;
    private Matricula Matricula;
    
    public Aluno(String CPF, String Nome){
        super(CPF, Nome);
    }    

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public void setMatricula(Matricula matricula) {
        this.Matricula = matricula;
    }

    public Matricula getMatricula() {
        return Matricula;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }
    
}
