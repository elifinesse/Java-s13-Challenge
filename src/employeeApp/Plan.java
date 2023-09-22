package employeeApp;

public enum Plan {
    PLAN1("basic", 2000),
    PLAN2("extended", 5000),
    PLAN3("dental", 3000);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
    
}
