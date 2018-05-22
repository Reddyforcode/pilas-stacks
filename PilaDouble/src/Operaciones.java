public class Operaciones {

    public Pila insertarN(Pila pil)
    {
        System.out.println("N° de elementos");
        double dato;
        int n = Leer.datoInt();
        for(int i = 0; i<n; i++)
        {
            System.out.println("ingrese dato");
            dato = Leer.datoDouble();
            pil.insertaar(dato);
        }
        return pil;
    }

    public Pila mostrar(Pila p)
    {
        Pila aux = new Pila();
        double d;
        while (!p.pilaVacia())
        {
            d = p.ver();
            System.out.println(d);
            p.eliminar();
            aux.insertaar(d);
        }
        while(!aux.pilaVacia())
        {
            d = aux.ver();
            aux.eliminar();
            p.insertaar(d);
        }
        return p;
    }

    public Pila promedio(Pila p)
    {
        int sumP=0, contP = 0;
        Pila aux = new Pila();
        double d;
        while (!p.pilaVacia())
        {
            d = p.ver();

            if(d>=0)    {
                sumP += d;
                contP++;
            }
            p.eliminar();
            aux.insertaar(d);
        }
        while(!aux.pilaVacia())
        {
            d = aux.ver();
            aux.eliminar();
            p.insertaar(d);
        }
        System.out.println("promedio positivos = " + (sumP/contP));
        return p;
    }

    public Pila elimNeg(Pila p)
    {
        Pila aux = new Pila();
        double d;
        while (!p.pilaVacia())
        {
            d = p.ver();
            p.eliminar();
            if(d>=0)aux.insertaar(d);
        }
        while(!aux.pilaVacia())
        {
            d = aux.ver();
            aux.eliminar();
            p.insertaar(d);
        }
        return p;
    }

    public Pila insertBase(Pila p)
    {
        System.out.println("\ninsertar elemnto en la base:");
        double insert = Leer.datoDouble();
        Pila aux = new Pila();
        double d;
        while (!p.pilaVacia())
        {
            d = p.ver();
            p.eliminar();
            if(d>=0)aux.insertaar(d);
        }
        aux.insertaar(insert);
        while(!aux.pilaVacia())
        {
            d = aux.ver();
            aux.eliminar();
            p.insertaar(d);
        }

        return p;
    }
}