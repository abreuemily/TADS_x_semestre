@echo off
cls
echo Ola, seja bem vindo ao meu trabalho de Sistemas Operacionais :)
echo.
echo Por favor, digite o numero do que voce deseja que aconteca:
echo [1] Ativar o usuario Administrador
echo [2] Desativar o usuario Administrador
echo [3] Abrir a Calculadora
echo [4] Sair

set /p opc=Digite a opcao desejada: 

if "%opc%" == "1" goto op1
if "%opc%" == "2" goto op2
if "%opc%" == "3" goto op3
if "%opc%" == "4" goto op4

:op1
net user administrador /active:yes > nul
goto fim

:op2
net user administrador /active:no > nul
goto fim

op3
calc
goto fim

op4
echo.
echo Precione Enter para sair :( Volte logo.
pause > nul

:fim
echo.
echo Tudo certo!
echo Pressione enter para sair :)
pause > nul