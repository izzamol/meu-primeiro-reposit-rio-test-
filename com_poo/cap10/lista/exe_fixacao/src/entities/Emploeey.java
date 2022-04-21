package entities;

public class Emploeey {
    private Integer id;
    private String name;
    private Double salary;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public Emploeey(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void increaseSalare(double percent){
        salary += salary * percent/100.0;
        

    }
    @Override
    public String toString() {
        return "Emploeey id:" + id + ", name=:" + name + String.format(", salary: %.2f",salary )+ "";
    }


    
}
