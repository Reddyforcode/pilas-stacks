public class Pila {

    final int max = 50;
    double elem[];
    int CIMA;

    public Pila()
    {
        CIMA = 0;
        elem = new double[max+1];
    }
    public void inicializar()
    {
        CIMA = 0;
    }

    public boolean pilaVacia()
    {
        return CIMA == 0;
    }
    public boolean pilaLlena()
    {
        return CIMA == max;
    }

    public double ver()
    {
        return elem[CIMA];
    }

    public void insertaar(double x)
    {
        if(!pilaLlena())
        {
            ++CIMA;
            elem[CIMA] = x;
        }
    }

    public void eliminar()
    {
        if(!pilaLlena())        CIMA = CIMA-1;
    }

}