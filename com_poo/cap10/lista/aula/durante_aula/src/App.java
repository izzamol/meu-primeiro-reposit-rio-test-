import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Integer> list = new ArrayList<>();

            list.add(5);//          |
            list.add(35);//      |
            list.add(30);//     |  add lista
            list.add(2);//      |
            list.add(5);//      |    
            list.add(35);//     |

            System.out.println(list.size());//ver tamanho da lista
        
        System.out.println("--------------------------------------------");
            for (Integer x : list){
                System.out.println(x);
            }

        System.out.println("--------------------------------------------");

        list.add(2, 0);// add elemento em uma possição especifica
        
        list.remove((Integer) 35);//remover o primeiro elemento  equivalente
        list.remove(2);//remover posição
        //list.removeIf(v -> v.intValue() == 5);//remover todos os elemento equivalentes
        



            
        
            for (Integer s : list){
                System.out.println(s);
            }
            System.out.println("------------------------------------------------------------------");
            System.out.println(list.indexOf(77));//posição do elemento


            List<Integer> result = list.stream().filter(v -> v.intValue() == 5).collect(Collectors.toList());
//                               |CONVERTE P/STEAM|    |FAZ O FILTRO|            |CONVERTE PARA LISTA DNOVO|                                                                                                              

        System.out.println("=================================================");
        for (int a : result) {
            System.out.println(a);
            
        }
        }
}
