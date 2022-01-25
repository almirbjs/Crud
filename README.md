**Requisitos funcionais:** 

- Desenvolver microserviço para     gerenciamento e autenticação de usuarios: 
- Deve permitir as operações de     CRUD (create, retrieve, update, delete) para dados de um usuário de     sistema (id, nome, email, senha, endereço, telefone, perfil) 
- Os perfis de usuário aceitos     são: ADMIN e USER 
- Deve permitir operação de     pesquisa de usuários, com filtros, paginação e ordenação dos dados. 
- Deve permitir autenticação de     usuários 
- Os recursos devem estar     protegidos para que apenas usuários autenticados tenham acesso. 
- Os recursos de criação, edição e     remoção de usuários devem estar protegidos para que apenas usuários com     perfil de ADMIN tenham acesso.
 

**Requisitos não funcionais:** 

- O código fonte deve ser     publicado no Github. 
- O microserviço deve ser     desenvolvido utilizando Spring Boot e banco de dados MongoDB. 
- Todos os recuros do microserviço     deverão estar cobertos por testes unitários. 
- O microserviço deve ser     empacotado em uma imagem docker no processo de build. 
- Criar arquivo YAML com a     definição do deployment do microserviço em Kubernetes. Assim poderemos     fazer o build da imagem docker e realizar o deploy no nosso cluster     Kubernetes. 
- O processo de build e run deve     estar documentado para que possamos subir sua aplicação rapidamente e sem     erros. 
