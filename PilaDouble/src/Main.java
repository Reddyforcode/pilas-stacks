public class Main {

    public static void main(String[] args) {

        Operaciones op = new Operaciones();
        Pila pil = new Pila();
        pil = op.insertarN(pil);
        pil = op.mostrar(pil);
        pil = op.promedio(pil);
        pil = op.elimNeg(pil);
        pil = op.mostrar(pil);

        pil = op.insertBase(pil);
        pil = op.mostrar(pil);



    }

}