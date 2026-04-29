package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ProdutoDao {
    public ProdutoDao em;

    public ProdutoDao(EntityManager em){
        this.em = (ProdutoDao) em;
    }

    public void cadastrar(Produto produto){
        this.em.persist(produto);
    }
}
