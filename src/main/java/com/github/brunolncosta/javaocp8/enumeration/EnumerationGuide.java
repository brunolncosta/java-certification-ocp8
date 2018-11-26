package com.github.brunolncosta.javaocp8.enumeration;

public class EnumerationGuide {

	public static void main(String...args) {
		
		System.out.println("NOTE 01");
		//ToString de um enum é sempre o metodo .name()
		//Name é um METODO e nao uma propriedade apesar de nao seguir o padrao get.
		PrimeiroEnum primeiroEnum = PrimeiroEnum.UM;
		System.out.println(primeiroEnum + " ToString de um enum é sempre o metodo .name()? " + (primeiroEnum.name().equals(primeiroEnum.toString())));
		
		System.out.println();
		System.out.println("NOTE 02");
		//O métodos values() de um enum retornar um ARRAY [] (Array e nao um ArrayList) contendo todos os elemento do enum.
		//Assim como name() o metodo values() nao seguie o padrao get. NAO CONFUNDA COM PROPRIEDADE.
		//Portanto é possivel iterar um Enum da maneira abaixo:
		for (PrimeiroEnum e : PrimeiroEnum.values()) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("NOTE 03");
		//Nao é possivel instanciar novos values de enum
		//Pois o proposito do enum nao é isso
		//Como já foi falar é como o enum fosse uma classe com todos os private!
		//TerceiroEnum terceiroEnum = new TerceiroEnum(10); COMPILE ERROR: error: enum types may not be instantiated.
		
		System.out.println();
		System.out.println("NOTE 04");
		//Note que é possivel alterar visto o valor de uma propriedade de um enum normalmente
		//através de um metodo set ou do acesso direto (caso disponivel).
		for (TerceiroEnum e : TerceiroEnum.values()) {
			if(e.getAge() <= 0) {			
				e.setAge(10);
			}
			System.out.println(e + " " + e.getAge());
		}

		System.out.println();
		System.out.println("NOTE 05");
		//Note que neste momentos foi impresso todos os names do enum contidos no QuartoEnum.
		//Isto acontece por que a JVM instancia todos os elementos de um determinado enum
		//através do seu construtor, quando o enum é chamado pela primeira vez em tempo de execuçao (runtime).
		//Um ponto importante é que a JVM so instancia os elementos de um enum apenas UMA VEZ durante toda a vida do programa.
		//Sendo assim é correto comparar igualdade entre variaveis de um mesmo enum com o operador "==".
		QuartoEnum[] quartoEnum = QuartoEnum.values();
		
		System.out.println();
		System.out.println("NOTE 06");
		//Exemplo de como utilizar metodos abstratos em enums (Vide enum QuintoEnum).
		for(QuintoEnum e : QuintoEnum.values()) {
			System.out.println("ESPECIE: " + e + " NOME: " + e.getNome() + " - " + e.comunicar());
		}

		System.out.println();
		System.out.println("NOTE 07");
		//Reescrevendo o exemplo acima com java 8 (Vide enum SextoEnum).
		for(SextoEnum e : SextoEnum.values()) {
			System.out.println("ESPECIE: " + e + " NOME: " + e.getNome() + " - " + e.comunicar());
		}

		System.out.println();
		System.out.println("NOTE 08");
		//Reescrevendo o exemplo acima com switch.
		for(SetimoEnum e : SetimoEnum.values()) {
			System.out.println("ESPECIE: " + e + " NOME: " + e.getNome() + " - " + e.comunicar());
		}
	}

}

//Enums seguem as mesmas regras de uma classe normal, inclusive se forem public devem está declarados como o mesmo nome do arquivo java onde foram escritos.
//O primeiro statement deve se obrigatoriamente a declaracao de elementos do enum. Caso não seja ocorre erro de compilacao.
//Note que nao foi preciso utilizar ";" para finalizar a linha de declaracao dos enums.
//Ponto e virgula é opcional para declarar os elementos de um enum, se e somente se, nao existe nenhuma comando após a declaracao.
//Ou seja só é possivel omitir o ponto e virgula caso o enum só tenha declaracao de elementos simples.
enum PrimeiroEnum {
	//Se descomentada a linha abaixo causará erro de compilacao.
	//public statics int teste = 10;
	
	UM, DOIS, TRES, QUATRO, CINCO
}

//Um enum é como se fosse uma classe normal, com varios tipo de instancias estaticas e finais prontas para serem utilizadas.
//Um enum seria como uma classe final, já que nao pode ter subclasses.
//Bem como seu construtor deve ser sempre private, pois as unicas instancias que pode haver de um determinado
//sao as disponibilizadas pelo proprio enum como propriedades estaticas.
//Sendo apenas uma classe um Enum pode ter metodos e pripriedades.
enum SegundoEnum {
	//Note que fui obrigado a utilizar o ";" no final da declaracao de elementos do enum neste caso.
	BRUNO, PEDRO, GUILHERME, ANTONIO, VINICIUS;
	
	private int age;

	//É possivel ter metodos e propriedades estaticas normalmente.
	private static int contadorDeChamadas;

	public static int getContagem() {
		return contadorDeChamadas;	
	}

}

//Para que cada personagem do nosso enum abaixo tenha um idade propria
//bastar informar atraves de um construtor customizado.
//Note que quando definimos ums construtor, o construtor default deixa de existir
//portanto somos obrigados chamar o construtor customizado no ato da declaracao dos elementos dos enum
//Recriar o construtor default como vemos abaixo:
enum TerceiroEnum {
	//Note que todos chamar o construtor que recebe um idade, menos Guilherme, o qual é criado atraves o construtor que nao recebe parametros.	
	BRUNO(13), 
	PEDRO(14), 
	GUILHERME, 
	ANTONIO(16), 
	VINICIUS(17);
	
	//É como se a declacao de elementos feita acima, fosse convertida pelo JAVA através do como abaixo:
	//Lembre-se que isso é apenas uma analogia, pois NAO É POSSIVEL CHAMAR UM NEW de um enum.
	//Chamar um new de um enum resultaria no seguinte erro compilacao:  enum types may not be instantiated.
	/*
	public statics final TerceiroEnum BRUNO = new TerceiroEnum(13);
	public statics final TerceiroEnum PEDRO = new TerceiroEnum(14);
	public statics final TerceiroEnum GUILHERME = new TerceiroEnum();
	public statics final TerceiroEnum ANTONIO = new TerceiroEnum(16);
	public statics final TerceiroEnum ANTONIO = new TerceiroEnum(17);*/
	
	//Como já foi mencionado é como se todos os construtores de um enum fosse private
	//Logo mesmo nao informando modificador de acesso (package private) seria como se o java adiciona-se o modificador private.
	TerceiroEnum(int age) {
		this.age = age;
	}	
	
	//Um enum pode ter mais de um enum desde que nao seja public ou protected
	TerceiroEnum() {	
	}
	
	//Nao é possivel criar construtores em enum com os modificadores de acesso public ou protected
	//O construtor abaixo nao compila
	//public TerceiroEnum() {} COMPILE ERROR: modifier public not allowed here.
	
	private int age;

	public int getAge() {
		return this.age;	
	}

	public void setAge(int age) {
		this.age = age;
	}

	private static int contadorDeChamadas;

	public static int getContagem() {
		return contadorDeChamadas;	
	}

}

//Enum utilizado para demostratar como e quando a JVM instancia um determinado enum.
//Vide NOTE 05 do metodo main.
enum QuartoEnum {
	GATO, CACHORRO, CAVALO, COELHO, PASSARO;

	QuartoEnum() {	
		System.out.println(this);
	}
}

//Enum podem ter metodos abstratos, o ternaria a suposta classe do enum "abstrata".
//Sendo assim, ao definir os elementos do enum é preciso implementar seu métodos abstratos através de classe anonimas.
//Note que nao também possivel sobrescrever metodos concretos do enum e dessa forma customizar determinado metedo de determinado elemento do enum
//provendo uma implementacao default para os demais elementos.
//IMPORTANTE,veja que é possivel utilizar classe anomina mesmo se a super classe tiver um construtor com parametros, a subclasse chama o construtor de forma transparente
//sem necessidade de implementacao adicional.
enum QuintoEnum {
	GATO("HARRY")       { public String comunicar()  { return "MIAUUU!"; }            }, 
	CACHORRO("TED")     { public String comunicar()  { return "UAU-UAU!"; }           }, 
	CAVALO("SCADUFAX")  { public String comunicar()  { return "IRRLL IRLL!"; }	  }, 
	GADO("TIAO")        { public String comunicar()  { return "MUUUU MUUUU!"; }       }, 
	PASSARO("DEATH")    { public String comunicar()  { return "PIO!"; }               };
	
	//É como se os elementos acima fossem declarados como abaixo:
	/*
	public statics final QuintoEnum GATO = new QuintoEnum("HARRY")        { public String comunicar() { return "MIAUUU!"; }      };
	public statics final QuintoEnum CACHORRO = new QuintoEnum("TED")      { public String comunicar() { return "UAU-UAU!"; }     };
	public statics final QuintoEnum CAVALO = new QuintoEnum("SCADUFAX")   { public String comunicar() { return "IRRLL IRLL!"; }  };
	public statics final QuintoEnum GADO = new QuintoEnum("TIAO")         { public String comunicar() { return "MUUUU MUUUU!"; } };
	public statics final QuintoEnum PASSARO = new QuintoEnum("DEATH")     { public String comunicar() { return "MUUUU MUUUU!"; } };
	*/

	public abstract String comunicar();

	private String nome;

	QuintoEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;	
	}

	public void setNome(String nome) {
		this.nome = nome;	
	}
}

//Fazendo o exemplo acima como java 8.
//Poderiamos implementar esse enum sem necessidade metodo abstrato ou lambdas facilmente apenas adicionando uma nova propriedade,
//Porém foi feito assim para que se entenda o que pode ser capaz de ser feito com um enum.
//Lambda abri porta para diversas novas maneiras de se programar.
//Existirão situações onde esse tipo de abordagem será bastante util.
@FunctionalInterface
interface Comunicador<T> {

	public T comunicar();
}

enum SextoEnum {
	GATO("HARRY",      () -> "MIAUUU!"),
	CACHORRO("TED",    () -> "UAU-UAU!"), 
	CAVALO("SCADUFAX", () -> "IRRLL IRLL!"), 
	GADO("TIAO",       () -> "MUUUU MUUUU!"), 
	PASSARO("DEATH",   () -> "PIO!");
	
	private Comunicador<String> comunicador;	

	private String nome;

	SextoEnum(String nome, Comunicador<String> comunicador) {
		this.nome = nome;
		this.comunicador = comunicador;
	}

	public String getNome() {
		return this.nome;	
	}

	public void setNome(String nome) {
		this.nome = nome;	
	}

	public String comunicar() {
		return this.comunicador.comunicar();	
	}
}

//É possivel reescrever o exemplo acima com switch,
//ja que o switch do java nativamente suporta o tipo Enum.
enum SetimoEnum {
	GATO("HARRY"),
	CACHORRO("TED"), 
	CAVALO("SCADUFAX"), 
	GADO("TIAO"), 
	PASSARO("DEATH");
	

	private String nome;

	SetimoEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;	
	}

	public void setNome(String nome) {
		this.nome = nome;	
	}

	public String comunicar() {
		switch(this) {
			//o case abaixo não compila, por que ao criar um switcher do enum SetimoEnum, o java já sabe quais sao a opcões possiveis, pois todas elas já
			//foram definidas na declacao do proprio enum.
			//Toda via a JVM não compila se você tentar utilizar tal obordagem. Utilize o NOME DO ELEMENTO do enum apenas caso esteja passando como case de um switch. 
			//case SetimoEnum.GATO     : return "MIAUUU!";

			//O case abaixo nao compila, pois obviamente um enum do tipo SetimoEnum nao tem a propriedade de INSTANCIA GATO.
			//case this.GATO     : return "MIAUUU!";

			case GATO     : return "MIAUUU!";
			case CACHORRO : return "UAU-UAU!";
			case CAVALO   : return "IRRLL IRLL!";
			case GADO     : return "MUUUU MUUUU!";
			case PASSARO  : return "PIO!";
			default : return "";
		}	
	}
}



