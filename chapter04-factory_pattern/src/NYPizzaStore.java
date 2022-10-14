public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("nycheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("nypepperoni")){
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
