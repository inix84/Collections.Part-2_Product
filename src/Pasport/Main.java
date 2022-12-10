package Pasport;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws PassportException {
        Passport Pers1 = new Passport(12563239,"Иванов", "Иван", "Иванович", null);
        Passport Pers2 = new Passport(12563239,"Михайлов", "Михаил", "Абрамович", LocalDate.now());
        PassportList passportList = new PassportList();
        passportList.addPassport(Pers1);
        passportList.addPassport(Pers2);

        System.out.println(passportList);
        passportList.findByNumber(1234258569);
    }
}