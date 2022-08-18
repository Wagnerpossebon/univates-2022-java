package aula04;

/**
 *
 * @author wagner.possebon
 */
public class Pessoa {
    
        private String nome;
        private String cidade;
        private int idade;
        private boolean aluno;
        
        public String retornarNome(){
            return nome;
        }
        
        public boolean retornarAluno(){
            return aluno;
        }
        
        public String retornarCidade(){
            return cidade;
        }
        
        public void modificarNome(String info){
            nome = info;
        }
        
        public void modificarAluno(boolean info){
            aluno = info;
        }
        
        public void modificarCidade(String info){
            cidade = info;
        }
        
        public int retornarIdade(){
            return idade;
        }
        
        public void modificarIdade(int info){
            idade = info;
        }
        
        @Override
        public String toString(){
            return"nome = " + this.nome;
        }
       
        
    }

    
    
    
    

