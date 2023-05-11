package genericsSetMap.set.exercicioResolvido.app;

import genericsSetMap.set.exercicioResolvido.entities.AccessUsers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        String path = "C:\\Nova pasta\\int.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<AccessUsers> users = new LinkedHashSet<>();
            String file = br.readLine();
            while(file != null) {
                String[] dados = file.split(" ");

                users.add(new AccessUsers(dados[0], Date.from(Instant.parse(dados[1]))));
                file = br.readLine();
            }

            System.out.println("Total de usuários: " + users.size());
            System.out.println(users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
