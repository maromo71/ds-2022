public class GerenciarEmpresa {
    public static void main(String[] args) {
        PessoaJuridica mane = new PessoaJuridica();
        mane.id = 11;
        mane.nomePessoa = "Manoel da Silva Santos ME Ltda";
        mane.cnpj = "32112345611123";
        if(mane.validarDocumento()){
            System.out.println("Cpf valido");
        }else{
            System.out.println("Cpf Invalido");
        }
    }
}