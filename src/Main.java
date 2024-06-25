import com.infnet.dominios.pessoas.Endereco;
import com.infnet.dominios.empresarial.Setor;
import com.infnet.dominios.funcionarios.internos.FuncionarioPleno;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> telefonesJoao = new ArrayList<>();
        telefonesJoao.add("1233-2233");
        telefonesJoao.add("1233-4431");

        FuncionarioPleno funcionario = new FuncionarioPleno(
                "João",
                telefonesJoao,
                new Endereco("rua tal", "Centro", 1123, "Cidade", "79984500", "MS"),
                BigDecimal.valueOf(10000.00),
                Setor.DESENVOLVIMENTO
        );

        System.out.println("Salário de " + funcionario.pegarNome() + " é: " + funcionario.pegarSalario());
        System.out.println("Salário reajustado de " + funcionario.pegarNome() + " é: " + funcionario.reajustarSalario(120));


    }
}

