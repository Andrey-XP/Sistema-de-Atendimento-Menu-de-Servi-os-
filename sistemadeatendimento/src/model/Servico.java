package model;
//Reprsenta um dado do sistema
public class Servico {
    
    
         //Atributos
         private String nome;// guarda o nome do servico
         private double preco;// guarda o preco
         
         //Construtor(metodo especial que: executa altomaticamrnte ,toda vez que um obejeto e criado)
         public Servico(String nome, double preco){
            this.nome = nome;//atribito da classe+valor recebido
            this.preco = preco;//guarda o preco dentro do objeto
        }//Metodos(uma funca que executa quando alguem chama)
        //getNome serve para pegar o nome
        public String getNome(){
            return nome;//Devolve o valor guardado no atributo nome, quem chamar esse metodo recebe o nome.
            
        }//getPreco serve para pegar o preco
        public double getPreco(){
            return preco;
        }
    }

