package Basic.Classes;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {

            Usuario outro = (Usuario) objeto;


            boolean nomeIgual = Objects.equals(outro.nome, this.nome);
            boolean emailIgual = Objects.equals(outro.email, this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }



    }
}
