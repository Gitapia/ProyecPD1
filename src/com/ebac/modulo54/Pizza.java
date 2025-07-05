package com.ebac.modulo54;

// Archivo: PizzaFactory.java
public interface Pizza {
    void preparar();
    void hornear();
    void cortar();
    void empaquetar();
}

class PizzaHawaiana implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza hawaiana: jamón y piña");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza hawaiana por 15 minutos");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza hawaiana en 8 porciones");
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando pizza hawaiana");
    }
}

class PizzaPepperoni implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando pizza de pepperoni");
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de pepperoni por 12 minutos");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de pepperoni en 6 porciones");
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando pizza de pepperoni");
    }
}

