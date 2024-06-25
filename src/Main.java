import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.empresarial.Setor;
import com.infnet.dominios.funcionarios.internos.FuncionarioPleno;
import com.infnet.dominios.pessoas.Telefone;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Telefone> telefonesJoao = new ArrayList<>();
        telefonesJoao.add(new Telefone("(68) 97215-7894"));
        telefonesJoao.add(new Telefone("7912334431"));

        FuncionarioPleno funcionario = new FuncionarioPleno(
                "João",
                telefonesJoao,
                new Endereco("rua tal", "Centro", 1123, "Cidade", "79984500", "MS"),
                BigDecimal.valueOf(10000.00),
                Setor.DESENVOLVIMENTO
        );

        System.out.println("Algum telefone do funcionario " + funcionario.pegarNome() + " é válido? " + telefonesJoao.stream().anyMatch(Telefone::validarNumero));
        System.out.println("Salário de " + funcionario.pegarNome() + " é: " + funcionario.pegarSalario());
        System.out.println("Salário reajustado de " + funcionario.pegarNome() + " é: " + funcionario.reajustarSalario(120));


    }
}

