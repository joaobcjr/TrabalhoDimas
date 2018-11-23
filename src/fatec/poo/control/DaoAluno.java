/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;


import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author JoaoBatista
 */
public class DaoAluno {
        private Connection conn;
    
    public DaoAluno(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Aluno aluno) {
        /*  PreparedStatement ps = null;
        try {
        ps = conn.prepareStatement("INSERT INTO tbProjeto(Codigo_Proj,Descricao_Proj,DataInicio_Proj,DataTermino_Proj) VALUES(?,?,?,?)");
        ps.setInt(1, projeto.getCodigo());
        ps.setString(2, projeto.getDescricao());
        ps.setString(3,projeto.getDataInicio());
        ps.setString(4,projeto.getDataTermino());
        
        ps.execute();
        } catch (SQLException ex) {
        System.out.println(ex.toString());
        }*/
    }
    
      
    
    public void alterar(Aluno aluno) {
        /*        PreparedStatement ps = null;
        try {
        ps = conn.prepareStatement("UPDATE tbProjeto set Descricao_Proj = ? ,DataInicio_Proj = ?, DataTermino_Proj = ? " +
        "where Codigo_Proj = ?");
        
        ps.setString(1, projeto.getDescricao());
        ps.setString(2,projeto.getDataInicio());
        ps.setString(3,projeto.getDataTermino());
        ps.setInt(4, projeto.getCodigo());
        
        ps.execute();
        } catch (SQLException ex) {
        System.out.println(ex.toString());
        }*/
    }
        
     public  Aluno consultar (String CPF) {
         Aluno consulta = null;
         
         PreparedStatement ps = null;
         try {
         ps = conn.prepareStatement("SELECT * from tbAluno where " +
         "CPF = ?");
         
         ps.setString(1, CPF);
         ResultSet rs = ps.executeQuery();
         
         if (rs.next()) {
         consulta = new Aluno (CPF, rs.getString("nome"));
         consulta.setEscolaridade(rs.getString("escolaridade"));
         consulta.setBairro(rs.getString("bairro"));
         consulta.setCEP(rs.getString("CEP"));
         consulta.setCelular(rs.getString("celular"));
         consulta.setCidade(rs.getString("cidade"));
         consulta.setDataNasc(rs.getString("data_nasc"));
         consulta.setEmail(rs.getString("email"));
         consulta.setEndereco(rs.getString("endereco"));
         consulta.setEstado(rs.getString("estado"));
         consulta.setEstadoCivil(rs.getString("estado_civil"));
         consulta.setNumero(rs.getInt("numero"));
         consulta.setRg(rs.getString("RG"));
         consulta.setSexo(rs.getString("sexo"));
         consulta.setTelefone(rs.getString("telefone"));
         }
         }
         catch (SQLException ex) {
         System.out.println(ex.toString());
         }
         return (consulta);
    }    
     
     public void excluir(Aluno aluno) {
         /*PreparedStatement ps = null;
         try {
         ps = conn.prepareStatement("DELETE FROM tbProjeto where Codigo_Proj = ?");
         
         ps.setInt(1, projeto.getCodigo());
         
         ps.execute();
         } catch (SQLException ex) {
         System.out.println(ex.toString());
         }*/
    }
}
