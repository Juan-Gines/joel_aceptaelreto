package Joel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cables {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {
            int cables = in.nextInt();
            Map<String, Integer> enchufes = new HashMap<String, Integer>();
            for (int j = 0; j < cables; j++) {
                String cable = in.next();
                for (int k = 0; k < cable.length(); k++) {
                    if (cable.charAt(k) == 'H') {
                        if (enchufes.containsKey("H")) {
                            enchufes.put("H", enchufes.get("H") + 1);
                        } else {
                            enchufes.put("H", 1);
                        }
                    } else if (cable.charAt(k) == 'M') {
                        if (enchufes.containsKey("M")) {
                            enchufes.put("M", enchufes.get("M") + 1);
                        } else {
                            enchufes.put("M", 1);
                        }
                    }
                }
            }
            if (enchufes.get("H") == enchufes.get("M")) {
                System.out.println("POSIBLE");
            } else {
                System.out.println("IMPOSIBLE");
            }
        }
        in.close();
    }
}
