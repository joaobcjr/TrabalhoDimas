package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class Turma { 
    private String SiglaTurma;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private String Periodo;
    private int QtdeVagas;
    private String Observacoes;
    private Curso Curso;
    private Instrutor Instrutor; 
    private ArrayList<Matricula> Matriculas;
             
    public Turma(String siglaTurma, String descricao) {
        this.SiglaTurma = siglaTurma;
        this.Descricao = descricao;
        Matriculas = new ArrayList<Matricula>();
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.DataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.DataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.Periodo = periodo;
    }

    public void setObservacoes(String observacoes) {
        this.Observacoes = observacoes;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.QtdeVagas = qtdeVagas;
    }

    public String getSiglaTurma() {
        return SiglaTurma;
    }

    public void setSiglaTurma(String siglaTurma) {
        this.SiglaTurma = siglaTurma;
    }

    public Instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.Instrutor = instrutor;
    }
    
    public void setCurso(Curso curso){
        this.Curso = curso;
    }
    
    public Curso getCurso(){
        return Curso;
    }
    
    public void emitirListaFrequencia(){
        
    }
    
    public void addMatriculas(Matricula m){
        Matriculas.add(m);
        m.setTurma(this);
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public String getDataTermino() {
        return DataTermino;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public int getQtdeVagas() {
        return QtdeVagas;
    }
    
}
