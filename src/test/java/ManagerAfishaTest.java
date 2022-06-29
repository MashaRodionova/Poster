import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ManagerAfishaTest {

    AfishaItems item1 = new AfishaItems("Breaking Bad", "Serial");
    AfishaItems item2 = new AfishaItems("The Bridges of Madison County", "Melodrama");
    AfishaItems item3 = new AfishaItems("Twin Peaks", "Serial");
    AfishaItems item4 = new AfishaItems("My neighbor Totoro", "Anime");
    AfishaItems item5 = new AfishaItems("Nomadland", "Drama");
    AfishaItems item6 = new AfishaItems("Soul", "Cartoon");
    AfishaItems item7 = new AfishaItems("Forrest Gump", "Drama");
    AfishaItems item8 = new AfishaItems("Coco", "Cartoon");
    AfishaItems item9 = new AfishaItems("Pulp Fiction", "Criminal");
    AfishaItems item10 = new AfishaItems("The Lion King", "Cartoon");
    AfishaItems item11 = new AfishaItems("Sen to Chihiro no kamikakushi", "Anime");
    AfishaItems item12 = new AfishaItems("Shrek", "Cartoon");
    AfishaItems item13 = new AfishaItems("Sex Education", "Serial");


    //Тестируем добавление новых фильмов в афишу
    @Test
    public void test() {
        ManagerAfisha afisha = new ManagerAfisha();
        afisha.add(item7);
        AfishaItems[] expected = {item7};
        AfishaItems[] actual = afisha.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }


    //Тестируем вывод всех фильмов афиши в обратном от добавления порядке
    @Test
    public void test2() {
        ManagerAfisha afisha = new ManagerAfisha();
        afisha.add(item1);
        afisha.add(item11);
        afisha.add(item13);
        afisha.add(item7);
        afisha.add(item2);
        AfishaItems[] expected = {item2, item7, item13, item11, item1};
        AfishaItems[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        ManagerAfisha afisha = new ManagerAfisha();
        AfishaItems[] expected = {};
        AfishaItems[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // Тестируем вывод запрашиваемого количества (по умолчанию 10) последних
    // добавленных фильмов в обратном от добавления порядке

    @Test
    public void test4() {
        ManagerAfisha afisha = new ManagerAfisha();
        afisha.add(item1);
        afisha.add(item11);
        afisha.add(item13);
        afisha.add(item7);
        afisha.add(item2);
        AfishaItems[] expected = {item2, item7, item13, item11, item1};
        AfishaItems[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        ManagerAfisha afisha = new ManagerAfisha(7);
        afisha.add(item1);
        afisha.add(item11);
        afisha.add(item13);
        afisha.add(item7);
        afisha.add(item2);
        AfishaItems[] expected = {item2, item7, item13, item11, item1};
        AfishaItems[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        ManagerAfisha afisha = new ManagerAfisha();
        afisha.add(item1);
        afisha.add(item2);
        afisha.add(item3);
        afisha.add(item4);
        afisha.add(item5);
        afisha.add(item6);
        afisha.add(item7);
        afisha.add(item8);
        afisha.add(item9);
        afisha.add(item10);
        afisha.add(item11);
        afisha.add(item12);
        afisha.add(item13);
        AfishaItems[] expected = {item13, item12, item11, item10, item9, item8, item7, item6, item5, item4};
        AfishaItems[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        ManagerAfisha afisha = new ManagerAfisha(7);
        afisha.add(item1);
        afisha.add(item2);
        afisha.add(item3);
        afisha.add(item4);
        afisha.add(item5);
        afisha.add(item6);
        afisha.add(item7);
        afisha.add(item8);
        afisha.add(item9);
        afisha.add(item10);
        afisha.add(item11);
        afisha.add(item12);
        afisha.add(item13);
        AfishaItems[] expected = {item13, item12, item11, item10, item9, item8, item7};
        AfishaItems[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
