package genericsSetMap.introducao.exemplo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();
        System.out.print("Quantos nomes? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String value = sc.nextLine();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("Primeiro elemento " + ps.first());

        sc.close();
    }
}
