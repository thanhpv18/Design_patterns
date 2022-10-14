public class PizzaTestDrive {

    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("nycheese");
        System.out.println("NY pizza: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("chicagopepperoni");
        System.out.println("Chicago pizza: " + pizza.getName() + "\n");
    }
    
}
