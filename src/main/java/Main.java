public class Main {

    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        post.name = "Иван";
        post.passport = "444444444444";
        post.patronymic = "Иванович";
        post.pone = "8_923_554_44_50";
        post.surname = "Иванов";
        post.subscription = true;

        System.out.println(post.pone + " Ваш номер телефона");
    }

}








