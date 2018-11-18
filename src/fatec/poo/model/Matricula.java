package fatec.poo.model;

/**
 *
 * @author Wesley
 */
public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;
    private Turma turma;
    private Aluno aluno;
    private APrazo aPrazo;
    private AVista aVista;
    
    public Matricula(String data){
        this.data = data;
    }
    
    public void setQtdeFaltas(int qtdeFaltas){
        this.qtdeFaltas = qtdeFaltas;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
    public Turma getTurma(){
        return turma;
    }
    
    public Aluno getAluno(){
        return aluno;
    }
    
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    public void setAPrazo(APrazo aprazo){
        this.aPrazo = aprazo;
    }
    
    public APrazo getAPrazo(){
        return aPrazo;
    }
    
    public void setAVista(AVista avista){
        this.aVista = avista;
    }
    
    public AVista getAVista(){
        return aVista;
    }
    
    public void emitirCarne(){
        
    }
    
}
