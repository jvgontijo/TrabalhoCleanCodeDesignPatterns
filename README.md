# Projeto Disciplina - Padrões de Projeto e Clean Code
#### Projeto realizado para Disciplina de Padrões de Projeto e Clean Code do curso Pós Graduação em Engenharia de Software Java do Instituto INFNET


## Padrões de Projeto Utilizados:
### Criacionais
#### - Fábrica Abstrata
#### - Método Fábrica
### Comportamental
#### -
### Estrutural
#### - Ponte

## SOLID
### S - Principio da Responsabilidade Única
#### Utilizado por exemplo, no agrupamento dos dados de Endereço

### O - Principio Aberto Fechado
#### Utilizado por meio da implementação de interfaces e classes que não deixam que Estagiario tenha salario, e Senior tenha avanço de cargo.

### L - Principio da Substituição de Liskov
##### Utilizado para evitar que Funcionário Terceirizado, apesar de ser um Funcionário, não ter o método reajustarSalário()

### I - Princípio da Segregação da Interface
##### Utilizado para criar interfaces especificas e impedir que uma classe não implemente métodos que não irá utilizar

### D - Princípio da Inversão da Dependência
#### Não identificado para aplicação

### Clean Code e Bad Smells
#### Foram utilizados nomes coesos.
#### Evitado uso de comentários
#### Foi utilizado refatoração de funções, como por exemplo, o switch calcularReajusteSalarial() em Cargo foi removido e utilizado Classes para cada tipo de funcionario, utilizando uma interface de FuncionarioInternoFactory, e uma interface exclusiva para FuncionarioSeniorFactory, que não possui avanço de cargo.
<img src="images/Switch_ReajustarSalarioPorCargo.png" width="100%" height="100%">
<img src="images/Organizacao_arquivos_funcionarios.png" width="100%" height="100%">
<img src="images/funcionario_interno_factory.png" width="100%" height="100%">
<img src="images/funcionario_pleno.png" width="100%" height="100%">
<img src="images/funcionario_senior_factory.png" width="100%" height="100%">
<img src="images/funcionario_senior.png" width="100%" height="100%">


#### Utilizado stream do java 8 para utilizar a validação de telefone na Main após criar um funcionario