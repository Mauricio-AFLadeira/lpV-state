package org.example;

public class Audio {
    private String velocidade;
    private AudioEstado estado;
    public void setEstado(AudioEstado estado) { this.estado = estado; }

    public boolean velocidadeMax() { return estado.velocidadeMax(this); }
    public boolean velocidadeAumentada() { return estado.velocidadeAumentada(this); }
    public boolean velocidadeNormal() { return estado.velocidadeNormal(this); }
    public boolean velocidadeDiminuida() { return estado.velocidadeDiminuida(this); }
    public boolean velocidadeMin() { return estado.velocidadeMin(this); }
    public String getNomeEstado() { return estado.getEstado(); }
    public String getVelocidade(String velocidade) { return this.velocidade; }
    public void setVelocidade(String velocidade) { this.velocidade = velocidade; }
    public AudioEstado getEstado() { return estado; }
}
