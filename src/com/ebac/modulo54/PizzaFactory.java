package com.ebac.modulo54;

public class PizzaFactory {
    public Pizza crearPizza(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "hawaiana" -> new PizzaHawaiana();
            case "pepperoni" -> new PizzaPepperoni();
            default -> throw new IllegalArgumentException("Tipo de pizza no disponible: " + tipo);
        };
    }

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza pizza1 = factory.crearPizza("hawaiana");
        pizza1.preparar();
        pizza1.hornear();

        Pizza pizza2 = factory.crearPizza("pepperoni");
        pizza2.cortar();
        pizza2.empaquetar();
    }
}
