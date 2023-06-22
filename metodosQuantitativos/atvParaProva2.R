#O arquivo pubexp.xlsx possui os dados de de despesas com educação per capita  (ee) e o Produto 
#Interno Bruto per capita (gdp) de vário países. 
library(readxl)
data <- read_excel('pubexp.xlsx')
data
#A respostas e códigos deve ser colados em word e enviados por upload.

#Faça o que se pede:
  
#1 - Estime um modelo de regressão linear pelo método dos mínimos quadrados ordinários (MQO) 
#em que as despesas com educação per capita (ee) é a variável depndente e o Produto Interno Bruto 
#per capita (gdp) é a variável independente.

modelo<-lm(ee~gdp,data=data)
summary(modelo)


#2 - Gere um gráfico adequado para exame de presença de heterocedasticidade.

plot(modelo)

#3 - Realize o teste de heterocedasticidade de Breusch-Pagan (1979).

library(lmtest)
bpHet <- bptest(modelo)
bpHet

#4 - Corrija o erros padrão das estimativas do método de White (1980). Atenção, não é o teste de 
#heterocedasticidade de White, mas a correção dos erros padrão de um modelo em que se identificou a
#presença de heterocedastidade.

library(sandwich)
correcao <- vcovHC(modelo, type = "HC1")

se_corrigido <- coeftest(modelo, vcov = correcao)

correcao
se_corrigido

#5 - Qual seriam os valores das despesas com educação per capita (ee) em países de Produto Interno 
#Bruto per capita (gdp) de 240, 250 e 260 conforme o modelo estimado?


v<-c(240, 250, 260)
vee<-predict(modelo,newdata=data.frame(gdp=v))
vee
