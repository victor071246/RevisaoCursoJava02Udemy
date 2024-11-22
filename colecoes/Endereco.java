package colecoes;

import java.util.Objects;

public class Endereco {

    String logradouro;
    int numero;
    String complemento;

    Endereco(String logradouro, int numero, String complemento){
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return numero == endereco.numero && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(complemento, endereco.complemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, numero, complemento);
    }
}
