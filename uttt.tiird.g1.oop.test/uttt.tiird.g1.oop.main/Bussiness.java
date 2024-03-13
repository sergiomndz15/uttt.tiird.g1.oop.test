
public class Bussiness {
    public double calculoFactorial(Model mod){
        double f=1;
        int i=0;
        do{
            i=i+1;
            f=f*i;
        }while(i<mod.getN());
    return f;
    }
}
