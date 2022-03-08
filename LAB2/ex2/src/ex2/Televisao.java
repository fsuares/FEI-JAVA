package ex2;

public class Televisao {

    private String modelo;
    private float preco, tamanho;
    private int volume = 1, canal = 1;
    private boolean ligada, moreless;

    private String getModelo() {
        return this.modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private float getPreco() {
        return this.preco;
    }

    private void setPreco(int preco) {
        this.modelo = modelo;
    }

    private float getTamanho() {
        return this.tamanho;
    }

    private void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getCanal() {
        return this.canal;
    }

    private void setCanal(int canal) {
        this.canal = canal;
    }

    private boolean getLigada() {
        return this.ligada;
    }

    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int alteraVolume(boolean moreless) {
        if (moreless = true) {
            volume++;
            if (volume > 100) {
                this.volume = 1;
            }
        } 
        
        else if (moreless = false) {
            volume--;
            if (volume < 0) {
                this.volume = 99;
            }
        }
        return this.volume;
    }
    
    public int alteraCanal(boolean moreless) {
        if (moreless = true) {
            canal++;
            if (canal > 999) {
                this.canal = 1;
            }
        } 
        
        else if (moreless = false) {
            canal--;
            if (canal < 0) {
                this.canal = 999;
            }
        }
        return this.volume;
        
        public boolean desligatTv(){
            if (this.ligada = false){
                this.ligada = true;
            }
            else if (this.ligada = true){
                this.ligada = false;
            }
        }
    }

}
