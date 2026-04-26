import java.util.Scanner;
import java.util.Map;
import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.io.File;

public class Bai7 {
    public static String getName(String data) {
        int pos = data.indexOf('[');
        int pos2 = data.indexOf(']');
        return data.substring(pos + 1, pos2);
    }

    public static String printResult(Map<String, Integer> map) {
        StringBuilder result = new StringBuilder(); // String voi StringBuilder khac nhau o cho StringBuilder co the
                                                    // thay doi duoc gia tri con String thi khong the thay doi duoc gia
                                                    // tri
        result.append("---The table of goals---\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" goals\n");
        }
        return result.toString();
    }

    public static Map<String, Integer> docFile(String filename) {
        Map<String, Integer> map = new TreeMap<>();
        try (Scanner doc = new Scanner(new File(filename))) {
            while (doc.hasNextLine()) {
                String line = doc.nextLine();
                if (line.contains("[")) {
                    String name = getName(line);

                    if (map.containsKey(name)) {
                        map.put(name, map.get(name) + 1); // get : lấy ra số bàn thắng hiện tại của cầu thủ đó rồi cộng
                    } else {
                        map.put(name, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }

        return map;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = nhap.nextLine();
        Map<String, Integer> goalMap = docFile(filename);
        String result = printResult(goalMap);
        System.out.println(result);
        nhap.close();

    }
}
