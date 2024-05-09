#classe carta
def carta():
  naipe = ['ouros', 'espadas', 'copas', 'paus']
  valor = ['1', '2', '3', '4', '5', '6', '7', '10', '11', '12']
  def valor(index):
    return valor[index]

  def naipe(index):
    return naipe[index]

  return naipe + ' ' + valor


#classe baralho
def baralho():
  valor = valor()
  naipe = naipe()
  baralho = []
  for i in len(valor):
    for j in len(naipe):
      baralho.append(valor[i] + naipe[j])
    i++





