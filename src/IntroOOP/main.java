package IntroOOP;

public class main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Генеральный директор","bigboss@gmail.com","89098283843",728900, 43);
        persArray[1] = new Person("Петров Петр Петрович","Арт-продюсер","Petrpetro@mail.ru", "89084356767",99900, 24);
        persArray[2] = new Person("Александров Александр Александрович","Топ менеджер","lexlex@mail.ru", "89081267890",229900, 44);
        persArray[3] = new Person("Алексеев Алексей Алексеевич","Специалист по безопасности","alexalex@mail.ru", "8908234567",129900, 27);
        persArray[4] = new Person("Piter Dennis Parker","Сантехник","spiderman@yahoo.com", "89546872567",29900, 64);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40){
                persArray[i].Information();
                System.out.println();
            }
        }
    }


}
