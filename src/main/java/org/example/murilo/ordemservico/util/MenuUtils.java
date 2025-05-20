package org.example.murilo.ordemservico.util;

public final class MenuUtils {

    public static void printClientStartMenuOptions() {
        System.out.println("""
                O que deseja fazer?\n
                \t1 - Login\n
                \t2 - Cadastrar-se\n
                \t3 - Sair
                """);
    }

    public static void printClientMainMenuOptions() {
        System.out.println("""
                O que deseja fazer?\n
                \t1 - Consultar informações da Conta\n
                \t2 - Editar Conta\n
                \t3 - Excluir Conta\n
                \t4 - Logout
                """);
    }
}
