
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("File to read:");
        String file = scanner1.nextLine();
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - "
                + "searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n");
        while (true) {
            System.out.println("Enter command: ");
            String value = scanner1.nextLine();
            if (value.equals("stop")) {
                break;
            } else if (value.equals("list")) {
                System.out.println("Recipes:");
                int i = 0;
                try ( Scanner scanner = new Scanner(Paths.get(file))) {

                    while (scanner.hasNextLine()) {
                        i++;
                        String row = scanner.nextLine();
                        if (row.equals("")) {
                            i = 0;
                        }
                        if (i == 1) {

                            System.out.print(row);
                        } else if (i == 2) {
                            System.out.print(", cooking time: " + Integer.valueOf(row));
                            System.out.print("\n");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (value.equals("find name")) {
                System.out.println("Searched word: ");
                String Search = scanner1.nextLine();
                int i = 0, flag = 0;
                try ( Scanner scanner = new Scanner(Paths.get(file))) {

                    while (scanner.hasNextLine()) {
                        i++;
                        String row = scanner.nextLine();
                        if (row.equals("")) {
                            i = 0;
                            flag = 0;
                        }
                        if (i != 2) {
                            flag = 0;
                        }
                        if (i == 1) {
                            if (row.contains(Search)) {
                                flag = 1;

                                System.out.print(row);
                            }
                        } else if (i == 2 && flag == 1) {
                            System.out.print(", cooking time: " + Integer.valueOf(row));
                            System.out.print("\n");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (value.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner1.nextLine());
                int i = 0, flag = 0;
                String old = "";
                try ( Scanner scanner = new Scanner(Paths.get(file))) {

                    while (scanner.hasNextLine()) {
                        i++;
                        String row = scanner.nextLine();
                        if (row.equals("")) {
                            i = 0;
                            flag = 0;
                            old = "";
                        }
                        if (i == 0) {
                            old = "";
                        }

                        if (i == 1) {
                            old = row;
                        } else if (i == 2) {

                            if (Integer.valueOf(row) <= time) {

                                System.out.print(old);
                                System.out.print(", cooking time: " + Integer.valueOf(row));
                                System.out.print("\n");

                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (value.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String incred = scanner1.nextLine();
                int i = 0;
                String old = "";
                System.out.println("Recipes:");
                try ( Scanner scanner = new Scanner(Paths.get(file))) {

                    while (scanner.hasNextLine()) {
                        i++;
                        String row = scanner.nextLine();
                        if (row.equals("")) {
                            i = 0;
                            old = "";
                        }
                        if (i == 0) {
                            old = "";
                        }

                        if (i == 1) {
                            old = row;
                        } else if (i == 2) {
                            old += ", cooking time: " + Integer.valueOf(row);
                        }else{
                            if(row.equals(incred)){
                                System.out.println(old); 
                           }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }

        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
