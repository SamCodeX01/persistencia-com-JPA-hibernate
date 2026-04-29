package br.com.alura.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    // Cria fábrica de conexões JPA para o banco "loja" (gerencia as entidades)
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");

    //Metodo getEntityManager do tipo EntityManager retorna o resultado do metodo createEntityManager que pertence a variavel FACTORY que esta gerenciando o banco loja
    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }

}

/*A variavel estatica e constante FACTORY do tipo EntityManagerFactory(Fábrica de Gerenciadores de Entidades),
recebe a classe Persistence que esta acessando o metodo createEntityManagerFactory(criar a Fábrica de Gerenciadores de Entidades),
trabalhando com a unidade banco chamado "loja" que sera persistido no banco de dados, que tera as suas classes(entidades) gerenciadas pela fabrica de gerenciadores*/