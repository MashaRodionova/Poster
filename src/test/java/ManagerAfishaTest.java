import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class ManagerAfishaTest {
    AfishaRepository repo = Mockito.mock(AfishaRepository.class);
    ManagerAfisha manager = new ManagerAfisha(repo);

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

    @Test
    public void test1() {
        AfishaItems[] items = {item9, item8, item10, item1, item4, item2, item5, item3, item12, item13};
        doReturn(items).when(repo).getItems();

        AfishaItems[] expected = {item13, item12, item3, item5, item2, item4, item1};
        AfishaItems[] actual = manager.findLast(7);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        AfishaItems[] items = {item9, item8, item10};
        doReturn(items).when(repo).findAll();

        AfishaItems[] expected = {item9, item8, item10};
        AfishaItems[] actual = manager.managerFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
