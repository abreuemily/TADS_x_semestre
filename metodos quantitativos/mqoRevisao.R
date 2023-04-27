#####~~~~~    REVISÃO     ~~~~~#####
# Aula do dia 06/04/2023
# Apresenta Variância do beta
# Dados em consRenda.txt

# Importa dados do diretório de trabalho
consRenda <- read.csv("~/quant/consRenda.txt", sep="")

# Inspeção dos dados
str(consRenda)
head(consRenda)

# Criar matrizes e vetores
y <- as.matrix(consRenda$cons)
y
X <- as.matrix(consRenda$renda)
X

uns <- rep(1, dim(X)[1]) # vetor de uns
X <- cbind2(uns,X)

# Estimar Beta
# b=((X'X)^-1) X'y
b <- solve(t(X)%*%X)%*%t(X)%*%y
b

# Valores projetados (ajustados)
# yhat = Xb
yhat <- X%*%b
yhat

# Resíduos
# e = y-yhat
e <- y-yhat
e

# Variância
# 1/(N-p)*e'e, onde p=k+1
N <- dim(X)[1]
N
p <- dim(X)[2]
p
t(e)%*%e # quadrado dos resíduos
s2 <- (1/(N-p))*as.numeric(t(e)%*%e)

# Nota: o valor foi tranfpormado em escalar
#       para facilitar as operações

# Variância do beta
# s2((X'X)^-1)ii

varCov <- s2*(solve(t(X)%*%X))
varCov
varb <- diag(varCov)
varb

# Erro Padrão de beta
# ep(bi) = raiz(varb)
epb <- sqrt(varb)
epb


























