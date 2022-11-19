package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append("Dispositivo ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
