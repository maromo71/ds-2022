public class PessoaJuridica extends Pessoa{
    public String cnpj;
    @Override
    public boolean validarDocumento() {
        return cnpj.length() == 14;
    }
}
