package jcrud;

/*
 * Importa todas as classes do Conector MySQL.
 * Download: https://dev.mysql.com/downloads/connector/j/
 * Na listagem, selecione "Platform Independent", baixe a vers�o ".ZIP" e 
 * descompacte-a. Copie o arquivo "mysql-connector-XXXX.jar" para uma pasta 
 * "recources" dentro da pasta do projeto.
 * Clique direito em "Bibliotecas" ? Adicionar JAR/Pasta...
 * Localize o arquivo do conector.
 */
import java.sql.*;

public class Jcrud {

    /*
     * M�todo para conex�o com o banco de dados.
     * Em breve, teremos uma classe somente para esse m�todo e outros 
     * relacionados ao MySQL.
     */
    public static Connection mysqlConnect(
            String hostname, // URL do servidor MySQL
            String database, // Nome do banco de dados
            String username, // Usu�rio desse banco de dados
            String password // Senha do usu�rio do banco de dados
    ) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Conecta a classe de banco de dados
            return DriverManager.getConnection( // Fazer a conex�o com o banco de dados
                    "jdbc:mysql://" + hostname + ":3306/" + database, // String de conex�o com o banco de dados
                    username, // Usu�rio desse banco de dados
                    password // Senha do usu�rio do banco de dados
            );
        } catch (Exception error) { // Tratamento de erros.
            System.out.println("Oooops! Erro no banco de dados! " + error);
            return null;
        }
    }

    // M�todo que executa o aplicativo
    public static void main(String[] args) {
        System.out.println("Ol� Mundo!");
    }

}
