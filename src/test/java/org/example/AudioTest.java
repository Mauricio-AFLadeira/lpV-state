package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudioTest {
    Audio audio;

    @BeforeEach
    public void setUp() {
        audio = new Audio();
    }

    //Muito lento
    @Test
    public void naoDeveTrocarVelocidadeMuitoLentoParaMuitoLento() {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        assertFalse(audio.velocidadeMin());
    }
    @Test
    public void DeveTrocarVelocidadeMuitoLentoParaLento() {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        assertTrue(audio.velocidadeDiminuida());
        assertEquals(AudioEstadoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeMuitoLentoParaNormal() {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        assertTrue(audio.velocidadeNormal());
        assertEquals(AudioEstadoNormal.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeMuitoLentoParaRapido() {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        assertTrue(audio.velocidadeAumentada());
        assertEquals(AudioEstadoRapido.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeMuitoLentoParaMuitoRapido() {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        assertTrue(audio.velocidadeMax());
        assertEquals(AudioEstadoMuitoRapido.getInstance(), audio.getEstado());
    }

    //Lento
    @Test
    public void naoDeveTrocarVelocidadeLentoParaMuitoLento() {
        audio.setEstado(AudioEstadoLento.getInstance());
        assertTrue(audio.velocidadeMin());
        assertEquals(AudioEstadoMuitoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void naoDeveTrocarVelocidadeLentoParaLento() {
        audio.setEstado(AudioEstadoLento.getInstance());
        assertFalse(audio.velocidadeDiminuida());
    }
    @Test
    public void DeveTrocarVelocidadeLentoParaNormal() {
        audio.setEstado(AudioEstadoLento.getInstance());
        assertTrue(audio.velocidadeNormal());
        assertEquals(AudioEstadoNormal.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeLentoParaRapido() {
        audio.setEstado(AudioEstadoLento.getInstance());
        assertTrue(audio.velocidadeAumentada());
        assertEquals(AudioEstadoRapido.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeLentoParaMuitoRapido() {
        audio.setEstado(AudioEstadoLento.getInstance());
        assertTrue(audio.velocidadeMax());
        assertEquals(AudioEstadoMuitoRapido.getInstance(), audio.getEstado());
    }

    //Normal
    @Test
    public void naoDeveTrocarVelocidadeNormalParaMuitoLento() {
        audio.setEstado(AudioEstadoNormal.getInstance());
        assertTrue(audio.velocidadeMin());
        assertEquals(AudioEstadoMuitoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeNormalParaLento() {
        audio.setEstado(AudioEstadoNormal.getInstance());
        assertTrue(audio.velocidadeDiminuida());
        assertEquals(AudioEstadoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void naoDeveTrocarVelocidadeNormalParaNormal() {
        audio.setEstado(AudioEstadoNormal.getInstance());
        assertFalse(audio.velocidadeNormal());
    }
    @Test
    public void DeveTrocarVelocidadeNormalParaRapido() {
        audio.setEstado(AudioEstadoNormal.getInstance());
        assertTrue(audio.velocidadeAumentada());
        assertEquals(AudioEstadoRapido.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeNormalParaMuitoRapido() {
        audio.setEstado(AudioEstadoNormal.getInstance());
        assertTrue(audio.velocidadeMax());
        assertEquals(AudioEstadoMuitoRapido.getInstance(), audio.getEstado());
    }

    //Rapido
    @Test
    public void naoDeveTrocarVelocidadeRapidoParaMuitoLento() {
        audio.setEstado(AudioEstadoRapido.getInstance());
        assertTrue(audio.velocidadeMin());
        assertEquals(AudioEstadoMuitoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeRapidoParaLento() {
        audio.setEstado(AudioEstadoRapido.getInstance());
        assertTrue(audio.velocidadeDiminuida());
        assertEquals(AudioEstadoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeRapidoParaNormal() {
        audio.setEstado(AudioEstadoRapido.getInstance());
        assertTrue(audio.velocidadeNormal());
        assertEquals(AudioEstadoNormal.getInstance(), audio.getEstado());
    }
    @Test
    public void naoDeveTrocarVelocidadeRapidoParaRapido() {
        audio.setEstado(AudioEstadoRapido.getInstance());
        assertFalse(audio.velocidadeAumentada());
    }
    @Test
    public void DeveTrocarVelocidadeRapidoParaMuitoRapido() {
        audio.setEstado(AudioEstadoRapido.getInstance());
        assertTrue(audio.velocidadeMax());
        assertEquals(AudioEstadoMuitoRapido.getInstance(), audio.getEstado());
    }

    //Muito rapido
    @Test
    public void DeveTrocarVelocidadeMuitoRapidoParaMuitoLento() {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        assertTrue(audio.velocidadeMin());
        assertEquals(AudioEstadoMuitoLento.getInstance(), audio.getEstado());

    }
    @Test
    public void DeveTrocarVelocidadeMuitoRapidoParaLento() {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        assertTrue(audio.velocidadeDiminuida());
        assertEquals(AudioEstadoLento.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeMuitoRapidoParaNormal() {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        assertTrue(audio.velocidadeNormal());
        assertEquals(AudioEstadoNormal.getInstance(), audio.getEstado());
    }
    @Test
    public void DeveTrocarVelocidadeMuitoRapidoParaRapido() {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        assertTrue(audio.velocidadeAumentada());
        assertEquals(AudioEstadoRapido.getInstance(), audio.getEstado());
    }
    @Test
    public void naoDeveTrocarVelocidadeMuitoRapidoParaMuitoRapido() {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        assertFalse(audio.velocidadeMax());
    }
}