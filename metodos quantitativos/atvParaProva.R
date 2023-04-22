

load("resEnergy.Rdata")
# 1. inspeção dos dados
str(resEnergy)
head(resEnergy)
# Elabore um grafico pontos com os valores de temp no eixo horizontal 
# e electricity no eixo vertical
library(ggplot2)
ggplot(resEnergy,aes(x = temp , y=electricity)) + geom_point()
 # Criar matrizes e vetores
y <- as.matrix(resEnergy$electricity)
y
X <- as.matrix(resEnergy$temp)
X
vetor <- rep(1, dim(X)[1])
vetor
X <- cbind2(vetor,X)
X
# Estimar Beta
beta <- solve(t(X)%*%X)%*%t(X)%*%y
beta
# Valores projetados (ajustados)
adj <- X %*% beta
adj

# Resíduos
res <- y - adj
res

# Variância
var1 <- dim(X)[1]
var1
var2 <- dim(X)[2]
var2

#Variância do beta
res2 <- (1/(var1-var2))*as.numeric(t(res)%*%res)
res2
vRes <- res2*(solve(t(X)%*%X))
vRes
vbt <- diag(vRes)
vbt
