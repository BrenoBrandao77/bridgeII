package padroescriacao.builder.exemplo2;

import java.util.Date;

public class Funcionario {

    private Funcionario Funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }

    public Funcionario build() {
        if (funcionario.getMatricula() == 0) {
            throw new IllegalArgumentException("Matrícula incorreta");
        }
        if (funcionario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome incorreto");
        }
        return funcionario;
    }

    public FuncionarioBuilder setMatricula(int matricula) {
        funcionario.setMatricula(matricula);
        return this;
    }

    public FuncionarioBuilder setNome(String nome) {
        funcionario.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setDataNascimento(Date dataNascimento) {
       funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder setNomeMae(String nomeMae) {
        Funcionario.setNomeMae(nomeMae);
        return this;
    }

    publi FuncionarioBuilder setNomePai(String nomePai) {
        Funcionario.setNomePai(nomePai);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        Funcionario.setCpf(cpf);
        return this;

    }

    public FuncionarioBuilder setRg(String rg) {
        Funcionario.setRg(rg);
        return this;
    }

    public FuncionarioBuilder setEscolaAnterior(String escolaAnterior) {
        Funcionario.setEscolaAnterior(escolaAnterior);
        return this;
    }

    public FuncionarioBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        Funcionario.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public FuncionarioBuilder setEnderecoNumero(int enderecoNumero) {
        Funcionario.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public FuncionarioBuilder setEnderecoComplemento(String enderecoComplemento) {
        Funcionario.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public FuncionarioBuilder setEnderecoBairro(String enderecoBairro) {
        Funcionario.setEnderecoBairro(enderecoBairro);
        return this;
    }

}