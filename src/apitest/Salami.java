package apitest;

public class Salami {
    int id;
    String name;
    float  price_kg;
    String material;
    String production_time;
    String created_at;
    String updated_at;
    public Salami() {}
    public Salami(int id, String name, float price_kg, String material, 
                    String production_time, String created_at,String updated_at) {
        this.id = id;
        this.name = name;
        this.price_kg = price_kg;
        this.material = material;
        this.production_time = production_time;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }    
}