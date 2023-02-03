package comportamentoDeMemoriaArraysListas.arrays.boxingUnboxingWrapperClasses;

public class ForEach {
    public static void main(String[] args) {

        String[] nomes = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // FOREACH

        System.out.println("_________________");
        for(String obj : nomes) {
            System.out.println(obj);
        }

    }
}
