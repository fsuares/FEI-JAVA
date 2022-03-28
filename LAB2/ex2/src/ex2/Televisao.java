



package ex2;

public class Televisao {

    private String modelo;
    private float preco, tamanho;
    private int volume = 1, canal = 1;
    private boolean ligada = false;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getLigada() {
        if (ligada == true) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int alteraVolume(int moreless) {
        if (moreless == 1) {
            volume++;
            if (volume > 100) {
                this.volume = 1;
            }
        } else if (moreless == 2) {
            volume--;
            if (volume < 0) {
                this.volume = 99;
            }
        }
        return this.volume;
    }

    public int alteraCanal(int moreless) {
        if (moreless == 1) {
            canal++;
            if (canal > 999) {
                this.canal = 1;
            }
        } else if (moreless == 2) {
            canal--;
            if (canal < 1) {
                this.canal = 999;
            }
        }
        return this.canal;
    }
}




