package AparelhoTelefonico;

import Aplicativos.NavegadorInternet;
import Aplicativos.ReprodutorMusical;

public class Iphone extends AparelhoTelefonico{

    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();
        NavegadorInternet browser = new NavegadorInternet();
        ReprodutorMusical musicPlayer = new ReprodutorMusical();
        String numero = "999-999-00";
        String url = "URL QUALQUER";

        iphone.atender();
        iphone.ligar(numero);
        iphone.iniciarCorreioVoz();
        browser.atualizarPagina();
        browser.adicionarNovaAba();
        browser.exibirPagina(url);
        musicPlayer.pausar();
        musicPlayer.tocar();
        musicPlayer.selecionarMusica(url);

        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
