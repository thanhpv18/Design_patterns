public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    
    void bake(){
        System.out.println("Baking ...");
    }

    void prepare(){
        System.out.println("Preparing ...");
    }

    void cut(){
        System.out.println("Cutting ...");
    }

    void box(){
        System.out.println("Boxing ...");
    }

    public String getName(){
        return name;
    }
}
