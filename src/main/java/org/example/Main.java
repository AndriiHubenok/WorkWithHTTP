package org.example;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        int id = 1;
        String name = "Moriah.Stanton";

        UsersOperation operation = new UsersOperation();

        File users = new File("users.json");

        System.out.println(operation.post(users));
        System.out.println(operation.put(users));
        operation.delete(id);
        System.out.println(operation.get());
        System.out.println(operation.getUser(id));
        System.out.println(operation.getUserForUsername(name));
        operation.getComments(id);
        System.out.println(operation.getNotToDos(id));


    }
}