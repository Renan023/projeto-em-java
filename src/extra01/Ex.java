
package extra01;

public class Ex {
    String inicio;
    public String curso;
    public String duracao;
    public int tempo;
    private String diploma;
    protected String aluno;
    protected int inscricao;

    public void estado(){
        System.out.println("Inscrição: "+this.getInscricao());
        System.out.println("Nome: "+this.getAluno());
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Duração "+this.getDuracao());
        System.out.println("Inicio :"+this.getInicio());
        System.out.println("Em "+this.getTempo()+" anos");
    }

    public void inicio(){
        System.out.println("Suas aulas começam dia "+ this.getInicio());
    }
    
    public void curso(){
        System.out.println("Curso de "+this.getCurso()+" turma T1");
    }
    
    public void tempo(){
        System.out.println("Duração de "+ this.getTempo()+" anos");
    }
    
    public void diploma (String dp){
        
    }
    
    public void aluno (){
        System.out.println(this.getAluno()+"");   
    }
    
    public void inscricao(){
        System.out.println("De inscrição "+ this.getInscricao());
    }

   /* public Ex(int inicio, String curso, String duracao, int tempo, String diploma, String aluno, int inscricao) {
        this.inicio = inicio;
        this.curso = curso;
        this.duracao = duracao;
        this.tempo = tempo;
        this.diploma = diploma;
        this.aluno = aluno;
        this.inscricao = inscricao;
    }*/

    public String getInicio() {
        return this.inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getDiploma() {
        return this.diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getAluno() {
        return this.aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getInscricao() {
        return this.inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    
    
}
