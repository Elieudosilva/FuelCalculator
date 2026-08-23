# 🚗 FuelCalculator

Aplicativo Android nativo para cálculo rápido de combustível, focado em auxiliar motoristas na escolha entre Álcool ou Gasolina.

![Kotlin](https://img.shields.io/badge/Kotlin-B125EA?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)

## 📋 Sobre o projeto

O **FuelCalculator** é um aplicativo Android desenvolvido com foco em consolidar os fundamentos da programação Android nativa (XML + Kotlin). 

O app recebe os preços da gasolina e do álcool e, com base no cálculo de rendimento (regra dos 70%), indica instantaneamente qual é a opção mais vantajosa para o bolso do usuário.

Este projeto foi desenvolvido como resolução de um desafio prático proposto pela **Comunidade Nova Era**, buscando aplicar conceitos essenciais de UI, navegação e passagem de dados no Android.

## 📸 Screenshots
<!-- You can add more screenshots here if you like -->
<p align="center">
    <img src="https://github.com/user-attachments/assets/2572842c-4821-4088-a2ad-9bb4aaf59ad9"  alt="Screen_two" width="200" />
    <img src="https://github.com/user-attachments/assets/e775751e-6173-4ed4-be7a-64e85558a1d4"  alt="Screen_two" width="200"/>
    <img src="https://github.com/user-attachments/assets/2fd8accb-e6e0-43ac-9a74-09a1cd4b6ba8"  alt="Screen_two" width="200"/>
    <img src="https://github.com/user-attachments/assets/0f4e1cf5-89f5-4853-9dc8-b57fdaca6fc0" alt="Screen_two" width="200"/>
    <img src="https://github.com/user-attachments/assets/5e78914a-b010-4a50-a152-f9352e115c72" alt="Screen_two" width="200" /> 
   </p>

## ✨ Funcionalidades

- **Cálculo de custo-benefício:** aplicação da regra de 70% para determinar se compensa abastecer com Álcool ou Gasolina.
- **Navegação de telas:** transição fluida da tela de inserção de dados para a tela de resultado.
- **Interface clara:** design estruturado para facilitar o uso rápido no momento de abastecer, incluindo uma `Toolbar` personalizada e suporte visual com `ImageView`.

## 🏗️ Arquitetura e Tecnologias

O projeto foi construído utilizando a abordagem clássica de desenvolvimento Android:

| Tecnologia / Recurso | Aplicação no projeto |
|---|---|
| **Kotlin** | Linguagem principal, gerenciando a lógica de negócio e eventos de clique. |
| **ConstraintLayout (XML)** | Construção das telas garantindo responsividade e bom alinhamento dos elementos. |
| **Intents explícitas** | Responsáveis por gerenciar a navegação entre as `Activities`. |
| **PutExtra / Extras** | Passagem dos resultados dos cálculos e dados preenchidos entre as telas. |
| **FindViewById** | Conexão entre os elementos visuais do XML e o código Kotlin. |

## 🚧 Desafios técnicos e aprendizados

### 1. Comunicação entre telas
**Desafio:** transferir os dados digitados e o resultado do cálculo da primeira tela para a segunda sem perder informações.
**Solução:** utilização do objeto `Intent` aliado ao método `putExtra()`, permitindo enviar os dados encapsulados e recuperá-los no `onCreate` da Activity de destino usando `intent.extras`.
**Aprendizado:** compreender o ciclo de vida básico das Activities e como os pacotes de dados transitam entre elas.

### 2. Estruturação da Interface (ConstraintLayout)
**Desafio:** posicionar os campos de texto, botões e imagens de forma que a tela não "quebre" em dispositivos com tamanhos diferentes.
**Solução:** uso de amarrações (constraints) relativas entre os componentes no XML, garantindo que botões e textos respeitem as margens uns dos outros.
**Aprendizado:** o `ConstraintLayout` é uma ferramenta poderosa para criar interfaces complexas e responsivas sem a necessidade de aninhar múltiplos layouts.

### 3. Melhoria da Experiência do Usuário (UX)
**Desafio:** tornar o aplicativo mais amigável e com visual profissional.
**Solução:** adição de recursos visuais como `ImageView` para ilustrar o app e a configuração de uma `Toolbar` superior para dar um acabamento padrão de aplicativo nativo.

## 💻 Como executar

### Pré-requisitos
- Android Studio;
- Emulador ou dispositivo Android físico.

### Passos para rodar
1. Faça o clone deste repositório:
   ```bash
   git clone https://git@github.com:Elieudosilva/FuelCalculator.git
   ```
   ### 👤 Autor e contato profissional

Desenvolvido por **Elieudo Silva** como projeto de portfólio em desenvolvimento Android.

- **LinkedIn:** [linkedin.com/in/dierlissonjustiniano](https://www.linkedin.com/in/elieudo-silva-203838301/)
- **GitHub:** [github.com/dierlisson](https://github.com/Elieudosilva)
