import java.util.*;

Scanner sc = new Scanner(System.in);

int m = sc.nextInt();

LinkedHashSet<String> register = new LinkedHashSet<>();

for (int i = 0; i < m; i++) {
    register.add(sc.next());
}

for (String id : register) {
    System.out.print(id + " ");
}