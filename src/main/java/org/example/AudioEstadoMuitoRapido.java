package org.example;

public class AudioEstadoMuitoRapido extends  AudioEstado{
    private AudioEstadoMuitoRapido() {};
    private static AudioEstadoMuitoRapido instance = new AudioEstadoMuitoRapido();
    public static AudioEstadoMuitoRapido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Velocidade x2.0";
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
    public boolean velocidadeMin(Audio audio) {
        audio.setEstado(AudioEstadoMuitoLento.getInstance());
        return true;
    }
}
