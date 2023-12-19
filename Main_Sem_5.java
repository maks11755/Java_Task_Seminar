// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
public class Main_Sem_5 {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.addNote("123456", "РРІР°РЅРѕРІ");
        passports.addNote("321456", "Р’Р°СЃРёР»СЊРµРІ");
        passports.addNote("234561", "РџРµС‚СЂРѕРІР°");
        passports.addNote("234432", "РРІР°РЅРѕРІ");
        passports.addNote("654321", "РџРµС‚СЂРѕРІР°");
        passports.addNote("345678", "РРІР°РЅРѕРІ");

        System.out.println(passports.findByName("РРІР°РЅРѕРІ"));
    }
}