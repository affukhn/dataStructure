package  com.other;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(10/0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long songs[] = new long[N];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            songs[i] = Long.parseLong(str[i]);
        }         int max = 0, count = 1;
        Map<Long, Long> map = new HashMap<Long, Long>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(songs[i])) {
                map.put(songs[i], map.get(songs[i]) + 1);
            } else {
                map.put(songs[i], (long) 1);
            }
        }
        Long maxValueInMap = (Collections.max(map.values()));
        System.out.println(maxValueInMap);
        int ans = Collections.frequency(new ArrayList<Long>(map.values()), maxValueInMap);
        System.out.println(ans);
        }
    }

