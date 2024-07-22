public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligacao");
    }
}
