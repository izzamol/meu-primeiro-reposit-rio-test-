import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Emploeey;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Emploeey> list = new ArrayList<>();
       

        System.out.println("how many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i< n; i++){
            System.out.println("Employee #"+ (i+1) +": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Emploeey emp = new Emploeey(id, name, salary);

            list.add(emp);

        }

    
        System.out.println("enter employee id that will have salary increase: ");
        int id = sc.nextInt();
        

        hasId(list, id);
        
         
       /*

        //detectar o Id dentro da lista (emp é meu ojeto q desejo alterar (id pesquisado))
        Emploeey emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		// if (pos == null) {
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
            
			//list.get(pos).increaseSalary(percent);
            double percent = sc.nextDouble();
            emp.increaseSalare(percent);
		}
        */
        
        System.out.print("Enter the percentage: ");
        double percent = sc.nextDouble();
        if (hasId(list, id) == null){
            System.out.println("this id does not exist");
        }
        else {
            list.get(hasId(list, id)).increaseSalare(percent);
        }

        System.out.println();
        System.out.println();
		System.out.println("List of employees:");

		for (Emploeey emploeey : list) {
            
			System.out.println(emploeey.toString());
		}
        sc.close();		
        
        
    }
    public static Integer hasId(List<Emploeey> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;

        

    }


    

    
}
