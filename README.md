# Projeto Java - Gerenciamento de Atendimentos em Clínica Médica

## Descrição
Sistema simples para gerenciar a fila de atendimento e o histórico de pacientes de uma clínica médica. Permite registrar a chegada de pacientes, organizar a fila de atendimento, processar o atendimento e armazenar o histórico dos pacientes atendidos.

## Funcionalidades
- Cadastro de pacientes com nome, idade e sintoma
- Fila de atendimento utilizando `LinkedList`
- Histórico de atendimentos utilizando `Stack`
- Validação de entrada de dados sem uso de try-catch
- Menu interativo no console

## Estrutura do Projeto
```
├── Paciente.java                  # Classe modelo do paciente
├── FilaDeAtendimento.java         # Gerencia a fila de pacientes
├── PilhaHistoricoAtendimentos.java# Gerencia o histórico de atendimentos
├── GerenciadorClinica.java        # Classe principal (main)
├── README.md                      # Este arquivo


## Como Executar
1. Compile todos os arquivos Java:
   ```bash
   javac *.java
   ```
2. Execute o programa principal:
   ```bash
   java GerenciadorClinica
   ```

## Menu do Sistema
```
1. Adicionar novo paciente à fila
2. Atender próximo paciente
3. Exibir fila de atendimento
4. Exibir histórico de atendimentos
5. Sair
```

## Requisitos Técnicos
- Java 8 ou superior
- Não utiliza switch-case nem try-catch para controle de fluxo
- Validação de dados com métodos do Scanner

## Autor
- Marcos Inácio de Souza Rosa




