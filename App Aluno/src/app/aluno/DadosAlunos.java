
package app.aluno;

public class DadosAlunos {
    
    private String ra;
    
    private String nome;
    
    private float parcial1;
    
    private float parcial2;
    
    private float principal;
    
    public String getRa(){
        return ra;
    }
    
    public void setRa(String identificação){
        ra=identificação;
    
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String identificaçãoNome){
        nome=identificaçãoNome;
    
    }
    
    public float parcial1(){
        return parcial1;
    }
    
    public void setParcial1(float instrumento1){
        parcial1=instrumento1;
    
    }
    
    public float parcial2(){
        return parcial2;
    }
    
    public void setParcial2(float instrumento2){
        parcial2=instrumento2;
    
    }
    
    public float principal(){
        return principal;
    }
    
    public void setPrincipal(float instrumentoPrincipal){
        principal=instrumentoPrincipal;
    
    }
    
    public float médiaFinal() {
        float médiaFinal=parcial1 + parcial2 + principal;
        return médiaFinal;
    }
    
}
