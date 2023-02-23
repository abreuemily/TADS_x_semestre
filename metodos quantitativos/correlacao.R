library(readxl) #carrega pacote
food <- read_excel("food.xlsx") #importa
View(food) #exibe dados
food

#converter em data frame

food.df <- as.data.frame(food)
food.df

#expecionar dados
head(food.df)
tail(food.df)


str(food.df)
str(food)

#plot
plot(food.df$income,food.df$food_exp)
plot(food.df$income,food.df$food_exp,
     xlab = "Renda",
     ylab = "Despesas com alimentos",
     pch = 19,
     col = "red")

#correlação linear de pearson
cor(food.df$income,food.df$food_exp)

#NOTA: 0.6204855 moderada e positiva

# 1a regressão

mod <- lm(food_exp ~ income, data = food.df)
summary(mod)
