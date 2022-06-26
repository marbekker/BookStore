import java.util.Arrays;
import java.util.Scanner;


// 3. Массив база данных, в себе хранит название книги и автора. Максимум длина массива 20 элементов.
// Написать консольное приложение, оно при запуске спросит как зовут пользователя и потом скажет привет и имя пользователя.
// Потом приложение предложит 4 функции на выбор (1. Посмотреть все книги что есть. 2. Добавить книгу. 3 Удалить книгу 4 Выйти)


public class BookStore {


        public static void displayBooks(String[] booksArray) {
            for (String i : booksArray) {
                if (i != null) {
                    System.out.println(i);
                }
            }
        }


        public static void main(String[] args) {

            String[] booksArray = new String[20];
            booksArray[0] = "Лев Толстой «Война и мир»";
            booksArray[1] = "Джордж Оруэлл «1984»";
            booksArray[2] = "Джейн Остен «Гордость и предубеждение»";
            booksArray[3] = "Владимир Набоков «Лолита»";
            booksArray[4] = "Гомер «Илиада»";
            booksArray[5] = "Данте Алигьери «Божественная комедия»";
            booksArray[6] = "Джонатан Свифт «Путешествия Гулливера»";
            booksArray[7] = "Джером Сэлинджер «Над пропастью во ржи»";
            booksArray[8] = "Маргарет Митчелл «Унесенные ветром»";
            booksArray[9] = "Габриель Гарсиа Маркес «Сто лет одиночества»";
            booksArray[10] = "Фрэнсис Скотт Фицджеральд «Великий Гэтсби»";
            booksArray[11] = "Олдос Хаксли «О дивный новый мир»";
            booksArray[12] = "Чарльз Дарвин «О происхождении видов»";
            booksArray[13] = "Карл Маркс «Капитал»";
            booksArray[14] = "Николо Макиавелли «Государь»";
            booksArray[15] = "Джон Толкин «Властелин колец»";
            booksArray[16] = "Харпер Ли «Убить пересмешника»";
            booksArray[17] = "Энтони Берджесс «Заводной апельсин»";
            booksArray[18] = "Гюстав Флобер «Госпожа Бовари»";
            booksArray[19] = "Уильям Шекспир «Гамлет»";


            Scanner input = new Scanner(System.in);


            //приветствие юзера
            String name;

            do {
                System.out.println("Введите Ваше имя");
                name = input.nextLine();
            } while (name.isEmpty());
            System.out.println("Здравствуйте, " + name);


            // отображение опций пользователю
            int userChoice = 0;

            while ( userChoice !=4) {
                System.out.println("Что хотите сделать? Выберите цифру");
                System.out.println("1. Посмотреть все книги");
                System.out.println("2. Добавить книгу");
                System.out.println("3. Удалить книгу");
                System.out.println("4. Выйти");

                userChoice = input.nextInt();
                input.nextLine();

                // 1. Функция "Посмотреть все книги"
                if (userChoice == 1) {
                    displayBooks(booksArray);
                }


                //2. Функция "Добавить книгу"
                else if (userChoice == 2) {
                    booksArray = Arrays.copyOf(booksArray, booksArray.length + 1);
                    System.out.println("Добавьте книгу в формате «Автор Название» (пр.Лев Толстой «Война и мир»)");
                    booksArray [booksArray.length-1] = input.nextLine();
                    System.out.println("Книга " + booksArray[booksArray.length-1] + " успешно добавлена");
                }


                //3. Функция "Удалить книгу"
                else if (userChoice == 3) {
                    System.out.println("Введите автора или название книги, которую хотите удалить");
                    String removeBook = input.nextLine();

                    for (int i = 0; i < booksArray.length; i++) {

                        if (booksArray[i] != null && booksArray[i].contains(removeBook)) {
                            System.out.println("Книга " + booksArray[i] + " успешно удалена");
                            booksArray[i] = null;
                        }
                    }
                }


                //4. Функция "Выйти"
                else if (userChoice == 4) {
                    System.out.println("До встречи!");
                } else {
                    System.out.println("Такой опции нет. Попробуйте еще раз");
                }
            }
        }
    }