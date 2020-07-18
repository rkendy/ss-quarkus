package br.uff.ihs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class SetorTest {

    @Test
    public void givenSetor_whenCount_thenSuccess() {
        assertEquals(3, Setor.count());
    }

    // @Test
    // @Transactional
    // public void givenNewSetor_whenPersist_thenSuccess() {
    // Setor s =
    // Setor.builder().ativo(true).codigo(Setor.Codigo.ALMOXARIFADO).nome("Nome").build();
    // s.persist();
    // assertTrue(s.isPersistent());
    // }
}