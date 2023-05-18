install.packages('ggplot2')
install.packages('dplyr')
library(ggplot2)
x11()
mpg
View(mpg)
?mpg
ggplot(mpg,aes(x=displ,y=cty))+geom_point()
library(dplyr)
names(mpg)
carro <- rename(mpg,c("Marca"="manufacturer",
                      "cilindrada"="displ"
                      ,"consumo"="cty",
                      "tração"="drv"
                      ,"tipo"="class"))
names(carro)
carro
ggplot(carro,aes(cilindrada,consumo))+geom_point()                
ggplot(carro,aes(cilindrada,consumo,size=tração,color=tipo))+geom_point()+
  theme_gray() + annotate("text", x=4,y=30,label="Emilinda<3",size=15,color="red")
carro$consumo
table(carro$consumo)
round(prop.table(table(carro$consumo))*100,1)
hist(carro$consumo)
ggplot(carro,aes(consumo))+geom_histogram()
##### manipulando dados com dplyr
mean(carro$consumo)
carro$consumo %>% mean()
carro %>% filter(consumo==9)
m<-carro %>% select(Marca,consumo) %>% filter(consumo<=11)
View(m)
m %>% group_by(Marca)
m %>%group_by(Marca) %>% summarise(n(),media=mean(consumo),dp=sd(consumo))
