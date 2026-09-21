package vn.edu.rikkei.session14.ex04;

public class CandidateService {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Tuổi ứng viên " + age + " không hợp lệ!");
        }
        System.out.printf("-> Xác thực tuổi thành công: %d \n", age);
    }
}
