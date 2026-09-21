package vn.edu.rikkei.session14.ex04;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- KIỂM DUYỆT TUỔI ỨNG VIÊN RIKKEI CAREERS ---");
        System.out.println("Ứng viên 1: 25 tuổi");
        System.out.println("Ứng viên 2: 16 tuổi");
        System.out.println("Ứng viên 3: 65 tuổi\n");

        CandidateService service = new CandidateService();
        int[] agesToTest = {25, 16, 65};

        System.out.println("+-------------------------------------------------+");
        System.out.println("|           HỆ THỐNG XÁC THỰC TUỔI ỨNG VIÊN       |");
        System.out.println("+-------------------------------------------------+");

        for (int i = 0; i < agesToTest.length; i++) {
            int currentAge = agesToTest[i];

            System.out.printf("| [UV %d - %d tuổi]: ", (i + 1), currentAge);

            try {
                service.validateAge(currentAge);
            } catch (InvalidAgeException e) {
                System.out.println("LỖI: " + e.getMessage() + " |");
            }
        }

        System.out.println("+-------------------------------------------------+");
    }
}
