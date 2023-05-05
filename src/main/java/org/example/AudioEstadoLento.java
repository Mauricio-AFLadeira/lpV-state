package org.example;

public class AudioEstadoLento extends AudioEstado{
    private AudioEstadoLento() {};
    private static AudioEstadoLento instance = new AudioEstadoLento();
    public static AudioEstadoLento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Velocidade x0.75";
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
    public boolean velocidadeMin(Audio audio) {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        return true;
    }
}
