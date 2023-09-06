import entities.Veterinario;

public class Programa {

    public static void main(String[] args) {

        Veterinario veterinario2 = new Veterinario("Roberto","Matias","CRV12345",3500);
        Veterinario veterinario1 = new Veterinario();

        veterinario1.nome = "Joana";
        veterinario1.sobrenome = "Borges";
        veterinario1.registro = "CRV55325";
        veterinario1.salario = 4200;


    }

}
