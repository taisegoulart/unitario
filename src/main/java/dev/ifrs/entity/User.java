package dev.ifrs.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private String email;
    private String password;
    //normalmente se escreveria os getters e setters aqui, porém hoje em dia existe o lombock do maven que faz isso automático (usar import das linhas 3 e 4, mais os @Getter/setter e instalar a extensão lombok)
    
}
