package br.com.seteideias.injecaodedependenciainversaodecontrole;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class InjecaoDeDependenciaInversaoDeControleApplication implements CommandLineRunner {

    @Value("${server.port}")
    String porta;

    public static void main(String[] args) {
        SpringApplication.run(InjecaoDeDependenciaInversaoDeControleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("Na porta.: -------------------------------------------------------------------------------------------> "+porta);
//        JOptionPane.showMessageDialog(null, "Aplicacao de pe");
    }
}
