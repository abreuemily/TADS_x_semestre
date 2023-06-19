#####~~~~~    ANÁLISE DE DADOS BÁSICA    ~~~~~#####
# Aula do dia 18/05/2023
# Gráficos, manipução de dados, modelagem e projeção
# Dados em mpg (db do ggplot2)

### Pacotes necessários
#install.packages("ggplot2")
#install.packages("dplyr")
install.packages("ggthemes")
library(ggplot2) # pacote de graficos

x11() # janela gráfica

### Base de dados
mpg
View(mpg)
?mpg

### Gerando gráficos
# Graf cilindrada x consumo
ggplot(mpg,aes(x=displ,y=cty)) +
  geom_point()

### Tratamento dos dados
library(dplyr)
library(ggthemes)
# Salvar um novo dataset como nomes novos
names(mpg)
carros <- rename(mpg, c("Marca" = "manufacturer",
                        "Cilindrada" = "displ",
                        "Consumo" = "cty",
                        "Tração" = "drv",
                        "Tipo" = "class"))

carros
names(carros)
names(mpg)

### Graficos
# Cilindrada x Consumo
ggplot(carros, aes(Cilindrada, Consumo))  +
  geom_point()

# Cilindrada x consumo x tracao x tipo
ggplot(carros, aes(Cilindrada, Consumo,
                   size = Tração,color = Tipo))  +
  geom_point()

ggplot(carros, aes(Cilindrada, Consumo,
                   size = Tração,color = Tipo))  +
  geom_point()+
  theme_economist() +
  annotate("text", x = 4, y = 30, label = "use r!",
           size = 20, color = "blue")+
  labs(x="cilindrada",y="km/gl")+
  theme(axis.title.x = element_text(size=15,color="red"),
        axis.title.y = element_text(size=15, color="green"))

##### Análise de dados
carros$Consumo
table(carros$Consumo)
prop.table(table(carros$Consumo))
round(prop.table(table(carros$Consumo))*100,1)

### Histograma
hist(carros$Consumo)
hist(carros$Consumo,col="red",border=T,xlab="km/gl",main="")

ggplot(carros, aes(Consumo)) +
  geom_histogram()

ggplot(carros, aes(Consumo)) +
  geom_histogram(binwidth = .8,fill="red")+
  labs(y="frequencia")+
  theme_clean()
##### Manipulando dados com dplyr

### Selecionar e filtrar
carros %>% 
  filter(Consumo==9)

View(carros %>% 
       filter(Consumo==9))

m <- carros %>% 
  select(Marca,Consumo) %>% 
  filter(Consumo <= 11)

View(m)

### Agrupar e descrever
m %>% 
  group_by(Marca) %>% 
  tally()

m %>% 
  group_by(Marca) %>% 
  summarise(n=n(),
            Media = mean(Consumo),
            DP = sd(Consumo),Min=min(Consumo),
            emili=max(Consumo))

#reorganizar pela media crescente
m %>% 
  group_by(Marca) %>% 
  summarise(n=n(),
            Media = mean(Consumo),
            DP = sd(Consumo),Min=min(Consumo),
            emili=max(Consumo)) %>% arrange(Media)

#reorganizar pela media decrescente
m %>% 
  group_by(Marca) %>% 
  summarise(n=n(),
            Media = mean(Consumo),
            DP = sd(Consumo),Min=min(Consumo),
            emili=max(Consumo)) %>% arrange(desc(Media))

##### modelando: regressão
#configurar output (opcional)
options(digits=6,show.signif.stars = FALSE)
ggplot(carros,aes(Cilindrada,Consumo))+geom_point(aes(size=Tração,color=Tipo))+
  geom_smooth(method = "lm")

#novos dados
peso<-c(45,50,60,55,58,56,48,53)
altura<-c(1.54,1.56,1.65,1.6,1.65,1.63,1.58,1.59)
plot(altura,peso)
mod<-lm(peso~altura)
summary(mod)
#acrescentar a reta
abline(mod$coefficients[1],mod$coefficients[2])
abline(mod,col="red",lwd=2)
#gráfico com ggplot
ggplot(mapping=aes(altura,peso))+geom_point()+geom_smooth(method="lm")
