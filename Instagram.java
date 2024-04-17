public class Instagram {
    // Atributos mais importantes
    private String usuario;
    private int seguidores;
    private int publicacoes;
    private int reels;
    private int stories;

    // Construtor
    public Instagram(String usuario, int seguidores, int publicacoes, int reels, int stories) {
        this.usuario = usuario;
        this.seguidores = seguidores;
        this.publicacoes = publicacoes;
        this.reels = reels;
        this.stories = stories;
    }

    // Getters e Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public int getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(int publicacoes) {
        this.publicacoes = publicacoes;
    }

    public int getReels() {
        return reels;
    }

    public void setReels(int reels) {
        this.reels = reels;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }
}
