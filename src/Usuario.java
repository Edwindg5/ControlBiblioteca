class Usuario {
    private Biblioteca biblioteca;

    public Usuario(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void consultarMaterial() {
        biblioteca.consultarMaterial();
    }
}
