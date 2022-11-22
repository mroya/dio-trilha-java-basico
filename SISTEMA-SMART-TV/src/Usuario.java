public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        smartTv.desligar();
        smartTv.aumentarVolume();
        
        System.out.println("Novo Status - A TV esta Ligada? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
