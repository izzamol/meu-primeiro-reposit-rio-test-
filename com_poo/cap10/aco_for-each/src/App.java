public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] vec = new String[]{"maria","bob", "alex"};

        for(int i = 0; i < vec.length;i++){
            System.out.println(vec[i]);
        }

        System.out.println("=============================================");
        
        // "para cada" vai contar cada casa do vetor numa 
        //numa estrutura mais limpa diferente do 'for' simples
        
        for (String apelido : vec) {
            System.out.println(apelido);
        
        }
    }
}
