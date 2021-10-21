package challenge;

import java.util.Objects;

public class CriptografiaCesariana implements Criptografia {

    public static String crypt (String texto, String type) {
        if(texto.length() == 0) throw new IllegalArgumentException();

        texto = texto.toLowerCase();
        String resultado = "";


        for (int i = 0; i < texto.length(); i++) {
            char charact = texto.charAt(i);

            if (charact >= 'a' && charact <= 'z'){
                int characterSwap = Objects.equals(type, "encrypt") ? charact + 3 : charact -3;
                resultado += (char) characterSwap;
            } else {
                resultado += (char) charact;
            }
        }
        return resultado;

    }

    @Override
    public String criptografar(String texto) {
        return crypt(texto, "encrypt");
    }

    @Override
    public String descriptografar(String texto) {
        return crypt(texto, "decrypt");
    }
}