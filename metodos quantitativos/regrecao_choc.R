colnames(FabricaChocolates)[5] <- 'ferias'      # mudou o nome da coluna 5
colnames(FabricaChocolates)[8] <- 'inferias'    # mudou o nome da coluna 8
save(FabricaChocolates, file='FabricaChocolates.Rdata')  #salvou o arquivo modificado
rm(FabricaChocolates)  #removeu o arquivo antigo
load('FabricaChocolates.Rdata')  
str(FabricaChocolates)
mod <- lm(ci~emb+ ton, data=FabricaChocolates) 
mod
summary(mod)
#se f stattistic, pvalue for significativo, p vai ser menor que 0,05 (modelo tem boa qualidade)
#adjusted r squared --> quantos por cento são explicados pelo modelo
# ver valores b (beta) dos x's --> emb = se almentai 1 embalagem a mais, 57.44 reais são adicionados ao ci
# ton = se aumentar 1 tonelada, aumenta 986 reais a ci (custo industrial)
#o modelo tem boa qualidade no geral
mod$residuals
plot(mod$fitted.values)
plot(mod$fitted.values, mod$residuals)
abline(h=0, lty='dashed')
