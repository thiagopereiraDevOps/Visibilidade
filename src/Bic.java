public class Bic {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.carga = 90;
        c1.ponta = 0.7f;
//        c1.tampada = false;
        c1.rabiscar();
        c1.status();
        c1.destampar();
        System.out.println(" ");

        Caneta c2 = new Caneta();
        c1.cor = "Vermelho";
        c1.modelo = "Bic";
        c1.carga = 100;
        c1.ponta = 0.5f;
//        c1.tampada = true;
        c1.rabiscar();
        c1.status();
        c1.destampar();
        System.out.println(" ");
    }
}
