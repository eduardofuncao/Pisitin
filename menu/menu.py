'''
    @Author: Artur, Eduardo Função e Jhoe
    @Date: 25/11/2023
    @Credit: ...
    @Links: ...

Menu de funcionalidades para o portal Pisitin
Funcionalidades implementadas:
A DEFINIR
'''


nome_pac = []
região_pac = []
area_pac = []

nome_psi = []
região_psi = []
area_psi = []

qntd_pac = 0
qntd_psi = 0

stop = False
while not stop:
    print('''
    Menu de funcionalidades:
    1. Opção 1 - Cadastro Psicólogo
    2. Opção 2 - Cadastro Paciente
    3. Opção 3 - Informações da conta
    4. Opção 4 - Contas que combinam com você!
    5. Sair
''')
    sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    while not (1 <= sel <= 4):
        print('Erro! Digite um número que esteja na lista de opções.')
        sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))

    if sel == 1:
        print("----Cadastro Psicólogo----")
        nome_psi.append(input("Digite o seu nome: "))
        senha_psi = input("Digite uma senha: ")
        região_psi.append(input("Digite a sua região: "))
        CFP_psi = int(input("Digite o seu CFP, Cadastro Nacional de Psicólogas(os):"))
        area_psi.append(int(input("Escolha a sua área de atuação:\n 1-Psicanálise\n 2-Psicologia Analítica\n 3-Cognitivo-Comportamental:")))
        qntd_psi += 1
        print("Sucesso ao se cadastrar!")

    elif sel == 2:
        print("----Cadastro Paciente----")
        nome_pac.append(input("Digite o seu nome: "))
        senha_pac = input("Digite uma senha: ")
        região_pac.append(input("Digite a sua região: "))
        area_pac.append(int(input("Escolha a sua área de atuação:\n 1-Psicanálise\n 2-Psicologia Analítica\n 3-Cognitivo-Comportamental:")))
        qntd_pac += 1
        print("Sucesso ao se cadastrar!")

    elif sel == 3:
        print("Informações da conta")
        for i in range(qntd_pac):
            print(f"Nome paciente: {nome_pac[i]} | Região paciente: {região_pac[i]} | Área escolhida paciente: {area_pac[i]}")
        for i in range(qntd_psi):
            print(f"Nome psicólogo: {nome_psi[i]} | Região psicólogo: {região_psi[i]} | Área escolhida psicólogo: {area_psi[i]}")

    elif sel == 4:
        print("Contas que combinam com você!")
        for i in range(qntd_pac):
            for j in range(qntd_psi):
                if (região_pac[i] == região_psi[j]) and (area_pac[i] == area_psi[j]):
                    print(f"Nome paciente: {nome_pac[i]} | Região paciente: {região_pac[i]} | Área escolhida paciente: {area_pac[i]}")
                    print(f"Nome psicólogo: {nome_psi[j]} | Região psicólogo: {região_psi[j]} | Área escolhida psicólogo: {area_psi[j]}")

    elif sel == 5:
        print("saiu do programa")




