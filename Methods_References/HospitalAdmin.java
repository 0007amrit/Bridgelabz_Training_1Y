package Methods_References;

import java.util.Arrays;
import java.util.List;

public class HospitalAdmin {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("Pat-101","Pat-102","Pat-103");

        System.out.println("------Admin Verification list ------");
        patientIds.forEach(System.out::println);
    }
}
