##### heterocedasticidade: identificação e correção
options(digits=6,show.signif.stars=FALSE)

# despesas com pesquisa e desenvolvimento
# podem ser explicadas pelo volume de vendas (vendas) das empresas?

### ajustar modelo
mod <- lm(pd~vendas,data=inovacao)

### output do modelo
summary(mod)

###identificação grafica
plot(mod$residuals~mod$fitted.values) #heterocedasticidade
plot(mod,which=3) #heterocedasticidade (se fosse homo, a linha vermelha seria mais reta/horizontal)
plot(mod)

### teste de breusch-pagan (1979), do pacote lmtest
install.packages("lmtest")
library(lmtest)
bpHet<- bptest(mod)
bpHet

### teste de white (1980), usando bptest do pacote lmtest
bptest(mod,~vendas+I(vendas^2), data=inovacao)

###erros robustos de white
#possibilidades type=c('HC0', 'HC1','HC2','HC3','HC4'))
install.packages("sandwich")
library(sandwich)
coeftest(mod,vcov=vcovHC(mod,type="HC1"))

summary(mod)

