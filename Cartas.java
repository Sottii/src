public class Cartas 
{
	enum Naipe
	{
		//constantes *Naipe
		Espadas, Paus, Copas, Ouros;
		
		//passa as constantes de *Naipe para o array naipes
		private static final Naipe[] naipes = Naipe.values();
		//quando chamada retorna o valor de naipes na posição *i
		public static Naipe getNaipe(int i)
		{
			return Naipe.naipes[i];
		}
	}
	enum Valor
	{
		//constantes *Valores
		Coringa, Um, Dois, Tres, Quatro, Cinco, Seis, Sete, Oito, Nove, Dez, Onze, Doze, Treze;
		
		//passa as constantes de *Valor para o array valores
		private static final Valor[] valores = Valor.values();
		//quando chamada retorna o valor de valores na posição *i
		public static final Valor getValor(int i)
		{
			return Valor.valores[i];
		}
	}
	//cria atributo privado constante
	private final Naipe naipe;
	//cria atributo privado constante
	private final Valor valor;
	
	//cria construtor da classe *Cartas
	public Cartas(final Naipe naipe, final Valor valor)
	{
		this.naipe = naipe;
		this.valor = valor;
	}
	
	//quando chamada retorna o naipe da carta
	public Naipe getNaipe()
	{
		return this.naipe;
		
	}
	
//quando chamada retorna o valor da carta
	public Valor getValor()
	{
		return this.valor;
	}
	
//quando chamada retorna o naipe e valor da carta escrito
	public String toString()
	{
		return naipe + " " + valor;
	}
}
