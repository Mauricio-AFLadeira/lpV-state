package org.example;

public class AudioEstadoMuitoLento extends AudioEstado{
    private AudioEstadoMuitoLento() {};
    private static AudioEstadoMuitoLento instance = new AudioEstadoMuitoLento();
    public static AudioEstadoMuitoLento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Velocidade x0.5";
    }
    public boolean velocidadeMax(Audio audio) {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        return true;
    }
    public boolean velocidadeAumentada(Audio audio) {
        audio.setEstado(AudioEstadoRapido.getInstance());
        return true;
    }
    public boolean velocidadeNormal(Audio audio) {
        audio.setEstado(AudioEstadoNormal.getInstance());
        return true;
    }
    public boolean velocidadeDiminuida(Audio audio) {
        audio.setEstado(AudioEstadoLento.getInstance());
        return true;
    }
}
