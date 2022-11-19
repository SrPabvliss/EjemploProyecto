package mundopc;

import com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Teclado teclado = new Teclado("Teclado", "Logitech");
        Raton raton = new Raton("Raton", "Razor");
        Monitor monitor = new Monitor("Asus", 24.5);

        Computadora compu1 = new Computadora("MSI Katana", monitor, teclado, raton);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compu1);

        orden1.mostrarOrden();
    }
}
