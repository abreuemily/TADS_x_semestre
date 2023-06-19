n <- 25 ; x <- 4
rm(x)
tt <- seq(from = 0, to = 3.4, leng = n)
round(tt, 2)
## usando cbind() e rbind()
x <- cbind(x1 = tt, x2 = tt^2 )
x
# cbind() combina em colunas, rbind(), em linhas
rbind(x1 = tt, x2 = tt^2 )

dim(x) #dimensões
dim(x)[1]
dim(x)[2]

## usando matrix(elementos, nrow -> numero de linhas, ncol -> numero de colunas)
matrix(c(4, 2, 9, 1), nrow = 2, ncol = 2) # o default é por coluna (FALSE)
matrix(data = 5, 2, 2)
A <- matrix(1:12, 3, 4, T) #byrow faz preencher por linha, basta por um T maiusculo 
A

## acessando elementos da matriz
A[2,2]
A[3,]
A[,4]

# matriz identidade
diag(3)
B <- matrix(c(1, 2, 3, 2, 0, 3), 2, 3, T)
diag(2)
I <- diag(nrow(B))
I %*% B
B %*% I
l <- diag(3)
l <- diag(ncol(B))
B %*% l
t(B)
B %*% t(B)
t(B) %*% B

## multiplicação por escalar
a <- 2 #escalar
a * B

## adição e subtração de matrizes

C <- matrix(c(1, 4, -2, 1, 2, 1), 3, 2)
B <- matrix(c(2, 3, -2, 1, 2, 2), 2, 3)
C
B + C

## multiplicação de matrizes (lembre de verificar compatibilidade de matrizes)
C %*% B

# observe que quando um vetor linha precede o coluna, o produto é escalar
u <- c(1, 2, 3) #vetor coluna
u
t(u) %*% u
u %*% t(u)

# matriz de uns
um <- matrix(1, 1, 3)
um
u
um %*% u #somatória
sum(u)

#determinante
A <- matrix(c(4, 2, 9, 1), nrow = 2, byrow = TRUE)
det(A)

#traço de uma matriz quadrada

A  <- matrix(data = seq(from = 1, to = 9, by = 1), nrow=3, byrow=TRUE)
A
diag(A) #diagonal da matriz
sum(diag(A)) #traço da matriz (soma dos elementos da diagonal principal)

library(matrixcalc)
matrix.trace(A)

# inversão de matrizes

X <- matrix(c(1,1,1,3,-2,1,2,1,-1), nrow = 3, ncol = 3, byrow = T)
X
det(X) #se o det é diferente de zero
solve(X) #inversa X^-1 

#X^-1 * X = I (igual a identidade)
round(solve(X)%*%X,1)  #verificação
solve(X)%*% X  #verificação

# aplicações de matrizes
#abaixo as notas de cinco alunos em  math,  port e programação
X <- matrix(c(90,   60, 90,
              90,   90, 30,
              60,   60, 60,
              60,   60, 90,
              30,   30, 30),byrow=TRUE,nrow = 5,ncol = 3)
X
dim(X)[1]
n <- nrow(X) #mesmo que dim(X)[1]
rep(1, times = n)
n
uns <- matrix(rep(1, times = n), ncol = 1)
uns
t(uns) %*% X #somatória colunas
t(uns)%*%X*(1/n)# médias

uns%*%t(uns)%*%X

uns%*%t(uns)%*%X*(1/n) # matriz com colunas de médias


#desvios = X - Xbar ou X - média
D <- X-uns%*%t(uns)%*%X*(1/n) # desvios
D

DD<-t(D)%*%D # desvios ao quadrado
DD
# DD / (n - 1) = Var-Cor
S <- DD*(1/(n-1)) # Var-Cov
S



# REGRESSÃO NO R --- aula do dia 9/3
# regressão com o uso da função lm()
#Lendo os dados
#dados de rendimento (%) de um produto quimico e temperatura de produto
Rend <- c(60, 70, 77, 86, 91)
Temp <- c(40, 45, 50, 55, 60)
plot(Rend ~ Temp)
#Rodando regressão lm(y~x)

#modelo 1

lm(Rend ~ Temp)
mod1 <- lm(Rend ~ Temp) #Regressão
summary(mod1) #resultados
names(mod1) # nomes dos componentes da regressão
mod1$coefficients
mod1$coefficients[2]
mod1$residuals
mod1$fitted.values
plot(mod1$fitted.values~Temp, type='l',col = 'blue')
points(Rend~Temp, col = 'red', pch = 19)


#modelo 2
Rend2 <- c(24, 40, 60, 70, 77, 86, 91, 86, 84)
Temp2 <- c(30, 35, 40, 45, 50, 55, 60, 65, 70)
ls()
plot(Rend2 ~ Temp2)
mod2 <- lm(Rend2~Temp2)
summary(mod2)
mod2$residuals
plot(mod2$residuals~Temp2)
abline(h=0, lty='dashed')
plot(mod1$residuals~Temp)
abline(h=0, lty='dashed')

#modelo 3
# modelo 3: com x^2
#regressão precisa I(Temp^2)

mod3 <- lm(Rend2~Temp2+I(Temp2^2))
summary(mod3)

mod3$residuals
plot(mod3$residuals~Temp2)
abline(h=0, lty='dashed')

plot(Rend2~Temp2)
lines(Temp2, mod3$fitted.values, col='red')
