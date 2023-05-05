package org.example;

public abstract class AudioEstado {
    public abstract String getEstado();

    public boolean velocidadeMax(Audio audio) {return false;}
    public boolean velocidadeAumentada(Audio audio) {return false;}
    public boolean velocidadeNormal(Audio audio) {return false;}
    public boolean velocidadeDiminuida(Audio audio) {return false;}
    public boolean velocidadeMin(Audio audio) {return false;}

}
