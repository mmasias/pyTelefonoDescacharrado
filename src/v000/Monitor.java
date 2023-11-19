class Monitor {
    private String nombre;
    private Cola colaNiños;
    private boolean estaJugando;

    public Monitor(String nombre) {
        this.nombre = nombre;
        this.colaNiños = new Cola();
        estaJugando = false;
    }

    public void recibeNiño(Niño niño) {
        colaNiños.addNiño(niño);
    }

    public boolean tieneNiños() {
        return colaNiños.hayNiños();
    }

    public boolean puedeJugar() {
        return colaNiños.size() >= 5;
    }

    public boolean estaJugando() {
        return estaJugando;
    }

    public void mostrarListaNiños() {
        System.out.print("> " + this.nombre + " --> ");
        colaNiños.listaNiños();
        System.out.println();
    }

    private void recibeNiño(Niño niño, Pizarra pizarrin) {
        niño.recibirPizarrin(pizarrin);
        colaNiños.addNiño(niño);
    }

    public void entregaNiños(Monitor otroMonitor) {
        while (colaNiños.hayNiños()) {
            System.out.println(" >  " + this.nombre + " ENTREGA NIÑO");
            Niño unNiño = colaNiños.removeNiño();
            otroMonitor.recibeNiño(unNiño, new Pizarra());
        }
    }    
}
