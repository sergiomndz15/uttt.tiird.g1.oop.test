public class Controller {
    public void control(){
        GUI data=new GUI();
        int n=data.solicitarN();
        Model mod = new Model(n);
        Bussiness bus=new Bussiness();
        double fac=bus.calculoFactorial(mod);
        data.mostrarResultado(fac,n);
    }
}
