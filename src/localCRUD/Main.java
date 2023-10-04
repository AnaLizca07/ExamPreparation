package localCRUD;

import localCRUD.dto.ToyDTO;
import localCRUD.interfacee.ILocal;
import localCRUD.services.ToyImplements;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc;
        ILocal repo = new ToyImplements();

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu:\n1.Add toy \n2.Search toy \n3.Upgrade toy \n4.See all toys \n5.Delete toy \n6.Exit");
            opc = s.next();
            switch (opc) {
                case "1" -> {
                    System.out.println("ADD TOY");
                    System.out.println("Enter the toy id");
                    Integer id = s.nextInt();
                    System.out.println("Enter the toy name");
                    String name = s.next();
                    System.out.println("Enter the toy category");
                    String category = s.next();
                    System.out.println("Enter the price of the toy");
                    Integer price = s.nextInt();
                    repo.save(new ToyDTO(id, name, category, price, +1));
                }
                case "2" -> {
                    System.out.println("SEARCH TOY");
                    System.out.println("Enter the toy id");
                    Integer id = s.nextInt();
                    boolean search = repo.finfById(id) == null;
                    if (!search) {
                        System.out.println(repo.finfById(id));
                    } else {
                        System.out.println("Toy not found");
                    }
                }
                case "3" -> {
                    System.out.println("UPGRADE TOY");
                    System.out.println("Enter de toy id to upgrade");
                    Integer id = s.nextInt();
                    System.out.println("Enter the new toy name");
                    String name = s.next();
                    System.out.println("Enter the new category");
                    String category = s.next();
                    System.out.println("Enter the new price");
                    Integer price = s.nextInt();
                    repo.update(new ToyDTO(id, name, category, price, +0));
                    System.out.println("Your toy was successfully updated: ");
                }
                case "4" -> {
                    System.out.println("SEE ALL TOYS");
                    List<ToyDTO> toys = repo.findAll();
                    if (!toys.isEmpty()) {
                        toys.forEach(System.out::println);
                    } else {
                        System.out.println("There is not toys");
                    }
                }
                case "5" -> {
                    System.out.println("DELETE TOY");
                    System.out.println("Enter de toy id to delete");
                    Integer id = s.nextInt();
                    boolean search = repo.finfById(id) == null;
                    if (!search) {
                        System.out.println("The next toy will be removed: " + repo.finfById(id));
                        repo.delete(repo.finfById(id));
                        System.out.println("Toy successfully removed");
                    } else {
                        System.out.println("Tou not found");
                    }
                }
                case "6" -> {
                    opc = "6";
                }
            }
        }while (!opc.equals("6"));
    }
}
