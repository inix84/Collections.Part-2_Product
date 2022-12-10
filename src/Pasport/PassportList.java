package Pasport;
import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<>();
    public void addPassport(Passport passport) throws PassportException
    { if (passport==null){
        return;
    }
        if (this.passports.contains(passport)) {
            throw new PassportException("Паспорт с такими данными уже есть");
        } else {
            this.passports.add(passport);
        }
    }
    public Passport findByNumber(int number) {
        for (Passport passport : this.passports) {
            if (passport.getNumber() == number) {

                return passport;
                }
                    }
        System.out.println("Паспорта с номером "+number+" в системе нет");
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список паспортов:").append('\n');
        for (Passport passport : this.passports) {
            stringBuilder.append(passports).append('\n');
        }
        return stringBuilder.toString();
    }
}
