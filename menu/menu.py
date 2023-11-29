'''
    @Author: Artur, Eduardo Função e Jhoe
    @Date: 25/11/2023
    @Credit: ...
    @Links: ...

Menu de funcionalidades para o portal Pisitin
Funcionalidades implementadas:
A DEFINIR
'''
nome = []
região = []
area = []

stop = False
while not stop:
    print('''
    Menu de funcionalidades:
    1. Opção 1 - Cadastro Psicologo
    2. 1. Opção 2 - Cadastro Paciente
    3. 1. Opção 3 - informações da conta
    4. 1. Opção 4 - Contas que combinam com você!
    5. Sair
''')
    # seleção do usuário
    sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    while((sel<=0) or (sel>=5)):
        print('Erro! digite um numero que esteja na lista de opções.')
        sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    


    if sel == 1:
        print("----Cadastro Psicólogo----")
        nome = input("Digite o seu nome: ")
        senha = input("Digite uma senha: ")
        região = input("Digite a sua região: ")
        CFP = int(input("Digite o seu CFP, Cadastro Nacional de Psicólogas(os):"))
        area = int(input("Escolha a sua área de atuação:\n 1-Psicanálise\n 2-Psicologia Analítica\n 3-Cognitivo-Comportamental:"))


        print("Sucesso ao se cadastrar!")

        input()


    elif sel == 2:
        print("----Cadastro Paciente----")
        nome = input("Digite o seu nome: ")
        senha = input("Digite uma senha: ")
        região = input("Digite a sua região: ")
        area = int(input("Escolha a sua área de atuação:\n 1-Psicanálise\n 2-Psicologia Analítica\n 3-Cognitivo-Comportamental:"))

        print("Sucesso")

    
    elif sel == 3:
        print("Informações da conta")
        print(f"Nome: {nome} | região: {região} | área escolhida: {area}")


    elif sel == 4:
        print("opção 4")

    elif sel == 5:
        print("Saindo do programa...")
        stop = True

print("Fim do programa!")