import restaurant_bot.TableState;
import restaurant_bot.model.Customer;
import restaurant_bot.model.Table;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TableStateImpl implements TableState {
    private Map<Integer, Table> mapTable = new HashMap<>();

    public static void main(String[] args) {
        String path = "restaurant_bot";
        String fileName = "tables_status.txt";
        create_file(path, fileName);


    }


    @Override
    public boolean reserveTable(int id, LocalDateTime date, Customer customer) {
        return false;
    }

    @Override
    public boolean cancelReservation(int id) {
        return false;
    }

    @Override
    public void printFreeTables() {

    }

    @Override
    public void printReservedTables() {

    }
    public static void create_file(String p, String file_name) {
        try {
            File myFile = new File(p + file_name);
            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }
    public static HashMap<Integer, Table> getTableData(String path, String file_name) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path + file_name));
            Map<Integer, Table> map = new HashMap<>();
            String str = br.readLine();
            while (str != null){
                String[] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                boolean isReserved = arr[1].equals("0") ? false : true;
                LocalDateTime reservedFrom = arr[2].equals("0") ? LocalDateTime.now() : dateFormat.parse(arr[2].getText());
                map.put(id, new Table(id, isReserved, arr[2], arr[4]))
            }
            FileWriter myWriter = new FileWriter(path + file_name);

            // записываем статус столиков в файл
            for (Object i : map.keySet()) {
                String status = "";
                if (map.get(i).equals(true)) {
                    status = " зарезервирован ";
                } else {
                    status = " свободен ";
                }
                myWriter.write("Столик: " + i + " статус: " + status + '\n'); // запись в файл и переход на сл. строку
                // System.out.println();
            }
            myWriter.close();
            System.out.println("Успешная запись в файл.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }

}
