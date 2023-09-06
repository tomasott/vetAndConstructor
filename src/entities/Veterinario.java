package entities;

public class Veterinario {

    public String nome;
    public String sobrenome;
    public String registro;
    public double salario;


        // Construtor padrão
        public Veterinario(){

        }
        //Construtor com parametros
        public Veterinario(String nome, String sobrenome, String registro, double salario) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.registro = registro;
            this.salario = salario;
        }
        //Metodos Getters e Setters

}
