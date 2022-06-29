public class AfishaRepository {
    private AfishaItems[] items = new AfishaItems[0];

    private int countOfItems;

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

    public AfishaRepository() {
        this.countOfItems = 10;
    }

    public AfishaRepository(int amount) {
        this.countOfItems = amount;
    }

    public void save(AfishaItems item) {
        AfishaItems[] tmp = new AfishaItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public AfishaItems[] getItems() {
        return items;
    }

    public AfishaItems[] findAll() {
        AfishaItems[] reversed = new AfishaItems[items.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

    public AfishaItems findById(String id) {
        AfishaItems search = null;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() == id) {
                search = items[i];
            }
        }
        return search;
    }

    public void removeById(String id) {
        AfishaItems[] tmp = new AfishaItems[items.length - 1];
        int copyToIndex = 0;
        for (AfishaItems item : items) {
            if (item.getName() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public AfishaItems[] removeAll() {
        AfishaItems[] tmp = new AfishaItems[items.length];
        items = tmp;
        return items; //что-то тут не ясно. Вроде достаточно типа void для  метода, то тогда тестовый класс ругается
    }
}






