package org.example;

public class AudioEstadoNormal extends AudioEstado{
    private AudioEstadoNormal() {};
    private static AudioEstadoNormal instance = new AudioEstadoNormal();
    public static AudioEstadoNormal getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Velocidade x1.0";
    }
    public boolean velocidadeMax(Audio audio) {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
        return true;
    }
    public boolean velocidadeAumentada(Audio audio) {
        audio.setEstado(AudioEstadoRapido.getInstance());
        return true;
    }
    public boolean velocidadeDiminuida(Audio audio) {
        audio.setEstado(AudioEstadoLento.getInstance());
        return true;
    }
    public boolean velocidadeMin(Audio audio) {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        return true;
    }
}
