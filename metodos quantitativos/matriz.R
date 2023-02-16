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
