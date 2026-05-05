📚 Biblioteca Spring API
API REST para gerenciamento de livros, desenvolvida com Spring Boot como parte de um projeto de estudos focado em arquitetura MVC, injeção de dependência e desenvolvimento de APIs RESTful.
🚀 Tecnologias

Java 21
Spring Boot 3
Spring Web (REST)
Maven

▶️ Como executar
Pré-requisitos: Java 21+ e Maven instalados.
bash# Clone o repositório
git clone https://github.com/Joaovitor8708/biblioteca-spring-api

# Entre na pasta
cd biblioteca-spring-api

# Execute a aplicação
./mvnw spring-boot:run
A aplicação sobe em http://localhost:8080
📡 Endpoints
MétodoEndpointDescriçãoGET/biblioteca/livrosLista todos os livros ordenados por títuloGET/biblioteca/livros/{id}Busca um livro pelo IDGET/biblioteca/livros/categoria/{categoria}Filtra livros por categoriaPOST/biblioteca/livrosCadastra um novo livro
Exemplo de requisição POST
json{
"id": 4,
"titulo": "O Senhor dos Anéis",
"autor": "J.R.R. Tolkien",
"categoria": "Fantasia"
}
🏗️ Arquitetura
src/main/java/com/github/Joaovitor8708/biblioteca/
├── controller/      # Camada de entrada — recebe as requisições HTTP
├── service/         # Camada de negócio — regras e lógica da aplicação
├── model/           # Entidades do domínio
└── config/          # Configuração de Beans do Spring
🎯 Conceitos praticados

Estrutura MVC com Spring Boot
Injeção de dependência via construtor
Criação de Beans com @Configuration e @Bean
Uso de @Qualifier para distinguir beans do mesmo tipo
Desenvolvimento de endpoints REST com @RestController
Uso de @PathVariable e @RequestBody