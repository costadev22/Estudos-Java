package Polimorfismo.devFlix;

public class Serie extends Filme{

    private int temporadas;
    private int episodiosPorTemporadas;
    private int epsodioAtual;
    private int temporadaAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporadas) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporadas = episodiosPorTemporadas;
        this.temporadaAtual = 1;
        this.epsodioAtual = 1;
    }


    public void play(int temporada, int epsodio){
        if(validarEpisodio(temporada, epsodio)){
            this.temporadaAtual = temporada;
            this.epsodioAtual = epsodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episódio inválido");
        }

    }

    private boolean validarEpisodio(int temporada, int epsodio){
        if(temporada == 0 || epsodio == 0)
            return false;
            if (temporada > temporada || epsodio > episodiosPorTemporadas)
                return false;

            return true;

    }

    // Os métodos especificos da classe
    @Override
    public String toString(){
        // Serie <nome> <temporada>x0<epsiodio>
        // Serie The Last of Us 1x15

        String informacao = String.format("Serie %s %dx%02d(audio %s, legenda %s)",
                getNome(),
                temporadaAtual,
                epsodioAtual,
                getAudio(),
                getLegenda());
        return informacao;
    }




    // Os métodos getters e setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getEpsodioAtual() {
        return epsodioAtual;
    }

    public void setEpsodioAtual(int epsodioAtual) {
        this.epsodioAtual = epsodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
}
