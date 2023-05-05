package org.example;

public class AudioEstadoRapido extends AudioEstado{
    private AudioEstadoRapido() {};
    private static AudioEstadoRapido instance = new AudioEstadoRapido();
    public static AudioEstadoRapido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Velocidade x1.5";
    }
    public boolean velocidadeMax(Audio audio) {
        audio.setEstado(AudioEstadoMuitoRapido.getInstance());
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
    public boolean velocidadeMin(Audio audio) {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        return true;
    }
}
