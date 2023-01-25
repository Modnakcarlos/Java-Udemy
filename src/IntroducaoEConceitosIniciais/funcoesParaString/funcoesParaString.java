package IntroducaoEConceitosIniciais.funcoesParaString;

public class funcoesParaString {
    public static void main(String[] args) {
        
        String original = "abcd FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // Tudo minúsculo
        String s02 = original.toUpperCase(); // Tudo maiúsculo
        String s03 = original.trim(); // Remove espaços nos cantos da string
        String s04 = original.substring(2); // Nova string com indice 2 (começa com 0. indice indica qual posição incial da nova string (c)
        String s05 = original.substring(2, 9); // recorta no indice 2 até o indice 9;
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xy");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowercase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace(a, x): -" + s06);
        System.out.println("replace(a, x): -" + s07);



    }
}
