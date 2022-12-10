package Pasport;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) //throws PassportException
    {
        PassportList passportList = new PassportList();
        Passport Pers1 = new Passport(12563239,"Иванов", "Иван", "Иванович", LocalDate.of(1984, 8, 31));
        Passport Pers2 = new Passport(125632354,"Михайлов", "Михаил", "Абрамович", LocalDate.of(1983, 8, 23));

        passportList.addPassport(Pers1);
        passportList.addPassport(Pers2);

        System.out.println(passportList);
        passportList.findByNumber(1256323925);
        System.out.println(Pers1);

    }
}