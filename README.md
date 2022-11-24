# Exemplo Prático - Padrões de Projeto com Srping

Nesse projeto pude praticar toda teoria aprendido no curso de Java da Digital One Innovation, pois praticamos CRUD, Spring Data JPA, H2, Swagger e mais.



• ClienteRest Controller => Responsável por designar o bean de compoment que suporta requisições HTTP com base na arquitetura REST;

Anotation: @RestController

Também utilizado o @RequestMapping("clientes") -> Determina qual a URI comum para todos os recursos disponibilizados pelo Controller.

Nela, consta todas as anotations para disponibilização de recursos HTTPs baesados em nossos serviços e regras de negócio



•  ClienteRepository (Interface que extends JPA ou Crud Repository por exemplo)-> Repository é um padrão de projeto similar ao DAO (Data Acess Object) no sentido de que seu objetivo é abstrair o acesso a dados de forma genérica a partir do seu modelo.

Anotation: extends @CRUDReposityory




• ClienteServiceImpl -> Responsável pela classe de Serviço da aplicação

Anotation: @Service

OBS: // Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private ClienteRepository clienteRepository;



• Cliente Service -> Interface que define o padrão <b> Strategy</b> no domínio de cliente. Com isso, se necessário, podemos ter multiplas implementaçõe dessa mesma interface. 
	
