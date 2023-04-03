package dev.ifrs;

import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import dev.ifrs.entity.User;
import dev.ifrs.usecase.UserUC;


@QuarkusTest
public class UnitarioTest { //sufixo teste é importante para o Maven achar os códigos de teste depois, é regra de "reconhecimento" de teste do Maven
    //Maven serve para gerenciamento de dependências, testes e também para builds e para deploys
    //Dentro do maven existe um plugin chamado surefire que é o responsável por executar os testes
    //Cuidado para não criar dependência entre os casos de teste!
    @Test
    public void testCreateUser() {
        UserUC uc = new UserUC();
        User user = uc.createUser("rodrigo@test.com", "123456");
        assertNotNull(user);

    }

    @Test
    public void testCreateUserEmail() {
        UserUC uc = new UserUC();
        User user = uc.createUser("rodrigo@test.com", "123456");
        assertEquals("rodrigo@test.com", user.getEmail());

        //para rodar o teste pelo terminal digitar "mvn test" no terminal, a partir do projeto inteiro

    }

}