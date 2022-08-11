public class PessoaFisica extends Pessoa {
    public String cpf;

    @Override
    public boolean validarDocumento() {
        return cpf.length() == 11;
    }
}
