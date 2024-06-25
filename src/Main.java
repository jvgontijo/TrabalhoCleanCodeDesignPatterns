import com.infnet.dominios.Endereco;
import com.infnet.dominios.Setor;
import com.infnet.dominios.funcionarios.internos.FuncionarioPleno;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> telefonesJoao = new ArrayList<>();
        telefonesJoao.add("1233-2233");
        telefonesJoao.add("1233-4431");

        FuncionarioPleno joao = new FuncionarioPleno(
                "João",
                telefonesJoao,
                new Endereco("rua tal", "Centro", 1123, "Cidade", "79984500", "MS"),
                BigDecimal.valueOf(10000.00),
                Setor.DESENVOLVIMENTO
        );

        System.out.println("Salário reajustado de " + joao.getNome() + " é: " + joao.reajustarSalario());

        ArrayList<String> telefonesAna = new ArrayList<>();

//        FuncionarioTerceirizado ana = new FuncionarioTerceirizado( );


    }
}

