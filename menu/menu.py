'''
    @Author: Artur, Eduardo Função e Jhoe
    @Date: 25/11/2023
    @Credit: ...
    @Links: ...

Menu de funcionalidades para o portal Pisitin
Funcionalidades implementadas:
A DEFINIR
'''

stop = False
while not stop:
    print('''
    Menu de funcionalidades:
    1. Opção 1
    2. 1. Opção 2
    3. 1. Opção 3
    4. 1. Opção 4
    5. Sair
''')
    # seleção do usuário
    sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    if sel == 1:
        print("opção 1")

    elif sel == 2:
        print("opção 2")
    
    elif sel == 3:
        print("opção 3")

    elif sel == 4:
        print("opção 4")

    elif sel == 5:
        print("Saindo do programa...")
        stop = True

print("Fim do programa!")