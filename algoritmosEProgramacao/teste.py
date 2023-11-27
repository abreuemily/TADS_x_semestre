def parOuImpar(x):
  resto = x%2
  if resto==0:
    return f'é par'
  else:
    return f'é ímpar'
  
print(parOuImpar(2))
print(parOuImpar(5))
print(parOuImpar(99))

#Escreva em sua linguagem favorita uma forma de validar a seguinte demanda: Verificar se a palavra "olá" está contida na frase "olá joão"

def verificaOla(x):
  hi = 'olá'
  lista=x.split()
  if hi in lista:
    return f'a frase contém "olá"'
  else:
    return f'a frase não contém "olá"'
  
print(verificaOla('olá jõao'))