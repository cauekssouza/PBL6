public class Instagram {
    // Atributos mais importantes
    protected String usuários;
    protected int seguidores;
    protected int publicação;
    protected int reels;
    protected int storys;

    // Construtor
    public Instagram(String usuários, int seguidores, int publicação, int reels, int storys){
        this.usuarios = usuários;
        this.seguidores = seguidores;
        this.publicação = publicação;
        this.reels = reels;
        this.storys = storys;
    }

    // Métodos  principais Getters e Setters
    public String getUsuario(){
        return usuários;
    }
    public void setUsuario(String  usuarios){
        this.usuários = usuarios;
    }
    public int getSeguidores(){
        return seguidores;
    }
    public void setSeguidores(int seguidores){
        this.seguidores = seguidores;
    }
    public int  getPublicação(){
        return publicação;
    }
    public void  setPublicação(int publicação){
        this.publicação = publicação;
    }
    public int getReels(){
        return reels;
    }
    public void setReels(int reels){
        this.reels = reels;
    }
    public int GetStory(){
        return storys;
    }
    public void setStory(int storys){
        this.storys = storys;
    }

}
