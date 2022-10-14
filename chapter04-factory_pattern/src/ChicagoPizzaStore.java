public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        if (type.equals("chicagocheese")){
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("chicagopepperoni")){
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
