public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("nystylecheesepizza")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("chicagostylepizza")){
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
