package challenge;

public class Main {
    public static void main(String[] args) {
        CriptografiaCesariana criptografia = new CriptografiaCesariana();
        String teste = "whvwdqgr d fulswrjudild";
        String criptada = CriptografiaCesariana.crypt(teste, "decrypt");
        System.out.println(criptada);
        String decriptada = criptografia.descriptografar(criptada);
    }
}
