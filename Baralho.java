public class Baralho
{
	//importa *cartas de *Cartas
	private Cartas[] cartas;
	//cria a variavel cartasNoBaralho 
	private int cartasNoBaralho;
	
	//cartas de Cartas recebe 108
	public Baralho()
	{
		cartas = new Cartas[108];
	}
	//cria o baralho
	public void resetar()
	{
		Cartas.Naipe[] naipes = Cartas.Naipe.values();
		cartasNoBaralho = 0;
		
		for (int i = 0; i < naipes.length-1; i++)
		{
			Cartas.Naipe naipe = naipes[i];	
			
			cartas[cartasNoBaralho++] = new Cartas(naipe, Cartas.Valor.getValor(0));
			for (int j = 0; j < naipes.length; j++)
			{
				cartas[cartasNoBaralho++] = new Cartas(valor, Cartas.Valor.getValor(j));
			}
		}
	}
}
